package shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.pojo.Books;
import shop.sevice.BooksService;

@Controller
public class BooksController {
		private BooksService booksService;
		
		@Autowired
		public BooksController(BooksService booksService) {
			this.booksService = booksService;
		}


		@RequestMapping(method=RequestMethod.GET,value="/books/list")
		public String booksfind(Model model) {
			System.out.println("测试");
			List<Books> books=booksService.findAll();
			model.addAttribute("books", books);
			for(Books b:books) {
				System.out.println("图书"+b.getTitle());
				
			}
			return "books-list";
		}
}
