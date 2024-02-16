package in.nileshit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nileshit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
