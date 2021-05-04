package kz.iitu.library.service;

import kz.iitu.library.model.Book;

import java.util.List;

public interface BookService {
    Book create(Book o);
    Book update(Book o);
    void delete(Long o);
    Book getById(Long id);
    List<Book> getAll();
    List<Book> getAllByName(String name);
    List<Book> getAllByDesc(String desc);
    List<Book> getAllByAuthor(Long user);
}
