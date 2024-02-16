package in.nileshit.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import in.nileshit.entity.Account;
import in.nileshit.entity.AccountPK;
import in.nileshit.repo.AccountRepository;

@Service
public class AccountService {
	

	private AccountRepository accRepo;
    
	// dependency injection happened //only one ctor no need to define @Autowired annotation
	public AccountService(AccountRepository accRepo) {
		this.accRepo = accRepo;
	}

	public void getDataUsingPK() {

		AccountPK pk = new AccountPK();
		pk.setAccId(101);
		pk.setAccType("SAVINGS");
		pk.setHolderName("Nilesh Bhamare");

		Optional<Account> findById = accRepo.findById(pk);
		if (findById.isPresent()) {
			System.out.println(findById.get());
		}
	}

	public void saveAccData() {
		AccountPK pk = new AccountPK();
		pk.setAccId(101);
		pk.setAccType("SAVINGS");
		pk.setHolderName("Nilesh Bhamare");

		Account acc = new Account();
		acc.setBranchName("Nampur");
		acc.setMinBal(5000.00);

		acc.setAccPk(pk); // setting pk class obj to entity obj

		accRepo.save(acc);
	}
}




