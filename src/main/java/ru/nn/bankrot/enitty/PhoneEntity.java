package ru.nn.bankrot.enitty;

import ru.nn.bankrot.enums.PHONE_TYPE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by Parfenov on 30.09.2018
 */
@Table
@Entity(name = "contact_phone")
public class PhoneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "contact_id", nullable = false)
    private ContactEntity contact;

    private String phone;
    private Boolean mail;

    @Column(name = "phone_type")
    @Enumerated(EnumType.STRING)
    private PHONE_TYPE phoneType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ContactEntity getContact() {
        return contact;
    }

    public void setContact(ContactEntity contact) {
        this.contact = contact;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Boolean getMail() {
        return mail;
    }

    public void setMail(Boolean mail) {
        this.mail = mail;
    }

    public PHONE_TYPE getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(PHONE_TYPE phoneType) {
        this.phoneType = phoneType;
    }
}
