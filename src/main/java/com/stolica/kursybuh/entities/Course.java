package com.stolica.kursybuh.entities;

//класс курсов и его поля - айди, название, аббрев, цена, ссылка и.т.д
public class Course {

    private int id;

    //название для сайта
    private String title;

    //аббревиатура Карбух
    private String abbr;

    private int price;

    //чпу - ссылка на страницу курса
    private String link;

    //геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    //пустой дефолтный конструктор
    public Course(){

    }

    //и конструктор, который задает сразу все поля
    public Course(int id, String title, String abbr, int price, String link) {
        this.id = id;
        this.title = title;
        this.abbr = abbr;
        this.price = price;
        this.link = link;
    }

}
