package in.nileshit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.nileshit.entity.User;

public interface userRepository extends CrudRepository<User, Integer> {
	
	@Query(value = "From User")
	public List<User> getAllUsersHql();

	@Query(value = "select * from user_master", nativeQuery = true)
	public List<User> getAllUsersSql();

	@Query(value = "From User where country=:cname")
	public List<User> getAllUsersByCountry(String cname);

	@Query(value = "From User where country=:cname and age=:age")
	public List<User> getAllUsersByCountryAndAge(String cname, Integer age);
	
	
	//select user_name where country In ("India","England","Pakistan" where age >= 23 ;
	@Query("SELECT u.username FROM User u WHERE u.country IN (:countries) AND u.age >= :minAge")
	List<String> findUserNamesByCountryAndAge(List<String> countries, int minAge);

}