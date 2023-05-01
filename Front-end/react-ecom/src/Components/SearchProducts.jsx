// import React from 'react'

// import Base from "./Base"
// import {Row,Col,Card, CardBody, CardText, Button, Container} from 'reactstrap'
// import { useNavigate, useParams } from "react-router-dom"
// import {loadSingleProduct, searchProduct} from '../Service/product-service'
// import { useEffect } from "react"
// import { useState } from "react"
// import { Base_url } from '../Service/axios-helper'
// // import { Link } from 'react-router-dom'
// // import {addItemToCart} from '../Service/cartService'
// // import { toast } from "react-toastify"

 
// function SearchProducts(data) {
//     let imagesStyle={
//         width:'100%',
//         height:'300px',
//         objectFit:'contain',
//         margin:'15px 0'
//     }
//     const[product,setProduct]=useState(null)
//     useEffect(()=>{
       
//         searchProduct(data.productName).then(data=>{
//          setProduct(data)
        
//         }).catch(error=>{
//             console.log(error)
//         })
//     },[])

//     const productHtml=()=>{
//         return(
//             <Row>
               
//         <Col>
            
//            {product && ( <Card>
//             {/* { console.log(product)} */}
//                  <CardBody>
//                  <h1>{product.productName}</h1>
//                  <img style={imagesStyle} src={Base_url+'/products/images/'+product.productId} alt="" />
//                    <CardText><h3>₹{product.productPrize}</h3></CardText>
//                    <CardText dangerouslySetInnerHTML={ {__html:product.productDesc} } ></CardText>
//                   <CardText></CardText>
//                  </CardBody>
//                  <div className="text-center">
//                  {/* <Button size="lg" color="primary" onClick={goStore}>Back</Button>
//                  <Button size="lg"  style={{marginLeft:'30px'}} color="success" onClick={CardButton} >Add To Card</Button> */}
//                  </div>
//             </Card>)}
             
//         </Col>
//     </Row>
//         )
//     }


//     console.log(data+" sdadasda")
//     return(
//         <Base>
//         <Container> 
//          <br></br>
//           {product &&(product.stock?productHtml():<h1 className="text-center text-danger my-5">Product is Out Of stock</h1>)     
//           }
//           </Container>
//           </Base>
//     )
// }
//     export default SearchProducts;
//     // const getProductHtml = () => {
//     //     return (
//     //         <Card className='mt-2 border-0 shadow-sm' style={{ 'width': '100%' }}>

//     //             <div style={{ 'width': '100%', 'height': '300px', 'marginBottom': '0px' }}>
//     //                 <img style={imagesStyle} src={Base_url + '/products/images/' + product.productId} alt="" />
//     //             </div>
//     //             <CardBody style={{ 'padding': '0px 0px 0px 19px;' }}>
//     //                 <h5>{product.productName.slice(0, 10)}</h5>
//     //             </CardBody>
//     //             <CardText style={{ 'margin-left': '14px', 'margin-bottom': '1px' }} dangerouslySetInnerHTML={{ __html: product.productDesc.slice(0, 110) }}>

//     //             </CardText>

//     //             <CardText style={{
//     //                 'fontSize': '22px', 'margin-bottom': '1px'
//     //             }}  >

//     //                 <span>

//     //                     {product.category.title}
//     //                 </span>
//     //             </CardText>
//     //             <CardText style={{ 'margin-bottom': '1px' }}><h5>Prize:₹{product.productPrize}</h5></CardText>
//     //             <Container className='text-'>
//     //                 <Button tag={Link} to={'/viewproduct/' + product.productId} size='sm' className='my-3' color='success' >View Product</Button>

//     //                 <Button onClick={(event) => (checkLogin()) ? (addToCart(product)) : toast.error("Login Please then add to cart")} size='sm' className='ms-4' color={product.stock ? 'primary' : 'danger'} >{product.stock ? 'Add to Cart' : 'out of stock'}</Button>

//     //             </Container>
//     //         </Card>

//     //     )
//     // }
// //     return (
// //     <>
// //         <br></br>
// //         {/* {(data) && getProductHtml()} */}
// //     </>
// //     )
// // }
// // export default SearchProducts;


// // import React from 'react'

// // function SearchProducts() {
// //   return (
// //     <div>
      
// //     </div>
// //   )
// // }

// // export default SearchProducts
