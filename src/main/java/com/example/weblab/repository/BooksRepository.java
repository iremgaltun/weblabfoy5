package com.example.weblab.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.weblab.model.Books;

public interface BooksRepository extends CrudRepository<Books, Long> {
}
