package UserApp.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public Iterable<User> retrieveAllCustomers(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public User retrieveCustomer(@PathVariable int id) {
        Optional<User> product = userRepository.findById(id);

        if (!product.isPresent())
            throw new UserNotFoundException("id-" + id);

        return product.get();
    }

    @DeleteMapping("/user/{id}")
    public void deleteCustomer(@PathVariable int id){
        userRepository.deleteById(id);
    }

    @PostMapping("/user")
    public ResponseEntity<Object> createCustomer(@RequestBody User user){
        User savedUser = userRepository.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();
    }
    @PutMapping("/user/{id}")
    public ResponseEntity<Object> updateCustomer(@RequestBody User user, @PathVariable int id){
        Optional<User> customerOptional= userRepository.findById(id);

        if (!customerOptional.isPresent())
            return ResponseEntity.notFound().build();

        user.setId(id);

        userRepository.save(user);

        return ResponseEntity.noContent().build();
    }
}
