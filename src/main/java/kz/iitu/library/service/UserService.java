package kz.iitu.library.service;

import kz.iitu.library.model.User;

import java.util.List;

public interface UserService {
    User create(User o);
    User update(User o);
    void delete(Long o);
    User getById(Long id);
    List<User> getAll();
    List<User> getAllByName(String name);
}
