package in.nileshit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nileshit.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Serializable> {

}
