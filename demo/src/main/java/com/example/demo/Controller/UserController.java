package com.example.demo.Controller;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/adduser")
    public UserDTO addUser(@RequestBody UserDTO userdata){
        return service.addUser(userdata);
    }

    @GetMapping("/getallusers")
    public List<UserDTO> getAllUsers(){
        return service.getAllUsers();
    }

    @GetMapping("/getuser/{id}")
    public UserDTO getUser(@PathVariable int id){
        return service.getUser(id);
    }

}
