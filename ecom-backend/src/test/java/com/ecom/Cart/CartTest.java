//package com.ecom.Cart;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.mock;
//import static org.mockito.Mockito.when;
//
//import java.security.Principal;
//import java.util.Date;
//import java.util.Optional;
//
//import org.junit.FixMethodOrder;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.core.annotation.Order;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.ecom.Controller.cartController;
//import com.ecom.Model.User;
//import com.ecom.Repository.ProductRepository;
//import com.ecom.Repository.UserRepository;
//import com.ecom.Service.CartService;
//import com.ecom.Service.ProductService;
//import com.ecom.Service.UserService;
//import com.ecom.Service.Imp.CartServiceImp;
//import com.ecom.payload.CartDto;
//import com.ecom.payload.ItemRequest;
//import com.ecom.payload.ProductDto;
//import com.ecom.payload.UserDto;
//
//
//@RunWith(SpringRunner.class)
////@AutoConfigureTestDatabase(replace=Replace.NONE)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@SpringBootTest
////@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class CartTest {
//
//	@Autowired
//	private CartService cartService;
//	@Autowired
//	private cartController cartController;
//	@Autowired
//	private UserRepository userRepository;
//	@Autowired
//	private UserService userService;
////	@Autowired
////	@Mock
//	private Principal principal;
//	
//	@Autowired
//	private	ProductService productService;
//	
//	@Autowired
//	private ProductRepository productRepository;
//	
//	public CartDto cart;
//	public UserDto user;
//	Date curr = new Date();	
//	public ProductDto product;
//	
//	static int id;
//	
////	@BeforeEach
////	void setUp() {
////		cartService = mock(CartService.class);
////		principal = mock(Principal.class);
////		cartController = new cartController();
//////		cartController.
////	}
//	
//	@Test
//	@Order(1)
//	void testA() {
////		CartDto addItem = this.cartservice.addItem(itemRequest, principal.getName());
//
////		Creating User
//		user = new UserDto("Himanshu","himmi@gmail","123","Hld", "GET","male",
//				curr, true,"1234567890");
//		UserDto u1 = userService.create(user);
//		user.setUserId(u1.getUserId());
//		String mail = user.getEmail();
////		Creating Product
//		
//		System.out.println(" This is the product id for the newly saved/created product");
//		product = new ProductDto("Gold","10Grm Gold coin", 59990, true, 12, true);
//		ProductDto p1 = productService.createProduct(product, 3);
//		id = p1.getProductId();
//		product.setProductId(id);
//		assertThat(p1.getProductName()).isEqualTo("Gold");
//		System.out.println("product saved/created and is checked with id :"+id);
//		
////		Adding product to the users cart.
//		
//		ItemRequest item = new ItemRequest(id,10);
////		item.setProductId(id);
////		item.setQuantity(1);
//		System.out.println(item.getProductId()+" Product id");
//		System.out.println(item.getQuantity()+" Product Quantity");
//		
//		System.out.println(mail+" Mail id of the user");
////		System.out.println(cart.getUser().getEmail()+" Mail id of the user");
//		cart = cartService.addItem(item, mail);
//		assertThat(cart.getUser().getEmail()).isEqualTo(user.getEmail());
//		assertThat(cart.getIteam()).isEqualTo(item);
////		assertThat(actRes.get().getEmail()).isEqualTo("himmi@gmail");
////		ResponseEntity<CartDto> res = new cartController().addItem(item, principal);
////		assertEquals(res.,);
////		CartDto cart1 = new CartDto();
////		when(cartService.addItem(item, principal.getName())).thenReturn(cart1);
//		
////		ResponseEntity<CartDto> res = new cartController().addItem(item, principal);
////		
////		assertEquals(HttpStatus.OK, res.getStatusCode());
//		int res = productService.deleteProduct(id);
//		assertThat(res).isEqualTo(0);
//		System.out.println(" product deleted for id: "+id);		
//		userService.delete(user.getUserId());
//		Optional<User> actRes = userRepository.findByEmail(mail);
//		assertThat(actRes).isEmpty();	
//		System.out.println("user with mail id delete");
//	}
//	
//	
//}
//
//	