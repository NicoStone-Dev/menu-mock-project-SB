package br.com.nicostone.menu_system.User;

import br.com.nicostone.menu_system.User.DTO.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ru-user")
public class UserController {
    UserService userServ;

    UserController(UserService userService) {
        this.userServ = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<UserModel> addUser(@RequestBody UserDTO userDTO) {
        return new ResponseEntity<UserModel>(userServ.addUser(userDTO), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    public ResponseEntity<List<UserModel>> listUsers() {
        return new ResponseEntity<List<UserModel>>(userServ.userList(), HttpStatus.OK);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<UserModel> listUsers(@PathVariable("id") Long id) {
        return new ResponseEntity<UserModel>(userServ.find(id), HttpStatus.OK);
    }

    @PatchMapping("/update/{id}")
    public ResponseEntity<UserModel> updateUser(@PathVariable("id") Long id, @RequestBody UserDTO info_update) {
        return new ResponseEntity<>(userServ.updateUser(id, info_update), HttpStatus.OK);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") Long id) {
        userServ.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
