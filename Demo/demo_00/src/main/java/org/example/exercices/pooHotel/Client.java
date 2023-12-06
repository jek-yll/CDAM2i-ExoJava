<<<<<<< HEAD
package org.example.exercices.pooHotel;

public class Client {

    private static long count;

    private final long id;
    private String firstname, lastname, phoneNumber;

    public Client(String firstname, String lastname, String phoneNumber) {
        this.id = count++;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
=======
package org.example.exercices.pooHotel;

public class Client {
    private static Long count = 0L;
    private Long id;
    private String firstname, lastname, phoneNumber;

    public Client( String firstname, String lastname, String phoneNumber) {
        this.id = count++;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    public static Long getCount() {
        return count;
    }

    public static void setCount(Long count) {
        Client.count = count;
    }

    public Long getId() {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
>>>>>>> 85da024796b30a7579441f420183b7aa98ac9e0f
