//package com.ecom.Repository;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertEquals;
//
//import java.util.Date;
//import java.util.Optional;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.core.annotation.Order;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.ecom.Model.User;
//import com.ecom.Service.UserService;
//import com.ecom.payload.UserDto;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
////@AutoConfigureTestDatabase(replace=Replace.NONE)
//@ExtendWith(MockitoExtension.class)
//public class UserRepositoryTest {
//
//	@Autowired
////	@Mock
//	private UserRepository userRepository;
//	
//	@Autowired
////	@Mock
//	private UserService userService;
//	Date curr = new Date();
////	@Mock
//	static public UserDto user;
//	
//	
//	@Test
//	void testB() {
//		user = new UserDto("Himanshu","himmi@gmail","123","Hld", "GET","male",
//				curr, true,"1234567890");		
//		UserDto u1 = userService.create(user);
//		String mail = u1.getEmail();
//		int id = u1.getUserId();
//		user.setUserId(id);		
//		Optional<User> actRes = userRepository.findByEmail(mail);
//		if(!actRes.isEmpty()) {
//			assertThat(actRes.get().getEmail()).isEqualTo(mail);
//			System.out.println("user with mail id "+ actRes.get().getEmail()+" found in repository");
//			userService.delete(id);
//		}
//		else {
//			assertThat(actRes).isEmpty();
//			System.out.println("No user with mail id found in repository");
//		}
//	}
//
//}
