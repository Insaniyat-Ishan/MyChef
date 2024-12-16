package com.spring.MyChef.repository;

import com.spring.MyChef.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);  // Find user by username
}
