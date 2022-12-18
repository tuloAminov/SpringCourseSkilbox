package com.example.MyBookShopApp.data;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Author findAuthorById(Long id);
}
