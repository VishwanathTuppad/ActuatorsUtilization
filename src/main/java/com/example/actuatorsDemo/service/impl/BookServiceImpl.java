package com.example.actuatorsDemo.service.impl;

import com.example.actuatorsDemo.entity.Book;
import com.example.actuatorsDemo.repo.BookRepo;
import com.example.actuatorsDemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }

    public Book saveBook(Book book) {
        return bookRepo.save(book);
    }

    public void deleteBook(Long id) {
        bookRepo.deleteById(id);
    }
}

