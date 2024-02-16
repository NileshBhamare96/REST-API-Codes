package in.nileshit.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.nileshit.Entity.Player;

//@Repository  - already extends JPA repository
public interface PlayerRepository extends CrudRepository<Player , Integer>{

}
