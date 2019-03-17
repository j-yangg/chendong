package org.chendong.studygraphql.model;

/**
 * @classname: BookInput
 * @description:
 * @author: Danny Chen
 * @create: 2018-12-22 17:01
 */
public class BookInput {
    private String title;

    private String isbn;

    private int pageCount;

    private long authorId;

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

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }
}

