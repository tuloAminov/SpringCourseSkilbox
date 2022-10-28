package com.example.MyBookShopApp.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AuthorService {

    private JdbcTemplate jdbcTemplate;
    private static Connection connection;

    @Autowired
    public AuthorService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Author> getAuthorsData() {
        List<Author> authors = jdbcTemplate.query("SELECT author FROM books", (ResultSet rs, int rowNum)->{
            Author author = new Author();
            author.setAuthor(rs.getString("author"));
            return author;
        });

        return new ArrayList<>(authors);
    }

    public Map<Character, String[]> getAuthorsMap() {
        Map<Character, String[]> authors = new HashMap<>();
        for (char symbol : alphabet()) {
            List<Author> list = getAuthorsData();
            StringBuilder stringBuilder = new StringBuilder();
            for (Author author : list) {
                if (author.getAuthor().charAt(0) == symbol)
                    stringBuilder.append(author.getAuthor()).append("&");
            }

            authors.put(symbol, stringBuilder.toString().split("&"));
        }

        return authors;
    }

    public char[] alphabet() {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }
}
