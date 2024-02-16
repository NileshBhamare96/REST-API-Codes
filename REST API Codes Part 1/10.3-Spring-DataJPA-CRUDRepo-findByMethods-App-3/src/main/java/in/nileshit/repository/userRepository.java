package in.nileshit.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.nileshit.entity.User;

public interface userRepository extends CrudRepository<User, Integer> {

	// select * from user_master where country = ? ;
	public List<User> findByCountry(String country);

	// select * from user_master where age = 40 ;
	public List<User> findByAge(Integer age);

	// select * from user_master where age < ? ;
	public List<User> findByAgeIsLessThan(Integer age);

	// select * from user_master where gender = ? ;
	public List<User> findByGender(String gender);

	// select * from user_master where age >= ? ;
	public List<User> findByAgeGreaterThanEqual(Integer age);

	// select * from user_master where country in(? , ?, ?)
	public List<User> findByCountryIn(List<String> countries);

	// select * from user_master where country = "India " AND age = 40 ;
	public List<User> findByCountryAndAge(String cname, Integer age);

	// select * from user_master where country = "India " AND age = 40 AND gender
	// ="Male ;
	public List<User> findByCountryAndAgeAndGender(String cname, Integer age, String gender);

}
