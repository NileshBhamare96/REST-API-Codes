package in.nileshit.repository;

import org.springframework.data.repository.CrudRepository;

import in.nileshit.entity.User;

public interface userRepository extends CrudRepository<User, Integer> {

}
