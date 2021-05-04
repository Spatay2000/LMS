package kz.iitu.library.repository;

import kz.iitu.library.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    User getById(Long id);
    List<User> getAllByFullNameContaining(String fullName);
    User getByUsername(String username);
}
