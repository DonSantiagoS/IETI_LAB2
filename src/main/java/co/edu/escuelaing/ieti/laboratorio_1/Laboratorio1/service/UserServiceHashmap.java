package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.service;

import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.dto.UserDto;
import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashmap implements UserService {

    private HashMap<String, User> HashMapUsers;

    public UserServiceHashmap(){
        HashMapUsers= new HashMap<String, User>();
    }

    @Override
    public User create(UserDto userDto) {
        User user= new User(userDto);
        HashMapUsers.put(userDto.getId(),user);
        return user;
    }

    @Override
    public User findById(String id) {
        return HashMapUsers.get(id);
    }

    @Override
    public List<User> getAll() {
        List users=new ArrayList();
        for (User valor : HashMapUsers.values()) {
            users.add(valor);
        }
        return users;
    }

    @Override
    public boolean deleteById(String id) {
        HashMapUsers.remove(id);
        return HashMapUsers.containsKey(id);
    }

    @Override
    public User update(UserDto userDto, String userId) {
        User user= new User(userDto);
        HashMapUsers.replace(userId,user);
        return HashMapUsers.get(userId);
    }
}
