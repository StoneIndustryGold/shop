package shop.mapper;

import java.util.List;

import shop.pojo.Books;

public interface BooksMapper {
	
	List<Books> findAll();
}
