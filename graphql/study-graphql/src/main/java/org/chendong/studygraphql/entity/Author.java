package org.chendong.studygraphql.entity;

/**
 * @classname: Author
 * @description:
 * @author: Danny Chen
 * @create: 2018-12-22 17:01
 */
public class Author {

    private Long id = 0l;
    private String createdTime = "17:21";
    private String firstName = "Chen";
    private String lastName = "Dong";
    private Book books = new Book();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Book getBooks() {
        return books;
    }

    public void setBooks(Book books) {
        this.books = books;
    }
}
