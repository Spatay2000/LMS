package kz.iitu.library.controller;

import kz.iitu.library.model.User;
import kz.iitu.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public User create(@RequestBody User o){
        return userService.create(o);
    }
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public User get(@PathVariable Long id){
        return userService.getById(id);
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public User update(@RequestBody User o){
        return userService.update(o);
    }
    @RequestMapping(value = "/get/all",method = RequestMethod.GET)
    public List<User> get(){
        return userService.getAll();
    }
    @RequestMapping(value = "/get/name",method = RequestMethod.GET)
    public List<User> getByName(@Param(value = "fullName")String name){
        return userService.getAllByName(name);
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }
}
