import React, { useContext, useState } from 'react';
import { NavLink as ReactLink, useNavigate } from 'react-router-dom'
import SearchBarProduct from './SearchBarProduct'
import {
  Collapse,
  Navbar,
  NavbarToggler,
  NavbarBrand,
  Nav,
  NavItem,
  NavLink,
  UncontrolledDropdown,
  DropdownToggle,
  DropdownMenu,
  DropdownItem,
  NavbarText,
  Button,
  Col,
} from 'reactstrap';
import { checkLogin, getCurrentUser, logout, adminLogin } from '../auth'
import { context1 } from './Context';
import { searchProduct } from '../Service/product-service';
import { toast } from "react-toastify";
import { addItemToCart as addCart } from '../Service/cartService'
import Product from './Product';
import SearchProducts from './SearchProducts';


function CustomNavbar({ search }) {
  const [isOpen, setIsOpen] = useState(false);
  const value1 = useContext(context1)
  const navigate = useNavigate();

  const toggle = () => setIsOpen(!isOpen);

  const [prod, setProd] = useState(null)

  const [productName, setProductName] = useState("");

  const [dataPar, setdataPar] = useState([]);
  // event.preventDefault();
  // console.log(event.target.value)
  // const val = event.target.value;
  // {<SearchBarProduct  setProd= {val}/>}
  // navigate(`/searchbar`)

  const addItemToCart = (product) => {
    console.log(product);
    addCart(product.productId, 1).then(data => {
      console.log(data)
      toast.success("Item add to Cart")
    }).catch(error => { console.log(error) })
  }
  const searchProducts = (event) => {

    searchProduct(event).then(data => {
      // navigate(`{"/store/data."}`)
      const val = data;
      // const id = (val[0].category.categoryId)
      console.log(JSON.stringify(data) + " hi there is search bar")
      setdataPar(data)
      // { <SearchProducts product={data} /> }


      // {<Product product = {data} addToCart = {addItemToCart}/>}
      // {
      //   (data) &&
      //   data.content.map((item, index) => (
      //     <Col md="6" lg="4" >
      //       <Product key={index} addToCart={addItemToCart} product={item} />
      //     </Col>
      //   ))
      // }
      // setProd(data);
      // const n = event.target.value;
      // navigate("/searchbar")
      // setProductName(event.target.value);
      if (data.length === 0) {
        navigate("/store/all")
        // setProductName(event.target.value);
      }
    }
    ).catch(error => {
      console.log(error)
      // setProductName('');
      navigate("/store/all")
    })


  }

  const handelSearch = (productName) => {
    // console.log(productName+" hi this is handel");
    // searchProducts(productName);
    searchProduct(productName).then(data => {
      // navigate(`{"/store/data."}`)
      // const val = data;
      // const id = (val[0].category.categoryId)
      console.log(data + " hi there is search bar")
      // setProd(data);
      // const n = event.target.value;
      // navigate("/searchbar")
      // { <SearchBarProduct data={data} /> }
      // setProductName(.target.value);

      // getProduct()

      if (data.length === 0) {
        // toast.error("product not found")

        navigate("/store/all")
        // setProductName(event.target.value);
      }
      // console.log(images)
    }
    ).catch(error => {
      console.log(error)

      // setProductName(event.target.value);
      navigate("/store/all")
    })
  }

  const htmlData = () => {
    return (
      <div>
        <Navbar color='light' expand="md" ClassName='px-5 shadow-sm'
          fixed='top'
        >
          <NavbarBrand tag={ReactLink} to="/store/all">Store</NavbarBrand>
          <NavbarToggler onClick={toggle} />
          <Collapse isOpen={isOpen} navbar>
            <Nav className="me-auto" navbar>

              <NavItem>
                <NavLink tag={ReactLink} to="/about">About</NavLink>
              </NavItem>

            </Nav>

            {/* <SearchBarProduct search = {handelSearch}/> */}
            <Nav className="me-auto" navbar>

              <NavItem>
                {/* <NavLink tag={ReactLink} to="/about">About</NavLink> */}
                <SearchBarProduct search={searchProducts} par={dataPar} />
              </NavItem>

            </Nav>
            {/* <input type="text" placeholder="Search Product"
              onChange={(e) => {
                setProductName(e.target.value)
                if (e.target.value.length >= 3)
                  searchProducts(e)
              }}
              value={productName}
              style={{
                "border": ".5px solid grey",
                "height": "2.5rem",
                "width": "16rem"
              }} /> */}
            {/* <input
              type="text"
              placeholder="Product Name"
              onChange={(e) => {
                setProductName(e.target.value)
                searchProducts(e)
              }}
              value={productName}
            /> */}
            <Nav Navbar>
              {checkLogin() && (
                <>
                  <NavItem>
                    <NavLink tag={ReactLink} to="/user/cart">
                      <b>Cart({value1.cart.iteam.length})</b>
                    </NavLink>
                  </NavItem>
                </>
              )}

              {(!checkLogin()) && (
                <>
                  <NavItem>
                    <NavLink tag={ReactLink} to="/login">
                      login
                    </NavLink>
                  </NavItem>

                  <Nav>
                    <NavItem Navbar>
                      <NavLink tag={ReactLink} to="/signup">
                        Signup
                      </NavLink>
                    </NavItem>
                  </Nav>
                </>
              )}




              {checkLogin() && (
                <> {
                  (adminLogin() &&
                    (
                      <>
                        <NavItem>
                          <NavLink tag={ReactLink} to="/admin-dashboard/home">
                            Admin DashBoard
                          </NavLink>
                        </NavItem>
                      </>
                    ))
                }


                  <NavItem>
                    <NavLink tag={ReactLink} to="/user/dashboard">
                      <h5>{getCurrentUser().name}</h5>

                    </NavLink>
                  </NavItem>

                  <NavItem>
                    <NavLink tag={ReactLink} to="/store/all">
                      <Button color='danger' onClick={logout}>Logout</Button>
                    </NavLink>
                  </NavItem>

                </>
              )}
            </Nav>


          </Collapse>
        </Navbar>
      </div>
    )
  }
  return (
    <context1.Consumer>
      {
        (value) => htmlData(value)

      }
    </context1.Consumer>

  );
}

export default CustomNavbar