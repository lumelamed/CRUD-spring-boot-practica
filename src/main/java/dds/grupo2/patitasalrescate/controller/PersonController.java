package dds.grupo2.patitasalrescate.controller;

import dds.grupo2.patitasalrescate.domain.person.Person;
import dds.grupo2.patitasalrescate.domain.person.contact.Contact;
import dds.grupo2.patitasalrescate.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "person")
public class PersonController {

    @Autowired // inyeccion de dependencias
    private PersonService personService;

    @GetMapping()
    public List<Person> getPeople(){
        return personService.getPeople();
    }

    @GetMapping("/{id}")
    public Person getPeople(@PathVariable Integer id){
        return personService.getPersonById(id);
    }

    @PostMapping("/contact/{contactId}")
    public void addPerson(@RequestBody Person person, @PathVariable Integer contactId){
        person.setContact(new Contact(contactId, "", ""));
        personService.addPerson(person);
    }

    @PutMapping("/{id}/contact/{contactId}")
    public void updatePerson(@RequestBody Person person, @PathVariable Integer id, @PathVariable Integer contactId){
        person.setContact(new Contact(contactId, "", ""));
        personService.updatePerson(person);
    }
}
