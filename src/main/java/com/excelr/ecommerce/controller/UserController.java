package com.excelr.ecommerce.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.ecommerce.entity.User;
import com.excelr.ecommerce.service.UserService;

@RestController
@RequestMapping("/v1/ecom/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

//    @PutMapping("/{id}")
//    public User updateUser(@PathVariable Long id, @RequestBody User user) {
//        return userService.updateUser(id, user);
//    }
//
//    @DeleteMapping("/{id}")
//    public String deleteUser(@PathVariable Long id) {
//        userService.deleteUser(id);
//        return "User deleted successfully";
//    }

//    @GetMapping
//    public List<User> getAllUsers() {
//        return userService.findAll();
//    }

 

//    @PatchMapping("/{id}/change-password")
//    public String changeUserPassword(@PathVariable Long id, @RequestBody Map<String, String> payload) {
//        String newPassword = payload.get("newPassword");
//        userService.changePassword(id, newPassword);
//        return "Password updated successfully";
//    }

    // Other user-related endpoints...
}
