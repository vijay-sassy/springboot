ATM API 

This module stores 2 records into database on server start and schema is automatically created in atmdb.
The name of the entity is atm.

This API has 2 REST Endpoints

(1)https://localhost:8080/atmapi/balance/{pin}
Gets the bank balance of the Account Holder

(2)https://localhost:8080/atmapi/userinfo/{pin}/{event}/{amount}
Does deposit or withdraw transaction and show account summary
