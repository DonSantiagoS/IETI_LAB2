package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.service;
/**
 *		------------------------------------------------------------------------
 *		------------------------ UserService --------------------------------
 *		------------------------------------------------------------------------
 *
 * INTERFAZ: Encargada de proponer los diferentes servicios mediante funciones que
 * se pueden implementar a necesidad de lo requerido
 *
 * @author : Santiago Buitrago
 *
 * @version 1.3 Final
 **/


import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.dto.UserDto;
import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities.User;

import java.util.List;

public interface UserService {

    User create(UserDto userDto );
    User findById( String id );
    List<User> getAll();
    boolean deleteById(String id );
    User update( UserDto user, String userId );

}
