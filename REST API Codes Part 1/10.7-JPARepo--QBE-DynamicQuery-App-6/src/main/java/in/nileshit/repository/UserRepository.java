package in.nileshit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nileshit.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
