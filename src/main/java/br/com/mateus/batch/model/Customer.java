package br.com.mateus.batch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "contact", nullable = true)
    private String contactNo;

    @Column(name = "country", nullable = true)
    private String country;

    @Column(name = "dob", nullable = true)
    private String dob;

    public Customer() {

    }

    public Customer(final long id, final String firstName, final String lastName,
            final String email, final String gender, final String contactNo,
            final String country, final String dob) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.contactNo = contactNo;
        this.country = country;
        this.dob = dob;
    }

    public Customer of(final long id, final String firstName, final String lastName,
            final String email, final String gender, final String contactNo,
            final String country, final String dob) {
        return new Customer(id, firstName, lastName, email, gender, contactNo, country, dob);
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getCountry() {
        return country;
    }

    public String getDob() {
        return dob;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
