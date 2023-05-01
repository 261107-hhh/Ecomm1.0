package com.ecom.User;
import org.apache.catalina.startup.UserConfig;
import org.junit.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.Optional;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.ecom.Controller.UserController;
import com.ecom.Model.User;
import com.ecom.Repository.UserRepository;
import com.ecom.Service.UserService;
import com.ecom.payload.ApiResponse;
import com.ecom.payload.UserDto;

//@RunWith(SpringRunner.class)
//@AutoConfigureTestDatabase(replace=Replace.NONE)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserTest {

	@Autowired
	private UserController usrController;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserService userService;
	
	static UserDto user;
	Date curr = new Date();	
	static int id;
	static String mail;
	@Test
	@Order(1)
	void testA() {
		user = new UserDto("Himanshu","himmi@gmail","123","Hld", "GET","male",
				curr, true,"1234567890");
//		user = new UserDto();
//		user.setName("hima");
//		user.setEmail("himmi@gmail");
//		user.setPassword("123");
		ResponseEntity<UserDto> u1 = usrController.createUser(user);
		assertEquals(u1.getStatusCode(), HttpStatus.CREATED);
		id = u1.getBody().getUserId();
		mail = u1.getBody().getEmail();
//		UserDto u1 = userService.create(user);
//		user.setUserId(u1.getUserId());
//		System.out.println(user.getUserId()+" This is the user id");
//		Optional<User> actRes = userRepository.findByEmail("himmii@gmail");
//		assertThat(actRes.get().getEmail()).isEqualTo("himmii@gmail");
	}
	
	@Test
	@Order(2)
	void testB() {
//		user = new UserDto("Himanshu","himmi@gmail","123","Hld", "GET","male",
//	curr, true,"1234567890");
//		userService.create(user);
		Optional<User> actRes = userRepository.findByEmail(mail);
		if(!actRes.isEmpty()) {
			assertThat(actRes.get().getEmail()).isEqualTo(mail);
			System.out.println("user with mail id "+ actRes.get().getEmail()+" found in repository");
		}
		else {
			assertThat(actRes).isEmpty();
			System.out.println("No user with mail id found in repository: "+mail);
		}
	}
	
	@Test 
	@Order(3)
	void testC() {
		
//		ResponseEntity<ApiResponse> u1 = usrController.delete(id);
//		assertEquals(u1.getStatusCode(), HttpStatus.OK);
		
		
		System.out.print(id+" hi this is user id");
		 userService.delete(id);
//		 userService.delete(1);
		 Optional<User> actRes = userRepository.findByEmail(mail);
//		 assertEquals(actRes, );
		 assertThat(actRes).isEmpty();	
		 System.out.println("user with mail id delete");
	}
	
	
}

	