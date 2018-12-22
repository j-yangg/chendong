package org.chendong.studygraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.chendong.studygraphql.entity.Author;
import org.chendong.studygraphql.entity.Book;
import org.chendong.studygraphql.model.BookInput;
import org.springframework.stereotype.Component;

/**
 * @classname: Mutation
 * @description:
 * @author: Danny Chen
 * @create: 2018-12-22 17:02
 */
@Component
public class Mutation implements GraphQLMutationResolver {


    public Author newAuthor(String firstName, String lastName) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        author.setId(1l);
        return author;
    }

    public Book newBook(String title, String isbn, int pageCount, long authorId) {
        Book book = new Book();
        book.setTitle(title);
        book.setIsbn(isbn);
        book.setPageCount(pageCount);
        return book;
    }

    public Book saveBook(BookInput input) {
        Book book = new Book();
        book.setTitle(input.getTitle());
        book.setIsbn(input.getIsbn());
        book.setPageCount(input.getPageCount());
        return book;
    }

    public Boolean deleteBook(long id) {
        return true;
    }

    public Book updateBookPageCount(int pageCount, long id) {
        return new Book();
    }
}

