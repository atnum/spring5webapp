package com.anup.controller;

import com.anup.domain.Book;
import com.anup.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/books")
    public String getBook(Model model) {

        model.addAttribute("books", bookRepository.findAll());

        Iterable<Book> books = new ArrayList<>();

        books = bookRepository.findAll();

        for (Book book: books){
            System.out.println(book);
        }

        return "index";

    }


}
