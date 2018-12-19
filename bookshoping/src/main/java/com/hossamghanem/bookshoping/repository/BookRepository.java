package com.hossamghanem.bookshoping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hossamghanem.bookshoping.domain.Book;

import java.util.List;
import java.util.Set;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);

    Set<Book> findByTitleContaining(String keyword);


}
