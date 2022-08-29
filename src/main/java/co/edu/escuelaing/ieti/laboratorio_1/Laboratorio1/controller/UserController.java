package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.controller;
/**
 *		------------------------------------------------------------------------
 *		------------------------ UserController --------------------------------
 *		------------------------------------------------------------------------
 *
 * CLASE: Clase encargada de controlar los endpoints para las diferentes funciones solicitadas,
 * donde se reciben las solicitudes de la aplicacion web
 *
 * @author : Santiago Buitrago
 *
 * @version 1.3 Final
**/
import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.dto.UserDto;
import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities.User;
import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/user")
@CrossOrigin(origins = "http://localhost")

public class UserController {
    @Autowired

    private UserService userService ;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping( "/{id}" )
    public ResponseEntity<UserDto> findById( @PathVariable String id ) {
        return ResponseEntity.ok((userService.findById(id)).toDto());
    }

    @PostMapping
    public ResponseEntity<User> create( @RequestBody UserDto userDto ) {
        return ResponseEntity.ok(userService.create(userDto));
    }

    @PutMapping( "/{id}" )
    public ResponseEntity<User> update( @RequestBody UserDto userDto, @PathVariable String id ) {
        return ResponseEntity.ok(userService.update(userDto, id));
    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id ) {
        return ResponseEntity.ok(userService.deleteById(id));
    }
}