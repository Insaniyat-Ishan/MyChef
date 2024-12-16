package com.spring.MyChef.controller;

import com.spring.MyChef.model.User;
import com.spring.MyChef.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Show Login Page
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  // Return login.html from templates folder
    }

    // Show Dashboard Page after login
    @GetMapping("/Dashboard")
    public String showDashboardPage() {
        return "Dashboard";  // Return dashboard.html after login
    }

    // Handle Login
    @PostMapping("/login")
    public String handleLogin(User user, Model model) {
        User foundUser = userRepository.findByUsername(user.getUsername());

        if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
            // Redirect to dashboard if login is successful
            model.addAttribute("user", foundUser);
            return "Dashboard";
        }

        // If login fails, show an error message
        model.addAttribute("error", "Invalid username or password.");
        return "login";  // Redirect back to login page with error
    }

    // Handle Signup
    @PostMapping("/signup")
    public String handleSignup(User user, Model model) {
        // Check if the username already exists
        User existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser != null) {
            model.addAttribute("error", "Username already exists.");
            return "login"; // Redirect back to login page if username exists
        }

        // Check if the password and confirmation password match
        if (!user.getPassword().equals(user.getConfirmPassword())) {
            model.addAttribute("error", "Passwords do not match.");
            return "login"; // Redirect back to login page if passwords don't match
        }

        // Save new user
        userRepository.save(user);
        model.addAttribute("message", "Account created successfully! Please log in.");
        return "login"; // Redirect to login page after successful signup
    }
}
