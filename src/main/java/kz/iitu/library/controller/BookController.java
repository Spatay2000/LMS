package kz.iitu.library.controller;

import kz.iitu.library.model.Book;
import kz.iitu.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Book create(@RequestBody Book o){
        return bookService.create(o);
    }
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    public Book get(@PathVariable Long id){
        return bookService.getById(id);
    }
    @RequestMapping(value = "/get/all",method = RequestMethod.GET)
    public List<Book> get(){
        return bookService.getAll();
    }
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public Book update(@RequestBody Book o){
        return bookService.update(o);
    }
    @RequestMapping(value = "/get/author/{id}",method = RequestMethod.GET)
    public List<Book> getAllByAuthor(@PathVariable Long id){
        return bookService.getAllByAuthor(id);
    }
    @RequestMapping(value = "/get/name",method = RequestMethod.GET)
    public List<Book> getByName(@Param(value = "fullName")String name){
        return bookService.getAllByName(name);
    }
    @RequestMapping(value = "/get/desc",method = RequestMethod.GET)
    public List<Book> getByDesc(@Param(value = "desc")String desc){
        return bookService.getAllByDesc(desc);
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        bookService.delete(id);
    }
}
