package in.nileshit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.nileshit.entity.Address;
import in.nileshit.entity.Employee;
import in.nileshit.repo.AddressRepository;
import in.nileshit.repo.EmployeeRepository;


@Service
public class EmployeeService {

	private EmployeeRepository empRepo;
	private AddressRepository addrRepo;
    
	@Autowired  // no need
	public EmployeeService(EmployeeRepository empRepo, AddressRepository addrRepo) {
		super();
		this.empRepo = empRepo;
		this.addrRepo = addrRepo;
	}
	
	@Transactional(rollbackFor = Exception.class)  //Othervise emp data will insert but not address data
	public void saveData()
	{
		Employee emp = new Employee();
		emp.setEmpID(102);
		emp.setEmpName("Raju Bhamare");
		emp.setEmpSal(35000.00);
		empRepo.save(emp);
		
		int Ino = 10/0 ;
		
		Address addr = new Address();
		addr.setAddressId(202);
		addr.setCity("Nampur");
		addr.setState("Maharashtra");
		addr.setCountry("India");
		addr.setEmpId(102);
		addrRepo.save(addr);
	}

}
