package pl.smuga.moviesweb.english.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.smuga.moviesweb.english.model.Users;
import pl.smuga.moviesweb.english.service.DbService;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private DbService service;
//
//    @GetMapping("/users")
//    public List<Users> getAllUsers() {
////		return employeeRepository.findAll();
//        return
//    }


}
