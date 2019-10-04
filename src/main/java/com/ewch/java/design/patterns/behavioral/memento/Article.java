package com.ewch.java.design.patterns.behavioral.memento;

public class Article {

    private String author;
    private String text;

    public Article(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public ArticleMemento createMemento() {
        ArticleMemento memento = new ArticleMemento(author, text);
        return memento;
    }

    public void restoreMemento(ArticleMemento memento) {
        this.author = memento.getAuthor();
        this.text = memento.getText();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
