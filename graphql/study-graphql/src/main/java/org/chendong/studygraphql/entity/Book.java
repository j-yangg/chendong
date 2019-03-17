package org.chendong.studygraphql.entity;

/**
 * @classname: Author
 * @description:
 * @author: Danny Chen
 * @create: 2018-12-22 17:01
 */
public class Book {

    private Long id = 0l;
    private String title = "GraphQL Study";
    private String isbn = "xxx-xx-xxx";
    private Integer pageCount = 100;
    private String author = "danny";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
