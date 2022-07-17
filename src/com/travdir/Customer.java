package com.travdir;


public class Customer {
    public String lastName;
    public String firstName;
    public String phone;
    public String eMail;
    public String dateNaissance;

    public Customer(String lastName, String firstName, String phone, String eMail, String dateNaissance) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.eMail = eMail;
        this.dateNaissance = dateNaissance;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public String geteMail() {
        return eMail;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
