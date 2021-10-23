package dds.grupo2.patitasalrescate.controller;

import dds.grupo2.patitasalrescate.domain.person.contact.Contact;
import dds.grupo2.patitasalrescate.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "contacts")
public class ContactController {

    @Autowired // inyeccion de dependencias
    private ContactService contactService;

    @GetMapping()
    public List<Contact> getContacts(){
        return contactService.getContacts();
    }

    @GetMapping("/{id}")
    public Contact getContacts(@PathVariable Integer id){
        return contactService.getContactById(id);
    }

    @PostMapping()
    public void addContact(@RequestBody Contact contact){
        contactService.addContact(contact);
    }

    @PutMapping("/{id}")
    public void updateContact(@RequestBody Contact contact, @PathVariable Integer id){
        contactService.updateContact(contact);
    }

}
