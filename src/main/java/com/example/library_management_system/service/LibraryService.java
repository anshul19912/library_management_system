package com.example.library_management_system.service;

import com.example.library_management_system.model.Book;
import com.example.library_management_system.respository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    LibraryRepository repository;

    public Book addBook(Book book){
       return repository.save(book);
    }

    public List<Book> getBooks(){
        return repository.findAll();
    }

    public String updateBookName(String name, long id){
        Book book = repository.getById(id);
        book.setBookName(name);
        repository.save(book);
        return "Book Name updated";
    }

    public String deleteBook(long id){
        repository.deleteById(id);
        return "Book deleted successfully";
    }

    public Book getBookById(long id){
        return repository.findById(id);
    }

    public List<Book> findAvailableBooks(){
       return repository.findAvailableBooks();
    }

    public List<Book> findAllocatedBooks(){
        return repository.findAllocatedBooks();
    }

    public String allocateBook(long id, String studentName){
        repository.allocateBook(id, studentName);
        return "Book allocated Successfully";
    }


}
