package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.dto;

/**
 *		------------------------------------------------------------------------
 *		------------------------ UserDto ---------------------------------------
 *		------------------------------------------------------------------------
 *
 * CLASE: Clase encargada de ser un mapeo de la entidad Usuario de manera que
 * proporciona seguridad en el momento de ser utilizada la entidad, ya que no se
 * entrega la propia entidad
 *
 * @author : Santiago Buitrago
 *
 * @version 1.3 Final
 **/

import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities.User;

import java.time.LocalDateTime;

public class UserDto {

    private String id;
    private String name;
    private String lastName;
    private String email;
    private LocalDateTime createdAt;

    public UserDto (String id, String name, String lastName, String email, LocalDateTime createdAt){
        this.id=id;
        this.name=name;
        this.lastName=lastName;
        this.email=email;
        this.createdAt=createdAt;
    }
    public UserDto (User user){
        this.id= user.getId();
        this.name= user.getName();
        this.lastName= user.getLastName();
        this.email= user.getEmail();
        this.createdAt= user.getCreatedAt();
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public User toEntiti(){
        User user= new User(this);
        return user;
    }
}