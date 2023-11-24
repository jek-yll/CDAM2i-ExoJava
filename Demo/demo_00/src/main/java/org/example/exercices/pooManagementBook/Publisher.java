package org.example.exercices.pooManagementBook;

public class Publisher  {

    private static Integer count;

    private int id;
    private String plublisherName;

    public Publisher(int id, String plublisherName) {
        this.id = id;
        this.plublisherName = plublisherName;
    }

    public Publisher() {
    }

    public static Integer getCount() {
        return count;
    }

    public static void setCount(Integer count) {
        Publisher.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlublisherName() {
        return plublisherName;
    }

    public void setPlublisherName(String plublisherName) {
        this.plublisherName = plublisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", plublisherName='" + plublisherName + '\'' +
                '}';
    }
}
