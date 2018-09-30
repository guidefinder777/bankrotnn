package ru.nn.bankrot.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.nn.bankrot.enitty.ContactEntity;
import ru.nn.bankrot.enitty.EmailEntity;
import ru.nn.bankrot.enitty.PhoneEntity;

import java.text.MessageFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by Parfenov on 29.09.2018
 */
public class ContactDTO {

    private Integer id;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("middle_name")
    private String middleName;
    @JsonProperty("last_name_accusative")
    private String lastNameAccusative;
    @JsonProperty("first_name_accusative")
    private String firstNameAccusative;
    @JsonProperty("middle_name_accusative")
    private String middleNameAccusative;
    @JsonProperty("previous_names")
    private String previousNames;
    @JsonFormat(pattern = "dd.MM.yyyy")
    @JsonProperty("date_of_birth")
    private Date dateOfBirth;
    @JsonProperty("actual_address")
    private String actualAddress;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("series")
    private String series;
    @JsonProperty("number")
    private String number;
    @JsonProperty("issued_by")
    private String issuedBy;
    @JsonFormat(pattern = "dd.MM.yyyy")
    @JsonProperty("issued_date")
    private Date issuedDate;
    @JsonProperty("subdivision_code")
    private String subdivisionCode;
    @JsonProperty("place_of_birth")
    private String placeOfBirth;
    @JsonProperty("reg_address_index")
    private Integer regAddressIndex;
    @JsonProperty("reg_address_region")
    private String regAddressRegion;
    @JsonProperty("reg_address_district")
    private String regAddressDistrict;
    @JsonProperty("reg_address_city")
    private String regAddressCity;
    @JsonProperty("reg_address_settlement")
    private String regAddressSettlement;
    @JsonProperty("reg_address_street")
    private String regAddressStreet;
    @JsonProperty("reg_address_street_type")
    private Integer regAddressStreetType;
    @JsonProperty("reg_address_house")
    private String regAddressHouse;
    @JsonProperty("reg_address_corp")
    private String regAddressCorp;
    @JsonProperty("reg_address_flat")
    private String regAddressFlat;
    private List<String> email;
    private List<String> phone;
    private List<String> type;
    @JsonProperty("main_phone")
    private Integer mainPhone;
    @JsonProperty("main_email")
    private Integer mainEmail;
    private String gender;


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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public Integer getMainPhone() {
        return mainPhone;
    }

    public void setMainPhone(Integer mainPhone) {
        this.mainPhone = mainPhone;
    }

    public Integer getMainEmail() {
        return mainEmail;
    }

