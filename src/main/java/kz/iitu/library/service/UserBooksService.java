package kz.iitu.library.service;

import kz.iitu.library.model.UserBooks;

import java.util.List;

public interface UserBooksService {
    UserBooks create(UserBooks o);
    UserBooks update(UserBooks o);
    void delete(UserBooks o);
    UserBooks getById(Long id);
    List<UserBooks> getAll();
    List<UserBooks> getAllByUser(Long userId);
    List<UserBooks> getAllByBook(Long bookId);
}
