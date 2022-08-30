package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.service;

import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.dto.UserDto;
import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities.User;
import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceMongoDB implements UserService
{

    private final UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }

    @Override
    public User create(UserDto userDto )
    {
        User user= new User(userDto);
        userRepository.insert(user);
        return user;
    }

    @Override
    public Optional<User> findById(String id )
    {
        return userRepository.findById(id) ;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean deleteById( String id )
    {
        userRepository.deleteById(id);
        return userRepository.existsById(id);
    }

    @Override
    public User update(UserDto userDto, String userId) {
        User user= new User(userDto);
        userRepository.deleteById(userId);
        userRepository.save(user);
        return user;
    }
}