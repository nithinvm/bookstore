package com.nithin.bookstore;

import com.nithin.bookstore.entity.Book;
import com.nithin.bookstore.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "bookCategory", path="book-category")
public interface CategoryRepository extends JpaRepository<BookCategory, Long> {
}
