package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities;
/**
 *		------------------------------------------------------------------------
 *		------------------------ User --------------------------------
 *		------------------------------------------------------------------------
 *
 * CLASE: Entidad principal, siendo la clase que representa a cada uno de los usuarios que ingresan
 * al landing registrando la informacion del mismo
 *
 * @author : Santiago Buitrago
 *
 * @version 1.3 Final
 **/



import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.dto.UserDto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String Id;
    private String name;
    private String lastName;
    private String email;
    private LocalDateTime createdAt;


    public User(UserDto userDto) {
        Id= userDto.getId();
        name = userDto.getName();
        lastName= userDto.getLastName();
        email= userDto.getEmail();
        createdAt= userDto.getCreatedAt();
    }

    public User() {
        
    }

    public UserDto toDto(){
        UserDto userDto= new UserDto(Id, name, lastName, email, createdAt);
        return userDto;
    }

    @javax.persistence.Id
    public String getId() {
        return Id;
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

}
