package com.Vaishali.springMvcFirstApp.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.Vaishali.springMvcFirstApp.model.Book;

@Controller
public class BookController {

	@GetMapping("/getAllBooks")
	public ModelAndView getBookData() {
		
		Book book=new Book();
		book.setBookId(111);
		book.setBookName("Java");
		book.setBookPrice(120.0);
		                                                 
		Book book1=new Book();
		book1.setBookId(222);
		book1.setBookName("Python");
		book1.setBookPrice(300.0);
		
		Book book2=new Book();
		book2.setBookId(333);
		book2.setBookName("C++");
		book2.setBookPrice(500.0);
		
		List<Book> books = new ArrayList<Book>();
		 books.add(book);
		 books.add(book1);
		 books.add(book2);
		 
		ModelAndView mav=new ModelAndView();
		mav.addObject("BOOKS", books);
		mav.setViewName("books");
		return mav;
		
		
	}
}
