package com.company;

public class Presentation extends Document implements Cloneable{
    private Author author;
    private String topic;
    private int slides;

    public Presentation() {
        this.topic = "";
        this.slides = 0;
    }

    public Presentation(Author author, String topic, int slides) {
        this.author = author;
        this.topic = topic;
        this.slides = slides;
    }

    @Override
    public String toString() {
        return "Presentation{" +
                "author=" + author +
                ", topic='" + topic + '\'' +
                ", slides=" + slides +
                '}';
    }

    @Override
    public void submit() {
        System.out.println("Your presentation is submitted.");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Presentation clonedPresentation = (Presentation) super.clone();
        clonedPresentation.author = (Author) author.clone();
        return clonedPresentation;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getSlides() {
        return slides;
    }

    public void setSlides(int slides) {
        this.slides = slides;
    }
}
