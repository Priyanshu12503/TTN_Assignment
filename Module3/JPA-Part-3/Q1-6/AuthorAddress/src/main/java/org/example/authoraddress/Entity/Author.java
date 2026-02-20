package org.example.authoraddress.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Q3 - Introduce a List of subjects for author.
    @ElementCollection
    private List<String> subjects;

    //Q2- Created instance variable of Address class inside Author class and save it as embedded object.
    @Embedded
    private Adderess adderess;

    //Q6- Implemented One to One mapping

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "book_id")
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Adderess getAdderess() {
        return adderess;
    }

    public void setAdderess(Adderess adderess) {
        this.adderess = adderess;
    }
}
