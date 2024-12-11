package com.example.weblab.Service;

import com.example.weblab.model.Books;
import com.example.weblab.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class BookServiceImp implements BooksService {

    @Autowired
    private BooksRepository booksRepository;

    @Override
    public List<Books> getBooks() {
        // Iterable<Books> dönüşümünü List<Books> olarak yapıyoruz
        Iterable<Books> booksIterable = booksRepository.findAll();
        return StreamSupport.stream(booksIterable.spliterator(), false)
                .collect(Collectors.toList());
    }


    @Override
    public Books getBook(long id) {
        return booksRepository.findById(id).orElse(null);
    }

    @Override
    public void addBook(Books book) {
        booksRepository.save(book);
    }

    @Override
    public void updateBook(Books book) {
        booksRepository.save(book);
    }

    @Override
    public void deleteBook(long id) {
        booksRepository.deleteById(id);
    }
}

