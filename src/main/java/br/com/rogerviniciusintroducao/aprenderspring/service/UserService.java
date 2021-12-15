package br.com.rogerviniciusintroducao.aprenderspring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rogerviniciusintroducao.aprenderspring.model.User;
import br.com.rogerviniciusintroducao.aprenderspring.repository.UserRepository;

@Service
public class UserService implements IService<User> {
    @Autowired
    public UserRepository userRepository;

    @Override
    public boolean insert(User entity) {
        if (entity != null)
            return userRepository.insert(entity);
        return false;
    }

    @Override
    public boolean update(User entity) {
        if (entity != null)
            return userRepository.update(entity);
        return false;
    }

    @Override
    public Optional<User> findById(int id) {
        if (id >= 0)
            return userRepository.findById(id);
        return null;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean delete(int id) {
        if (id >= 0)
            return userRepository.delete(id);
        return false;
    }
}
