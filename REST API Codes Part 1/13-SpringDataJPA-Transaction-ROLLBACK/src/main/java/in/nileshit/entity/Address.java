package in.nileshit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "EMP_ADDRESS_TABLE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    
	@Id
	private Integer addressId;
	private String city;
	private String state;
	private String country;
	private Integer empId;;

}
