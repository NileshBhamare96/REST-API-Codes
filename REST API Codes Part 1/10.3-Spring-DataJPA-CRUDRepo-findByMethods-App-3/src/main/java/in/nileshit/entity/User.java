package in.nileshit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER_MASTER_2")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@Column(name = "USER_ID")
	private Integer userid;

	@Column(name = "USER_NAME")
	private String username;

	@Column(name = "USER_GENDER")
	private String gender;

	@Column(name = "USER_AGE")
	private Integer age;

	@Column(name = "USER_COUNTRY")
	private String country;

	public User() {

	}

	// Manually added constructor
	public User(Integer userid, String username, String gender, Integer age, String country) {
		this.userid = userid;
		this.username = username;
		this.gender = gender;
		this.age = age;
		this.country = country;
	}

	public String toString() {
		return "User{" + "id=" + userid + ", name='" + username + '\'' + ", gender='" + gender + '\'' + ", age=" + age
				+ ", country='" + country + '\'' + '}';
	}

}
