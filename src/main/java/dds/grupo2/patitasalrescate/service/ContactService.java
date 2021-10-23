package dds.grupo2.patitasalrescate.service;

import dds.grupo2.patitasalrescate.domain.person.contact.Contact;
import dds.grupo2.patitasalrescate.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    private List<Contact> contacts = new ArrayList<>(Arrays.asList(
            new Contact(1, "44444444", "test@mail.com"),
                new Contact(2, "55555555", "test2@mail.com")
        ));

    public List<Contact> getContacts(){
        List<Contact> contacts = new ArrayList<>();
        contactRepository.findAll().forEach(contacts::add);
        return contacts;
    }

    public Contact getContactById(Integer id){
        return contactRepository.findById(id).get();
    }

    public void addContact(Contact contact) {
        contactRepository.save(contact);
    }

    public void updateContact(Contact contact) {
        // como ya sabe que Contact tiene un id (hibernate) si ya existe, updetea, sino, lo crea, con el mismo metodo "save"
        contactRepository.save(contact);
    }
}
