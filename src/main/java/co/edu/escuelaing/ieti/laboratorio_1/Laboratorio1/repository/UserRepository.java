package co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.repository;

import co.edu.escuelaing.ieti.laboratorio_1.Laboratorio1.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface UserRepository extends MongoRepository<User, String> {

}

