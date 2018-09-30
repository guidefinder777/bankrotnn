package ru.nn.bankrot.enitty;

import ru.nn.bankrot.dto.ContactDTO;
import ru.nn.bankrot.enums.GENDER_TYPE;
import ru.nn.bankrot.enums.PHONE_TYPE;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Parfenov on 29.09.2018
 */
@Entity
@Table(name = "contact")
public class ContactEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name_accusative")
    private String lastNameAccusative;
    @Column(name = "first_name_accusative")
    private String firstNameAccusative;
    @Column(name = "middle_name_accusative")
    private String middleNameAccusative;
    @Column(name = "previous_names")
    private String previousNames;
    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "actual_address")
    private String actualAddress;
    @Column(name = "comment")
    private String comment;
    @Column(name = "series")
    private String series;
    @Column(name = "number")
    private String number;
    @Column(name = "issued_by")
    private String issuedBy;
    @Column(name = "issued_date")
    private Date issuedDate;
    @Column(name = "subdivision_code")
    private String subdivisionCode;
    @Column(name = "place_of_birth")
    private String placeOfBirth;
    @Column(name = "reg_address_index")
    private Integer regAddressIndex;
    @Column(name = "reg_address_region")
    private String regAddressRegion;
    @Column(name = "reg_address_district")
    private String regAddressDistrict;
    @Column(name = "reg_address_city")
    private String regAddressCity;
    @Column(name = "reg_address_settlement")
    private String regAddressSettlement;
    @Column(name = "reg_address_street")
    private String regAddressStreet;
    @Column(name = "reg_address_street_type")
    private Integer regAddressStreetType;
    @Column(name = "reg_address_house")
    private String regAddressHouse;
    @Column(name = "reg_address_corp")
    private String regAddressCorp;
    @Column(name = "reg_address_flat")
    private String regAddressFlat;
    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private GENDER_TYPE gender;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<EmailEntity> emails;
    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<PhoneEntity> phones;

    @Column(name = "created_date")
    private Date createdDate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastNameAccusative() {
        return lastNameAccusative;
    }

    public void setLastNameAccusative(String lastNameAccusative) {
        this.lastNameAccusative = lastNameAccusative;
    }

    public String getFirstNameAccusative() {
        return firstNameAccusative;
    }

    public void setFirstNameAccusative(String firstNameAccusative) {
        this.firstNameAccusative = firstNameAccusative;
    }

    public String getMiddleNameAccusative() {
        return middleNameAccusative;
    }

    public void setMiddleNameAccusative(String middleNameAccusative) {
        this.middleNameAccusative = middleNameAccusative;
    }

    public String getPreviousNames() {
        return previousNames;
    }

    public void setPreviousNames(String previousNames) {
        this.previousNames = previousNames;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getActualAddress() {
        return actualAddress;
    }

    public void setActualAddress(String actualAddress) {
        this.actualAddress = actualAddress;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getSubdivisionCode() {
        return subdivisionCode;
    }

    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public Integer getRegAddressIndex() {
        return regAddressIndex;
    }

    public void setRegAddressIndex(Integer regAddressIndex) {
        this.regAddressIndex = regAddressIndex;
    }

    public String getRegAddressRegion() {
        return regAddressRegion;
    }

    public void setRegAddressRegion(String regAddressRegion) {
        this.regAddressRegion = regAddressRegion;
    }

    public String getRegAddressDistrict() {
        return regAddressDistrict;
    }

    public void setRegAddressDistrict(String regAddressDistrict) {
        this.regAddressDistrict = regAddressDistrict;
    }

    public String getRegAddressCity() {
        return regAddressCity;
    }

    public void setRegAddressCity(String regAddressCity) {
        this.regAddressCity = regAddressCity;
    }

    public String getRegAddressSettlement() {
        return regAddressSettlement;
    }

    public void setRegAddressSettlement(String regAddressSettlement) {
        this.regAddressSettlement = regAddressSettlement;
    }

    public String getRegAddressStreet() {
        return regAddressStreet;
    }

    public void setRegAddressStreet(String regAddressStreet) {
        this.regAddressStreet = regAddressStreet;
    }

    public Integer getRegAddressStreetType() {
        return regAddressStreetType;
    }

    public void setRegAddressStreetType(Integer regAddressStreetType) {
        this.regAddressStreetType = regAddressStreetType;
    }

    public String getRegAddressHouse() {
        return regAddressHouse;
    }

    public void setRegAddressHouse(String regAddressHouse) {
        this.regAddressHouse = regAddressHouse;
    }

    public String getRegAddressCorp() {
        return regAddressCorp;
    }

    public void setRegAddressCorp(String regAddressCorp) {
        this.regAddressCorp = regAddressCorp;
    }

    public String getRegAddressFlat() {
        return regAddressFlat;
    }

    public void setRegAddressFlat(String regAddressFlat) {
        this.regAddressFlat = regAddressFlat;
    }

    public Set<EmailEntity> getEmails() {
        return emails;
    }

    public void setEmails(Set<EmailEntity> emails) {
        this.emails = emails;
    }

    public Set<PhoneEntity> getPhones() {
        return phones;
    }

    public void setPhones(Set<PhoneEntity> phones) {
        this.phones = phones;
    }

    public GENDER_TYPE getGender() {
        return gender;
    }

    public void setGender(GENDER_TYPE gender) {
        this.gender = gender;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public ContactEntity convert(ContactDTO contactDTO) {
        this.setId(contactDTO.getId());
        this.setLastName(contactDTO.getLastName());
        this.setFirstName(contactDTO.getFirstName());
        this.setMiddleName(contactDTO.getMiddleName());
        this.setLastNameAccusative(contactDTO.getLastNameAccusative());
        this.setFirstNameAccusative(contactDTO.getFirstNameAccusative());
        this.setMiddleNameAccusative(contactDTO.getMiddleNameAccusative());
        this.setPreviousNames(contactDTO.getPreviousNames());
        this.setDateOfBirth(contactDTO.getDateOfBirth());
        this.setActualAddress(contactDTO.getActualAddress());
        this.setComment(contactDTO.getComment());
        this.setSeries(contactDTO.getSeries());
        this.setNumber(contactDTO.getNumber());
        this.setIssuedBy(contactDTO.getIssuedBy());
        this.setIssuedDate(contactDTO.getIssuedDate());
        this.setSubdivisionCode(contactDTO.getSubdivisionCode());
        this.setPlaceOfBirth(contactDTO.getPlaceOfBirth());
        this.setRegAddressIndex(contactDTO.getRegAddressIndex());
        this.setRegAddressRegion(contactDTO.getRegAddressRegion());
        this.setRegAddressDistrict(contactDTO.getRegAddressDistrict());
        this.setRegAddressCity(contactDTO.getRegAddressCity());
        this.setRegAddressSettlement(contactDTO.getRegAddressSettlement());
        this.setRegAddressStreet(contactDTO.getRegAddressStreet());
        this.setRegAddressStreetType(contactDTO.getRegAddressStreetType());
        this.setRegAddressHouse(contactDTO.getRegAddressHouse());
        this.setRegAddressCorp(contactDTO.getRegAddressCorp());
        this.setRegAddressFlat(contactDTO.getRegAddressFlat());
        if (contactDTO.getGender() != null) {
            this.setGender(GENDER_TYPE.valueOf(contactDTO.getGender()));
        }
        if (contactDTO.getEmail() != null) {
            Set<EmailEntity> emailEntities = new HashSet<>();
            for (int i = 0; i < contactDTO.getEmail().size(); i++) {
                String email = contactDTO.getEmail().get(i);
                Boolean isMail = contactDTO.getMainEmail() == i;
                EmailEntity emailEntity = new EmailEntity();
                emailEntity.setContact(this);
                emailEntity.setEmail(email);
                emailEntity.setMain(isMail);
                emailEntities.add(emailEntity);
            }
            this.setEmails(emailEntities);
        }
        if (contactDTO.getPhone() != null) {
            Set<PhoneEntity> phoneEntities = new HashSet<>();
            for (int i = 0; i < contactDTO.getPhone().size(); i++) {
                String phone = contactDTO.getPhone().get(i);
                PHONE_TYPE phoneType = PHONE_TYPE.valueOf(contactDTO.getType().get(i));
                Boolean isMain = contactDTO.getMainPhone() == i;

                PhoneEntity phoneEntity = new PhoneEntity();
                phoneEntity.setContact(this);
                phoneEntity.setPhone(phone);
                phoneEntity.setMail(isMain);
                phoneEntity.setPhoneType(phoneType);
                phoneEntities.add(phoneEntity);
            }
            this.setPhones(phoneEntities);
        }
        return this;
    }
}
