package com.example.MyBookShopApp.data;

import com.example.mybookshopapp.data.Book;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Query("from Book")
    List<Book> customFindAllBooks();
}
