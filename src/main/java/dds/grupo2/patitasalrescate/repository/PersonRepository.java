package dds.grupo2.patitasalrescate.repository;

import dds.grupo2.patitasalrescate.domain.person.Person;
import org.springframework.data.repository.CrudRepository;

// solo hacemos la interfaz, porque la clase ya la provee Spring
public interface PersonRepository extends CrudRepository<Person, Integer> {
    //CRUD = Create, Read, Update, Delete
}
