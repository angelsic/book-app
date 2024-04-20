package com.books.book;

import com.books.book.repository.entity.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
		Book book1 = new Book();
		Book book2 = new Book("Donde todo brilla", "Alice Kellen", "0010318356", 180.90);

		book2.showDetails();
		book2.setPrice(290.15);
		book2.showDetails();

	}

}
