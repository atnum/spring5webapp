package com.anup.bootstrap;

import com.anup.domain.Apple;
import com.anup.domain.Author;
import com.anup.domain.Book;
import com.anup.domain.Publisher;
import com.anup.repositories.AppleRepository;
import com.anup.repositories.AuthorRepository;
import com.anup.repositories.BookRepository;
import com.anup.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;
    private AppleRepository appleRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository, AppleRepository appleRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
        this.appleRepository = appleRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Publisher publisher = new Publisher();
        publisher.setName("foo");
        publisher.setAddress("12th Street, LA");
        publisherRepository.save(publisher);

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book  ddd = new Book("Domain Driven Design", "1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", publisher );
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);

        // Apple1
        Apple apple1 = new Apple("2010 Q1", 2666, 0, 2647);
        appleRepository.save(apple1);

        // Apple2
        Apple apple2 = new Apple("2010 Q2", 2778, 2294, 2441);
        appleRepository.save(apple2);

        // Apple3
        Apple apple3 = new Apple("2010 Q3", 4912, 1969, 2501);
        appleRepository.save(apple3);

        // Apple4
        Apple apple4 = new Apple("2010 Q4", 3767, 3597, 5689);
        appleRepository.save(apple4);

        // Apple5
        Apple apple5 = new Apple("2011 Q1", 6810, 1914, 2293);
        appleRepository.save(apple5);

        // Apple6
        Apple apple6 = new Apple("2011 Q2", 5670, 4293, 1881);
        appleRepository.save(apple6);

        // Apple7
        Apple apple7 = new Apple("2011 Q3", 4820, 3795, 1588);
        appleRepository.save(apple7);

        // Apple8
        Apple apple8 = new Apple("2011 Q4", 15073, 5967, 5175);
        appleRepository.save(apple8);

        // Apple9
        Apple apple9 = new Apple("2013 Q1", 10687, 4460, 2028);
        appleRepository.save(apple9);

        // Apple10
        Apple apple10 = new Apple("2020 Q2", 8432, 5713, 1791);
        appleRepository.save(apple10);
    }
}
