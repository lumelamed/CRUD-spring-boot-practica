package dds.grupo2.patitasalrescate.repository;

import dds.grupo2.patitasalrescate.domain.person.contact.Contact;
import org.springframework.data.repository.CrudRepository;

// solo hacemos la interfaz, porque la clase ya la provee Spring
public interface ContactRepository extends CrudRepository<Contact, Integer> {
    //CRUD = Create, Read, Update, Delete
}
