package in.nileshit.service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nileshit.entity.User;
import in.nileshit.repo.UserRepository;
import lombok.Data;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public void saveUser() throws Exception {
		String imagePath = "D:\\Resume\\Nilesh.jpeg";
		long size = Files.size(Paths.get(imagePath));

		byte arr[] = new byte[(int) size];

//		FileInputStream fis = new FileInputStream(new File(imagePath));
//		fis.read(arr);
//		fis.close();

		User user = new User();
		user.setUserEmail("nilesh@gmail.com");
		user.setUserName("Nilesh");
		user.setUserImage(arr);  

		userRepo.save(user);
	}
}
