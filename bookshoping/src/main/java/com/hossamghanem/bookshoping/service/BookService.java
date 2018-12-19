package com.hossamghanem.bookshoping.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.hossamghanem.bookshoping.domain.Book;

public interface BookService {
    List<Book> findAll();

    Optional<Book> findOne(Long id);

    Book save(Book book);

    List<Book> blurrysearch(String title);

    Void removeOne(Long id);

    Set<Book> blurrySearch(String title);
}
