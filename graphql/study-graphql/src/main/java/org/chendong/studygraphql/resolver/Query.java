package org.chendong.studygraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.chendong.studygraphql.entity.Author;
import org.chendong.studygraphql.entity.Book;
import org.chendong.studygraphql.repository.AuthorRepository;
import org.chendong.studygraphql.repository.BookRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @classname: Query
 * @description:
 * @author: Danny Chen
 * @create: 2018-12-22 17:03
 */
@Component
public class Query implements GraphQLQueryResolver {

    //private AuthorRepository authorRepository;

    //private BookRepository bookRepository;

    public Author findOneAuthor(Long id) {
        return new Author();
    }
    public List<Author> findAllAuthors() {
        List<Author> list = new ArrayList<Author>();
        list.add(new Author());
        return list;
    }
    public Long countAuthors() {
        return 3l;
    }
    public List<Book> findAllBooks() {
        List<Book> list = new ArrayList<Book>();
        list.add(new Book());
        return list;
    }
    public Long countBooks() {
        return 9l;
    }

}
