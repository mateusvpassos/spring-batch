package br.com.mateus.batch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Customer")
@Table(name = "customer")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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

    private Customer(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.gender = builder.gender;
        this.contactNo = builder.contactNo;
        this.country = builder.country;
        this.dob = builder.dob;
    }

    public static class Builder {
        private long id;
        private String firstName;
        private String lastName;
        private String email;
        private String gender;
        private String contactNo;
        private String country;
        private String dob;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder contactNo(String contactNo) {
            this.contactNo = contactNo;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder dob(String dob) {
            this.dob = dob;
            return this;
        }

        public Customer build() {
            return new Customer(this);
        }
    }

}
