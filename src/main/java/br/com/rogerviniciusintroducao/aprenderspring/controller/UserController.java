package br.com.rogerviniciusintroducao.aprenderspring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rogerviniciusintroducao.aprenderspring.model.User;
import br.com.rogerviniciusintroducao.aprenderspring.service.UserService;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping
    public boolean insert(@RequestBody User entity) {
        return userService.insert(entity);
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable int id) {
        try {
            return userService.findById(id);
        } catch (Exception e) {
            return null;
        }
    }

    @PutMapping
    public boolean update(@RequestBody User entity) {
        return userService.update(entity);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        try {
            return userService.delete(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
