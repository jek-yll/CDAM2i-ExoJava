package org.example.exercices.pooManagementBook;

public class Author {

    private static Integer count;

    private int id;
    private String firstname, lastname;

    public Author(int id, String lastname, String firstname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Author() {
    }

    public int getId() {
        return id;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
