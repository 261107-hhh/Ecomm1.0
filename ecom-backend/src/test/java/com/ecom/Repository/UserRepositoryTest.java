package com.ecom.Repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ecom.Model.User;
import com.ecom.Service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserService userService;
	Date curr = new Date();
	
	@Test
	void findByEmail() {
		User user = new User("Himanshu","himmii@gmail","123","Hld", "GET","male","1234567890",
				curr, true);
//		System.out.println("Hi there test");
		userRepository.save(user);
//		user.getUserId();
//		user.setUserId(user.getUserId());
		Optional<User> actRes = userRepository.findByEmail("himmii@gmail");
//		assertThat(actRes).isEqualTo(user);
//		System.out.println(actRes.+" Hi there");
		assertThat(actRes.get().getEmail()).isEqualTo("himmii@gmail");
//		assertEquals(actRes.get(), );
		userService.delete(user.getUserId());
	}

}
