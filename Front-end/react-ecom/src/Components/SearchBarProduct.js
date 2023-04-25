// import React, { useEffect } from 'react'
// // import { login } from '../auth'
// import { addItemToCart as addCart } from '../Service/cartService'
// import { toast } from 'react-toastify'
// import Product from './Product'
// import { Row, Col, ListGroup, ListGroupItem, Card, Alert } from "reactstrap"


// import { loadProductByCategory, loadProducts, searchProduct } from '../Service/product-service'
// import { loadCategories } from '../Service/category-service'
// import { useState } from 'react'
// import { Link, useParams } from 'react-router-dom'
// import InfiniteScroll from 'react-infinite-scroll-component'


// export default function SearchBarProduct({val}) {

//     const { categoryId } = useParams(1)
//     const [categories, setCategories] = useState(null)
//     const [productDetails, setProductDetails] = useState(null)
//     const [pageNumber, setPageNumber] = useState({ count: 0 })
//     const [flag, setFlag] = useState(true)


//     useEffect(() => {
//         if (flag === true) {
//             console.log("intial Time")
//             // getCategories();
//             setFlag(false)
//         } else {
//             console.log("not intial Time")
//             setProductDetails(null)
//             setPageNumber({ count: 0 })
//         }
//         //console.log(categoryId)
//     }, [categoryId])

//     setTimeout(
//     useEffect(() => {
//         // console.log(val+" hi there")
//         // console.log("page Number:"+pageNumber.count)
//         // getProduct(pageNumber.count)
//         searchProduct(val)
//     }, []),30000)

//     const getProduct = (pageNumber) => {
//         let ob = null;
//         // if (categoryId === 'all') {
//         // //   ob = loadProducts(pageNumber)
//         // } else {
//         //   ob = loadProductByCategory(categoryId, pageNumber)
//         ob = searchProduct(val)
//         // }
//         ob.then(data => {
//             console.log(data)
//             if (productDetails) {
//                 setProductDetails({
//                     content: [...productDetails.content, ...data.content],
//                     lastPage: data.lastPage,
//                     pageNumber: data.pageNumber,
//                     pageSize: data.pageSize,
//                     totalElement: data.totalElement,
//                     totalPage: data.totalPage
//                 })
//             } else {
//                 setProductDetails(data)
//             }


//         }).catch(error => {
//             console.log(error)
//         })
//         // console.log(productDetails)
//         //console.log(productDetails.content.length)
//     }

//     // const getCategories = () => {
//     //     loadCategories().then(data => {
//     //         setCategories(data)
//     //     }).catch(error => {
//     //         console.log(error)
//     //     })
//     // }
//     // const loadMoreComponent = () => {
//     //     console.log("loding More")
//     //     setPageNumber({ count: pageNumber.count + 1 })
//     // }
//     //add item to cart
//     // const addItemToCart = (product) => {
//     //     console.log(product);
//     //     addCart(product.productId, 1).then(data => {
//     //         console.log(data)
//     //         toast.success("Item add to Cart")
//     //     }).catch(error => { console.log(error) })
//     // }

//     const getInfiniteScrollWithContent = () => {
//         return (<InfiniteScroll
//             dataLength={productDetails.content.length}
//             next={loadMoreComponent}
//             hasMore={!productDetails.lastPage}
//             loader={<h4>Loading...</h4>}
//         >

//             <Row>

//                 {
//                     (productDetails) &&
//                     productDetails.content.map((item, index) => (
//                         <Col md="6" lg="4" >
//                             <Product key={index} addToCart={addItemToCart} product={item} />
//                         </Col>
//                     ))
//                 }

//             </Row>
//         </InfiniteScroll>)


//     }

//     // console.log(productDetails)
//     return (
//         <div>
//             <h1>Hi there</h1>
//             {productDetails && getInfiniteScrollWithContent()}


//         </div>
//     )
// }