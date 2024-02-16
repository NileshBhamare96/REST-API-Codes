package in.nileshit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.nileshit.Entity.Player;
import in.nileshit.Repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	 ConfigurableApplicationContext context =	 SpringApplication.run(Application.class, args);
	 
	 PlayerRepository  playerRepository  = context.getBean(PlayerRepository.class);
	 
	 Player p1 = new Player();
	 
	 p1.setPlayerId(11);
	 p1.setPlayerName("Pathirana");
	 p1.setPlayerAge(23);
	 p1.setLocation("Shrilanka");
	 
	 //playerRepository.save(p1);
	 
	
	 
	// playerRepository.deleteById(11);
	 
	// System.out.println("Record Inserted....");
	// System.out.println( playerRepository.count());
	// System.out.println(  playerRepository.existsById(12));
	 
	 
	 
	}

}
