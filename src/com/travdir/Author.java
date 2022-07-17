package com.travdir;

public class Author {
    public String name;
    public String email;
    public char sexe;

    public Author(String name, String email, char sexe) {
        this.name = name;
        this.email = email;
        this.sexe = sexe;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getSexe() {
        return sexe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sexe=" + sexe +
                '}';
    }
}
