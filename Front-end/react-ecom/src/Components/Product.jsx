import { margin } from '@mui/system'
import React, { useContext } from 'react'
import { Link, useNavigate } from 'react-router-dom'
import { toast } from 'react-toastify'
import { Button, Card, CardBody, CardText, Container } from 'reactstrap'
import { checkLogin, getCurrentUser } from '../auth'
import { Base_url } from '../Service/axios-helper'
import { context1 } from './Context'

function Product({ product, addToCart }) {

    const navigate = useNavigate()
    let imagesStyle = {
        width: '100%',
        height: '100%',
        objectFit: 'contain',
        margin: '15px 0px 0px 0px'
    }

    const getProductHtml = () => {
        return (
            <Card className='mt-2 border-0 shadow-sm'  style={{ 'width': '100%'}}>

                <div style={{ 'width': '100%', 'height': '300px', 'marginBottom':'0px' }}>
                    <img style={imagesStyle} src={Base_url + '/products/images/' + product.productId} alt="" />
                </div>
                <CardBody style={{ 'padding': '0px 0px 0px 19px;' }}>
                    <h5>{product.productName.slice(0, 10)}</h5>
                </CardBody>
                <CardText style={{ 'margin-left': '14px', 'margin-bottom': '1px' }} dangerouslySetInnerHTML={{ __html: product.productDesc.slice(0, 110) }}>

                </CardText>

                <CardText style={{'fontSize':'22px','margin-bottom': '1px'
                }}  >

                    <span>

                        {product.category.title}
                    </span>
                </CardText>
                <CardText  style={{'margin-bottom': '1px'}}><h5>Prize:₹{product.productPrize}</h5></CardText>
                <Container className='text-'>
                    <Button tag={Link} to={'/viewproduct/' + product.productId} size='sm' className='my-3' color='success' >View Product</Button>

                    <Button onClick={(event) => (checkLogin()) ? (addToCart(product)) : toast.error("Login Please then add to cart")} size='sm' className='ms-4' color={product.stock ? 'primary' : 'danger'} >{product.stock ? 'Add to Cart' : 'out of stock'}</Button>

                </Container>
            </Card>

        )

    }

    return (
        (product) && getProductHtml()
    )
}

export default Product
