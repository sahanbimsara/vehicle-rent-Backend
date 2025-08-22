package org.Example.controller;

import org.Example.model.dto.UserDTO;
import org.Example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class UserController {


        @Autowired
        UserService userService;

        @GetMapping("getAll")
        public List<UserDTO> getAllUsers(UserDTO userDTO){
         return null;
        }

        @PostMapping("/add")
        public void addUser(@RequestBody UserDTO userDTO){
            userService.addUsers(userDTO);
        }

}
