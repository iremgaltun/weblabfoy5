package com.example.weblab.Service;

import com.example.weblab.model.Books;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface BooksService {
    List<Books> getBooks();
    Books getBook(long id);
    void addBook(Books book);
    void updateBook(Books book);
    void deleteBook(long id);

}