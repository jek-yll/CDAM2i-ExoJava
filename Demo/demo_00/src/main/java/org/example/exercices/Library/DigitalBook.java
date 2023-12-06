package org.example.exercices.Library;

public class DigitalBook extends Book{

    private String format;
    private Integer size;

    public DigitalBook(String title, String author, String format, Integer size) {
        super(title, author);
        this.format = format;
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "DigitalBook" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", format=" + format +
                ", statut='"+ statut + '\'' +
                '.';
    }
}
