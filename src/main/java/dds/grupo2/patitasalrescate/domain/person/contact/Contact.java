package dds.grupo2.patitasalrescate.domain.person.contact;

import dds.grupo2.patitasalrescate.domain.person.contact.media.Media;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Contact {

    @Id
    private Integer id;

    private String phone;

    private String email;

    private List<Media> mediasSelected = new ArrayList<>();

    //<editor-fold desc="Constructors" defaultstate="collapsed">

    public Contact(Integer id, String phone, String email) {
        this.id = id;
        this.phone = phone;
        this.email = email;
    }

    public Contact() {
    }

    //</editor-fold>

    //<editor-fold desc="Getters and Setters" defaultstate="collapsed">

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Media> getMediasSelected() {
        return mediasSelected;
    }

    public void setMediasSelected(List<Media> mediaSelected) {
        this.mediasSelected = mediaSelected;
    }

    public void addMediaSelected(Media mediaSelected) {
        this.mediasSelected.add(mediaSelected);
    }

    //</editor-fold>
}

