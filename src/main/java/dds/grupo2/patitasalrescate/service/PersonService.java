package dds.grupo2.patitasalrescate.service;

import dds.grupo2.patitasalrescate.domain.person.Person;
import dds.grupo2.patitasalrescate.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    private List<Person> people = new ArrayList<>(Arrays.asList(
            new Person(1),
                new Person(2)
        ));

    public List<Person> getPeople(){
        List<Person> people = new ArrayList<>();
        personRepository.findAll().forEach(people::add);
        return people;
    }

    public Person getPersonById(Integer id){
        return personRepository.findById(id).get();
    }

    public void addPerson(Person contact) {
        personRepository.save(contact);
    }

    public void updatePerson(Person contact) {
        // como ya sabe que Person tiene un id (hibernate) si ya existe, updetea, sino, lo crea, con el mismo metodo "save"
        personRepository.save(contact);
    }
}
