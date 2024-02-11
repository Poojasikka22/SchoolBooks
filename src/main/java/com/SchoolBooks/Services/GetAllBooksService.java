package com.SchoolBooks.Services;

import com.SchoolBooks.DAO.SchoolBooksDao;
import com.SchoolBooks.Model.SchoolBooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GetAllBooksService {
    @Autowired
    SchoolBooksDao schoolBooksDao;

    public List<SchoolBooks> getAllBooks() {

        return schoolBooksDao.findAll();
    }

public List<SchoolBooks> getBooksByName(String name){
        return schoolBooksDao.getBooksByName(name);
}

    public String addNewBook(SchoolBooks Book) {
        schoolBooksDao.save(Book);
return "Success";
    }

    public String removeBook(SchoolBooks Book) {
        schoolBooksDao.delete(Book);
        return "Removed";
    }

    public String removeById(int id) {
        schoolBooksDao.deleteById(id);
        return "Removed";
    }

    public Optional<SchoolBooks> getAllBooksId(int id) {
        return schoolBooksDao.findById(id);
    }
}
