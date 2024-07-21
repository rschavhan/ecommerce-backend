package com.excelr.ecommerce.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.ecommerce.entity.User;
import com.excelr.ecommerce.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

	public Optional<User> findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

//	public void changePassword(Long id, String newPassword) {
//		// TODO Auto-generated method stub
//		Optional<User> user = userRepository.findById(id);
//		 if (user == null) {
//	            throw new RuntimeException("User not found with id: " + id);
//	        }
//	        
//	        if (newPassword == null || newPassword.length() < 6) {
//	            throw new IllegalArgumentException("Password must be at least 6 characters long");
//	        }
//
//	        String hashedPassword = passwordEncoder.encode(newPassword);
//	        user.setPassword(hashedPassword);
//	        userRepository.save(user);
//
//
//}
	}