    public void setMainEmail(Integer mainEmail) {
        this.mainEmail = mainEmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ContactDTO{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastNameAccusative='" + lastNameAccusative + '\'' +
                ", firstNameAccusative='" + firstNameAccusative + '\'' +
                ", middleNameAccusative='" + middleNameAccusative + '\'' +
                ", previousNames='" + previousNames + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", actualAddress='" + actualAddress + '\'' +
                ", comment='" + comment + '\'' +
                ", series=" + series +
                ", number=" + number +
                ", issuedBy='" + issuedBy + '\'' +
                ", issuedDate=" + issuedDate +
                ", subdivisionCode=" + subdivisionCode +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", regAddressIndex=" + regAddressIndex +
                ", regAddressRegion='" + regAddressRegion + '\'' +
                ", regAddressDistrict='" + regAddressDistrict + '\'' +
                ", regAddressCity='" + regAddressCity + '\'' +
                ", regAddressSettlement='" + regAddressSettlement + '\'' +
                ", regAddressStreet='" + regAddressStreet + '\'' +
                ", regAddressStreetType=" + regAddressStreetType +
                ", regAddressHouse='" + regAddressHouse + '\'' +
                ", regAddressCorp='" + regAddressCorp + '\'' +
                ", regAddressFlat='" + regAddressFlat + '\'' +
                ", email=" + email +
                ", phone=" + phone +
                ", type=" + type +
                ", mainPhone=" + mainPhone +
                ", mainEmail=" + mainEmail +
                '}';
    }


    public static ContactDTO convert(ContactEntity contactEntity) {
        ContactDTO contactDTO = new ContactDTO();
        contactDTO.setLastName(contactEntity.getLastName());
        contactDTO.setFirstName(contactEntity.getFirstName());
        contactDTO.setMiddleName(contactEntity.getMiddleName());
        contactDTO.setId(contactEntity.getId());
        contactDTO.setLastNameAccusative(contactEntity.getLastNameAccusative());
        contactDTO.setFirstNameAccusative(contactEntity.getFirstNameAccusative());
        contactDTO.setMiddleNameAccusative(contactEntity.getMiddleNameAccusative());
        contactDTO.setPreviousNames(contactEntity.getPreviousNames());
        contactDTO.setDateOfBirth(contactEntity.getDateOfBirth());
        contactDTO.setActualAddress(contactEntity.getActualAddress());
        contactDTO.setComment(contactEntity.getComment());
        contactDTO.setSeries(contactEntity.getSeries());
        contactDTO.setNumber(contactEntity.getNumber());
        contactDTO.setIssuedBy(contactEntity.getIssuedBy());
        contactDTO.setIssuedDate(contactEntity.getIssuedDate());
        contactDTO.setSubdivisionCode(contactEntity.getSubdivisionCode());
        contactDTO.setPlaceOfBirth(contactEntity.getPlaceOfBirth());
        contactDTO.setRegAddressIndex(contactEntity.getRegAddressIndex());
        contactDTO.setRegAddressRegion(contactEntity.getRegAddressRegion());
        contactDTO.setRegAddressDistrict(contactEntity.getRegAddressDistrict());
        contactDTO.setRegAddressCity(contactEntity.getRegAddressCity());
        contactDTO.setRegAddressSettlement(contactEntity.getRegAddressSettlement());
        contactDTO.setRegAddressStreet(contactEntity.getRegAddressStreet());
        contactDTO.setRegAddressStreetType(contactEntity.getRegAddressStreetType());
        contactDTO.setRegAddressHouse(contactEntity.getRegAddressHouse());
        contactDTO.setRegAddressCorp(contactEntity.getRegAddressCorp());
        contactDTO.setRegAddressFlat(contactEntity.getRegAddressFlat());

        if (contactEntity.getEmails() != null) {
            List<EmailEntity> sort = contactEntity.getEmails().stream().sorted((o1, o2) -> o2.getMain().compareTo(o1.getMain())).collect(Collectors.toList());
            contactDTO.setEmail(sort.stream().map(EmailEntity::getEmail).collect(Collectors.toList()));
            contactDTO.setMainEmail(sort.stream().map(EmailEntity::getMain).collect(Collectors.toList()).indexOf(true));
        }
        if (contactEntity.getPhones() != null) {
            List<PhoneEntity> sort = contactEntity.getPhones().stream().sorted((o1, o2) -> o2.getMail().compareTo(o1.getMail())).collect(Collectors.toList());
            contactDTO.setPhone(sort.stream().map(PhoneEntity::getPhone).collect(Collectors.toList()));
            contactDTO.setType(sort.stream().map(phoneEntity -> phoneEntity.getPhoneType().name()).collect(Collectors.toList()));
            contactDTO.setMainPhone(sort.stream().map(PhoneEntity::getMail).collect(Collectors.toList()).indexOf(true));
        }

        if (contactEntity.getGender() != null) {
            contactDTO.setGender(contactEntity.getGender().name());
        }
        return contactDTO;

    }

    public String getFullname() {
        return MessageFormat.format("{0} {1} {2}", Objects.toString(this.getLastName(), ""),
                Objects.toString(this.getFirstName(), ""), Objects.toString(this.getMiddleName(), ""));
    }

    public String getMainEmailValue() {
        if (this.getMainEmail() != null && this.getMainEmail() != -1 && this.getMainEmail() <= this.getEmail().size()) {
            return this.getEmail().get(this.getMainEmail());
        }
        return "";
    }

    public String getMainPhoneValue() {
        if (this.getMainPhone() != null && this.getMainPhone() != -1 && this.getMainPhone() <= this.getPhone().size()) {
            return this.getPhone().get(this.getMainPhone());
        }
        return "";
    }
}
