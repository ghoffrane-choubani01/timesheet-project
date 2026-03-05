package tn.esprit.spring.control;

import tn.esprit.spring.services.IUserService;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.User;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestControl {

    private final IUserService userService;

    public UserRestControl(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/retrieve-all-users")
    public List<User> retrieveAllUsers() {
        return userService.retrieveAllUsers();
    }

    @GetMapping("/retrieve-user/{user-id}")
    public User retrieveUser(@PathVariable("user-id") Long userId) {
        return userService.retrieveUser(userId);
    }

    @PostMapping("/add-user")
    public User addUser(@RequestBody User u) {
        return userService.addUser(u);
    }

    @DeleteMapping("/remove-user/{user-id}")
    public void removeUser(@PathVariable("user-id") Long userId) {
        userService.removeUser(userId);
    }

    @PutMapping("/modify-user")
    public User modifyUser(@RequestBody User u) {
        return userService.modifyUser(u);
    }
}
