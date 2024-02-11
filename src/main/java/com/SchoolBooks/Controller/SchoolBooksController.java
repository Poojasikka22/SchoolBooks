package com.SchoolBooks.Controller;

import com.SchoolBooks.Model.SchoolBooks;
import com.SchoolBooks.Services.GetAllBooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("books")
public class SchoolBooksController<book> {

    //Save a book
    @PostMapping("addBooks")
    public String addNewBook(@RequestBody SchoolBooks Book) {
        return getAllBooksService.addNewBook(Book);
    }

    //Fetch all books
    @Autowired
    GetAllBooksService getAllBooksService;

    @GetMapping("allBooks")
    public List<SchoolBooks> getALLBooks() {
        return getAllBooksService.getAllBooks();
    }

    //Fetch Book by book id/name
    @GetMapping("BooksByid/{id}")
    public Optional<SchoolBooks> getAllBooksId(@PathVariable int id){
        return getAllBooksService.getAllBooksId(id);
    }
    @GetMapping("booksByName/{name}")
    public List <SchoolBooks> getBooksByName(@PathVariable String name){
        return getAllBooksService.getBooksByName(name);
}

    //Update book name


    //Delete a book by book id
    @DeleteMapping("Remove")
    public String removeBook(@RequestBody SchoolBooks Book) {
        return getAllBooksService.removeBook(Book);

    }
    @DeleteMapping("Removebyid/{id}")
    public String removeById(@PathVariable int id){
        return getAllBooksService.removeById(id);
    }
}
