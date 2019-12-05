# CRUD Service for User Objects

To start the application open a Terminal window in the `UserService` directory and run `docker-compose up --build`.

## Get all users
In order to get all user information execute a GET method on `http://localhost:8080/user`.

## Get User by ID
If you wish to get a specific user you can search by ID by executing a GET method on `http://localhost:8080/user/{id}` replacing `{id}` with the ID of the user you wish to search for.

## Delete User
To delete a user execute a DELETE method on `http://localhost:8080/user/{id}` replacing `{id}` with the ID of the user you wish to delete.

## Add new User
To add a new user execute POST method on `http://localhost:8080/user` with some JSON contining the details of the new user.

## Update User
To update an existing user execute PUT method on `http://localhost:8080/user/{id}` replacing `{id}` with the ID of the user you wish to delete and some JSON contining the updated user details.
