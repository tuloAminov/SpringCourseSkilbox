package ru.springMVC.project.app.services;

import org.apache.log4j.Logger;
import ru.springMVC.project.web.dto.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository implements ProjectRepository<Book> {

    private final Logger logger = Logger.getLogger(BookRepository.class);
    private final List<Book> repo = new ArrayList<>();

    @Override
    public List<Book> retreiveAll() {
        return new ArrayList<>(repo);
    }

    @Override
    public void store(Book book) {
        book.setId(book.hashCode());
        logger.info("store new book: " + book);
        repo.add(book);
    }

    @Override
    public boolean removeItemById(Integer bookIdToRemove) {
        for (Book book : retreiveAll()) {
            if (book.getId().equals(bookIdToRemove)) {
                logger.info("remove book completed: " + book);
                return repo.remove(book);
            }
        }
        return false;
    }

    @Override
    public boolean removeItemByRegex(String bookRegexToRemove) {
        boolean res = false;
        for (Book book : retreiveAll()) {
            if (book.getAuthor().equals(bookRegexToRemove) || book.getTitle().equals(bookRegexToRemove) || String.valueOf(book.getSize()).equals(bookRegexToRemove)) {
                logger.info("remove book completed: " + book);
                repo.remove(book);
                res = true;
            }
        }
        return res;
    }
}
