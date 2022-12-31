package com.bookmanagement.booklendingsystem.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "text_book")
    private int textBook=0;

    @Column(name = "scientific_book")
    private int scientificBook=0;

    @Column(name="reading_book")
    private int readingBook=0;

    @Column(name = "encyclopedia")
    private int encyclopedia=0;

    public int getTextBook() {
        return textBook;
    }

    public void setTextBook(int textBook) {
        this.textBook = textBook;
    }

    public int getScientificBook() {
        return scientificBook;
    }

    public void setScientificBook(int scientificBook) {
        this.scientificBook = scientificBook;
    }

    public int getReadingBook() {
        return readingBook;
    }

    public void setReadingBook(int readingBook) {
        this.readingBook = readingBook;
    }

    public int getEncyclopedia() {
        return encyclopedia;
    }

    public void setEncyclopedia(int encyclopedia) {
        this.encyclopedia = encyclopedia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



}
