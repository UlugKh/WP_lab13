package com.wp.lab13;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping
    public ResponseEntity<String> createUser(@Valid @RequestBody UserRequestDTO userRequest) {
        logger.info("Received user request: name={}, age={}", userRequest.getName(), userRequest.getAge());
        return ResponseEntity.ok("User Created " + userRequest.getName());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO<User>> getUserById(@PathVariable int id) {
        // Just creating a fake user for demo purposes
        User user = new User("Ali", 20);

        ResponseDTO<User> response = new ResponseDTO<>(
                "User retrieved successfully",
                200,
                user
        );

        return ResponseEntity.ok(response);
    }
}
