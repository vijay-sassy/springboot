ECOMMERCE REST API

The sample data is stored in database namely ecomdb and schema is created for entity ecomstore

There are five REST Endpoints in this module!
(1)https://localhost:8080/ecomapi/products -> GET Method
(2)https://localhost:8080/ecomapi/products -> POST Method with Request body
   Example: {"productName":"laptop","inStock":"Y","quantity":"5","costPrice":200.50,"sellingPrice":300.00,"rating":4.5} -> IN-STOCK
            {"productName":"mobile","inStock":"N","costPrice":200.50,"sellingPrice":300.00,"rating":4.5} -> OUT-OF-STOCK
(3)https://localhost:8080/ecomapi/products/{id} -> GET Method
(4)https://localhost:8080/ecomapi/products/{id} -> DELETE Method
(3)https://localhost:8080/ecomapi/products/{id} -> PUT Method with Request body
