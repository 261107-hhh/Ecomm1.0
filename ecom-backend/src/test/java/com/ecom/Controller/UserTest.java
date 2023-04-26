package com.ecom.Controller;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ecom.Model.User;
import com.ecom.Repository.UserRepository;
import com.ecom.Service.UserService;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace=Replace.NONE)
@SpringBootTest
public class UserTest {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserService userService;
	
	Date curr = new Date();
	static User user;
	@Test
	void createUser() {
		user = new User("Himanshu","himmi@gmail","123","Hld", "GET","male","1234567890",
				curr, true);
		userRepository.save(user);
		Optional<User> actRes = userRepository.findByEmail("himmi@gmail");
		assertThat(actRes.get().getEmail()).isEqualTo("himmi@gmail");
	}
	
	@Test 
	void deleteUser() {
		System.out.print(user.getUserId()+" hi this is user id");
		 userService.delete(user.getUserId());
		 Optional<User> actRes = userRepository.findByEmail("himmi@gmail");
//		 assertEquals(actRes, );
		 assertThat(actRes).isEmpty();	
	}
	
	@Test
	void getUserByEmail() {
//		user = new User("Himanshu","himmi@gmail","123","Hld", "GET","male","1234567890",
//				curr, true);
//		userRepository.save(user);
		Optional<User> actRes = userRepository.findByEmail("asa@asd");
		if(!actRes.isEmpty()) {
			assertThat(actRes.get().getEmail()).isEqualTo("asd@asd");
			System.out.println("user with mail id "+ actRes.get().getEmail()+" found in repository");
		}
		else {
			assertThat(actRes).isEmpty();
			System.out.println("No user with mail id found in repository");
		}
	}
}

	