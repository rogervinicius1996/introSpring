package br.com.rogerviniciusintroducao.aprenderspring.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.rogerviniciusintroducao.aprenderspring.model.User;

@Repository
public class UserRepository implements IRepository<User> {
    private List<User> database = new ArrayList<>();

    @Override
    public boolean insert(User entity) {

        return database.add(entity);
    }

    @Override
    public boolean update(User entity) {
        for (User user : database) {
            if (user.getId() == entity.getId()) {
                database.set(database.indexOf(user), entity);
                return true;
            }
        }
        return false;
        
        
        //if (entity.getId() < 0)
            //return false;
        //database.set(entity.getId(), entity);
        //return true;

    }

    @Override
    public Optional<User> findById(int id){
        return database.stream().filter((User) -> User.getId() == id).findFirst();
        //return database.get(id);
    }

    @Override
    public List<User> findAll() {

        return database;
    }

    @Override
    public boolean delete(int id) {
        return database.removeIf(User -> User.getId() == id);
        //var result = database.remove(id);
        //return result != null;
    }

}
