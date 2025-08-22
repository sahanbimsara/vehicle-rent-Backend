package org.Example.service;


import org.Example.model.dto.UserDTO;
import org.Example.model.entity.UserEntity;
import org.Example.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

  /*  @Autowired
    UserRepository userRepository;

    ModelMapper modelMapper = new ModelMapper();

    public List<UserDTO> getAllUsers(UserDTO userDTO){
        List<UserEntity> all = userRepository.findAll();
        List<UserDTO> userDTOS = new ArrayList<>();

        for (UserEntity customerEntity : all){
            userDTO map = modelMapper.map(customerEntity, userDTO.class);
            userDTO.add(map);
        }
        return userDTO;
    }*/
}
