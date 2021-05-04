package kz.iitu.library.controller;

import kz.iitu.library.model.UserBooks;
import kz.iitu.library.service.UserBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/books")
public class UserBooksController {
    
    @Autowired
    private UserBooksService userBooksService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public UserBooks create(@RequestBody UserBooks o){
        return userBooksService.create(o);
    }
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public UserBooks get(@PathVariable Long id){
        return userBooksService.getById(id);
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public UserBooks update(@RequestBody UserBooks o){
        return userBooksService.update(o);
    }
    @RequestMapping(value = "/get/all",method = RequestMethod.GET)
    public List<UserBooks> get(){
        return userBooksService.getAll();
    }
    @RequestMapping(value = "/get/user/{id}",method = RequestMethod.GET)
    public List<UserBooks> getByUser(@PathVariable Long id){
        return userBooksService.getAllByUser(id);
    }
    @RequestMapping(value = "/get/book/{id}",method = RequestMethod.GET)
    public List<UserBooks> getByBook(@PathVariable Long id){
        return userBooksService.getAllByBook(id);
    }
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    public void delete(@RequestBody UserBooks o){
        userBooksService.delete(o);
    }
}
