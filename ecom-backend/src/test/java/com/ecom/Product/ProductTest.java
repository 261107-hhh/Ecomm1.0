//package com.ecom.Product;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
////import org.junit.Assert;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
////import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.core.annotation.Order;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.ecom.Repository.ProductRepository;
//import com.ecom.Service.ProductService;
//import com.ecom.payload.ProductDto;
//
//
//
////@RunWith(SpringRunner.class)
//@AutoConfigureTestDatabase(replace=Replace.NONE)
//@SpringBootTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class ProductTest {
//
//	
//	@Autowired
//	private	ProductService productService;
//	
//	@Autowired
//	private ProductRepository productRepository;
//	
//	static ProductDto product;
//	static int id;
////	int flag= 0;
//	@Test
////	@Rollback(false)
//	@Order(1)
//	void testA() {
//		
//		System.out.println(" This is the product id for the newly saved/created product");
//		product = new ProductDto("Gold","10Grm Gold coin", 59990, true, 12, true);
//		ProductDto p1 = productService.createProduct(product, 3);
//		id = p1.getProductId();
//		product.setProductId(id);
//		assertThat(p1.getProductName()).isEqualTo("Gold");
//		System.out.println("product saved/created and is checked with id :"+id);
////		flag = 1;
////		int res = productService.deleteProduct(id);
////		assertThat(res).isEqualTo(0);
////		deleteProduct(id);
////		System.out.println(" product deleted ");
////		Product p =  productRepository.getReferenceById(id);
////		Optional<Product> p =  productRepository.findById(51);
////		System.out.println(product.getProductId()+"<- Product id: "+ 51);
////		assertThat(p.getProductName()).isEqualTo(p1.getProductName());
//		
//	}
//
////	@Test
////	@Rollback(false)
////	@Order(2)
////	void deleteProduct(int id) {
//////		Optional<Product> p =  productRepository.findById(id);
//////		System.out.println(p.get().getProductId()+" here is the id");
//////		System.out.println(id+" no id");
//////		
////		int res = productService.deleteProduct(id);
////		assertThat(res).isEqualTo(0);
////		System.out.println(" product deleted for id: "+id);
//////		int id = product.getProductId();
//////		int res = productService.deleteProduct(id);
//////		assertThat(res).isEqualTo(0);
////		//findById productRepository.delete(p);
////	}
//	@Test
//	@Order(2)
//	void testB(){
////		Optional<Product> p =  productRepository.findById(id);
////		System.out.println(p.get().getProductId()+" here is the id");
////		System.out.println(id+" no id");
////		Thread.sleep(10000);
////		if(flag==1) {
//			int res = productService.deleteProduct(id);
//			assertThat(res).isEqualTo(0);
//			System.out.println(" product deleted for id: "+id);			
////		}
////		else {
////			Thread.sleep(1000);
////			deleteProduct(id);
////		}
//	}
//	
////	void deleteProduct(int id) {
////		int res = productService.deleteProduct(id);
////		assertThat(res).isEqualTo(0);
////		System.out.println(" product deleted for id: "+id);	
////	}
//	
//}
