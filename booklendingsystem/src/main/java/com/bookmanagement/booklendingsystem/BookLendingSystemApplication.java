package com.bookmanagement.booklendingsystem;

import com.bookmanagement.booklendingsystem.Services.BorrowBookService;
import com.bookmanagement.booklendingsystem.entities.Book;
import com.bookmanagement.booklendingsystem.entities.BorrowBook;
import com.bookmanagement.booklendingsystem.repositories.BookRepository;
import com.bookmanagement.booklendingsystem.repositories.BorrowBookRepository;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootApplication
public class BookLendingSystemApplication {


	public static void main(String[] args) {

		SpringApplication.run(BookLendingSystemApplication.class, args);

	}


	@Bean
	public OpenAPI customOpenAPI(@Value("${application-description}") String description,
								 @Value("${application-version}") String version){
		return new OpenAPI()
				.info(new Info()
				.title("Book Lending System")
				.version(version)
				.description(description)
				.license(new License().name("Book Lending System License")));
	}

}
