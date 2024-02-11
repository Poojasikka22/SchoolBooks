package com.SchoolBooks.DAO;

import com.SchoolBooks.Model.SchoolBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SchoolBooksDao extends JpaRepository<SchoolBooks, Integer> {

    List<SchoolBooks>getBooksByName(String name);




}
