package com.example.library_management_system.controller;

import com.example.library_management_system.model.Book;
import com.example.library_management_system.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    LibraryService service;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        return service.addBook(book);
    }

    @GetMapping("/getBooks")
    public List<Book> getBooks(){
        return service.getBooks();
    }

    @PutMapping("/updateBookName/{name}/{id}")
    public String updateBookName(@PathVariable String name, @PathVariable long id){
        return  service.updateBookName(name,id);
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable long id){
        return service.deleteBook(id);
    }

    @GetMapping("/getBookById/{id}")
    public Book getBookById(@PathVariable long id){
        return service.getBookById(id);
    }

    @GetMapping("/findAvailableBooks")
    public List<Book> findAvailableBooks(){
        return service.findAvailableBooks();
    }

    @GetMapping("/findAllocatedBooks")
    public List<Book> findAllocatedBooks(){
        return service.findAllocatedBooks();
    }

    @PutMapping("/allocateBook")
    public String allocateBook(@RequestParam long id, @RequestParam String studentName){
        return service.allocateBook(id,studentName);
    }

}
