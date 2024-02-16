package in.nileshit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "User_CusromQueries")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@Column(name = "USER_ID")
	private Integer id;

	@Column(name = "USER_NAME")
	private String name;

	@Column(name = "USER_AGE")
	private Integer age;

	@Column(name = "USER_GENDER")
	private String gender;

	@Column(name = "USER_COUNTRY")
	private String country;

}
