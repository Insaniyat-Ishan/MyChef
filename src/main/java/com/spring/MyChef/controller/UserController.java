package com.spring.MyChef.controller;

import com.spring.MyChef.model.User;
import com.spring.MyChef.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("user") // Add user object to session
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Show Login Page
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";  // Return login.html from templates folder
    }

    // Show Dashboard Page
    @GetMapping("/Dashboard")
    public String showDashboardPage(Model model) {
        // Check if 'user' exists in the session
        if (model.containsAttribute("user")) {
            return "Dashboard";  // Show the dashboard
        }
        return "redirect:/login";  // Redirect to login page if session does not exist
    }

    // Handle Login
    @PostMapping("/login")
    public String handleLogin(User user, Model model) {
        User foundUser = userRepository.findByUsername(user.getUsername());

        if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
            model.addAttribute("user", foundUser);  // Store user in session
            return "redirect:/Dashboard";  // Redirect to dashboard
        }

        model.addAttribute("error", "Invalid username or password.");
        return "login";  // Return back to login page with error
    }

    // Handle Signup
    @PostMapping("/signup")
    public String handleSignup(User user, Model model) {
        User existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser != null) {
            model.addAttribute("error", "Username already exists.");
            return "login"; // Redirect back to login page if username exists
        }

        if (!user.getPassword().equals(user.getConfirmPassword())) {
            model.addAttribute("error", "Passwords do not match.");
            return "login";
        }

        userRepository.save(user);
        model.addAttribute("message", "Account created successfully! Please log in.");
        return "login";
    }

    // Handle Logout
    @GetMapping("/logout")
    public String handleLogout(SessionStatus status) {
        status.setComplete();  // Clear the session
        return "redirect:/login";  // Redirect to login page
    }
}
