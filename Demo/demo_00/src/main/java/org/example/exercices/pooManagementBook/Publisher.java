package org.example.exercices.pooManagementBook;

public class Publisher  {

    private static Integer count;

    private int id;
    private String plublisherName;

    public Publisher(String plublisherName) {
        this.id = count++;
        this.plublisherName = plublisherName;
    }

    public Publisher() {
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", plublisherName='" + plublisherName + '\'' +
                '}';
    }
}
