# CRUD Service for Customer Objects

To start the application open a Terminal window in the `Spring` directory and run `docker-compose up --build`.

## Get all customers
In order to get all customer information execute a GET method on `http://localhost:8080/user`.

## Get Customer by ID
If you wish to get a specific user you can search by ID by executing a GET method on `http://localhost:8080/user/{id}` replacing `{id}` with the ID of the user you wish to search for.

## Delete Customer
To delete a customer execute a DELETE method on `http://localhost:8080/user/{id}` replacing `{id}` with the ID of the user you wish to delete.

## Add new Customer
To add a new customer execute POST method on `http://localhost:8080/user` with some JSON contining the details of the new customer.

## Update Customer
To update an existing customer execute PUT method on `http://localhost:8080/user/{id}` replacing `{id}` with the ID of the user you wish to delete and some JSON contining the updated customer details.
