package project.techmaster.vn.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.techmaster.vn.demo.model.Book;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final List<Book> books;
    public BookController() {
        books = new ArrayList<>();
        books.add(new Book("OX-13", "Gone with the wind", "Cuong", 1945));
        books.add(new Book("OX-14", "Chi Dau", "Nam Cao", 1943));
    }

    @GetMapping
    public List<Book> getBooks() {
        return books;
    }
//    @GetMapping("getAllBooks")
//    public List<Book> getAllBooks() {
//        return books;
//    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable String id) {
        for (Book book : books) {
            System.out.println(book.getId());
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

}
