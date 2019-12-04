package UserApp.User;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String exception){
        super(exception);
    }
}
