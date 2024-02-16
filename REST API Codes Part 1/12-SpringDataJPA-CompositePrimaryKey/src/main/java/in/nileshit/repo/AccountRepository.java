package in.nileshit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nileshit.entity.Account;
import in.nileshit.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}
