package com.stolica.kursybuh.entities;

import javax.persistence.*;

//класс курсов и его поля - айди, название, аббрев, цена, ссылка и.т.д
@Entity
@Table(name = "courses", schema = "dagon_data", catalog = "")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    //название курса
    @Column(name = "title")
    private String title;

    //аббревиатура Карбух
    @Column(name = "abbr")
    private String abbr;

    //проверка курс или семинар
    @Column(name = "is_course")
    private boolean isCourse;

    //проверка на модуль
    @Column(name = "is_module")
    private boolean isModule;

    //ак.часы
    @Column(name = "duration")
    private int duration;

    //айди категории
    @Column(name = "category_id")
    private int categoryId;

    //айди документа об обучении
    @Column(name = "diploma_id")
    private int diplomaId;

    //айди Карбуха
    @Column(name = "karbuh_id")
    private int karbuhId;

    //айди присваеваемой квалификации
    @Column(name = "qualification_id")
    private int qualificationId;

    //базовая стоимость курса
    @Column(name = "basic_price")
    private int basicPrice;



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

    public boolean isCourse() {
        return isCourse;
    }

    public void setCourse(boolean course) {
        isCourse = course;
    }

    public boolean isModule() {
        return isModule;
    }

    public void setModule(boolean module) {
        isModule = module;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getDiplomaId() {
        return diplomaId;
    }

    public void setDiplomaId(int diplomaId) {
        this.diplomaId = diplomaId;
    }

    public int getKarbuhId() {
        return karbuhId;
    }

    public void setKarbuhId(int karbuhId) {
        this.karbuhId = karbuhId;
    }

    public int getQualificationId() {
        return qualificationId;
    }

    public void setQualificationId(int qualificationId) {
        this.qualificationId = qualificationId;
    }

    public int getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(int basicPrice) {
        this.basicPrice = basicPrice;
    }

    //пустой дефолтный конструктор
    public Course() {

    }


    //и конструктор, который задает сразу все поля
    public Course(String title, String abbr, boolean isCourse, boolean isModule, int duration, int categoryId, int diplomaId, int karbuhId, int qualificationId, int basicPrice) {
        this.title = title;
        this.abbr = abbr;
        this.isCourse = isCourse;
        this.isModule = isModule;
        this.duration = duration;
        this.categoryId = categoryId;
        this.diplomaId = diplomaId;
        this.karbuhId = karbuhId;
        this.qualificationId = qualificationId;
        this.basicPrice = basicPrice;
    }

    //вывод инфы о курсе в консоль!!!
    @Override
    public String toString(){
        return String.format("Courses: [id = %d, title = %s, abbr = %s, is_course = %b, is_module = %b, duration = %d, category_id = %d, diploma_id = %d, karbuh_id = %d, qualification_id = %d, basic_price = %s]", id, title, abbr, isCourse, isModule, duration, categoryId, diplomaId, karbuhId, qualificationId, basicPrice);
    }

}
