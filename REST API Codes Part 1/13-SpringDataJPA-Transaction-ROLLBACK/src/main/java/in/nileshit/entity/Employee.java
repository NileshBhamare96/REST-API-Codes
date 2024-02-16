package in.nileshit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "EMPLOYEE_TABLE")
public class Employee {

	@Id
	private Integer empID;
	private String empName;
	private Double empSal;

}
