package dds.grupo2.patitasalrescate.domain.person;

import dds.grupo2.patitasalrescate.domain.person.contact.Contact;
import dds.grupo2.patitasalrescate.domain.person.contact.media.Media;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {

    @Id
    private Integer id;

    private LocalDate birthday;

    private int idNumber;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id")
    private Contact contact;

    private String address; // Para el rescatista

    //<editor-fold desc="Constructors" defaultstate="collapsed">

    public Person(Integer id) {
        this.id = id;
    }

    //</editor-fold>

    //<editor-fold desc="Getters and Setters" defaultstate="collapsed">

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //</editor-fold>
}

