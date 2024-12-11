package com.example.weblab.Controller;

import com.example.weblab.Service.BooksService;
import com.example.weblab.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.weblab.model.Books; // Doğru sınıfı import edin.


import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BooksService booksService;

    @GetMapping
    public String listBooks(Model model) {
        List<Books> book = booksService.getBooks(); // Doğru sınıf: Books
        model.addAttribute("books", book);
        return "books/list";
    }
    @GetMapping("/add")
    public String addBook(Model model) {
        model.addAttribute("book", new Books());
        return "books/add";
    }
    @PostMapping("/add") public String addBook(Books book, Model model) {
        booksService.addBook(book);
        return "redirect:/books/list";
    }
    @GetMapping("edit/{id}") public String editBook(Model model, @PathVariable int id) {
        Books book = booksService.getBook(id);
        model.addAttribute("book", book);
        return "books/edit";
    }
    @PostMapping("/edit/{id}")
    public String editBook(Books book, Model model) {
        booksService.updateBook(book);
        return "redirect:/books";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable long id) {
        booksService.deleteBook(id);
        return "redirect:/books";  // Listeye yönlendirme
    }

}
