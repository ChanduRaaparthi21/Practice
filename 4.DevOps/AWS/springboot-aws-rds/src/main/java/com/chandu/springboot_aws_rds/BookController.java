package com.chandu.springboot_aws_rds;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
private BookRepo bookRepo;


    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
        return  bookRepo.save(book);
    }


    @GetMapping
    public List<Book> findBooks(){
        return bookRepo.findAll();
    }


    @GetMapping("/{id}")
    public Book findById(@PathVariable int id) throws Exception {
        Book book = bookRepo.findById(id).orElseThrow(()->new Exception ("Book not found"));
        return book;
    }

}
