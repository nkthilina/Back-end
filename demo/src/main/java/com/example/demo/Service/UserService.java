package com.example.demo.Service;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Repository.UserRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ModelMapper modelMapper;
    public UserDTO saveUser(UserDTO userDTO) {
        userRepository.save(modelMapper,map(userDTO,User.class));
        return userDTO;
    }
}
