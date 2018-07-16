package shop.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.mapper.BooksMapper;
import shop.pojo.Books;
import shop.sevice.BooksService;
@Service
public class BooksImpl implements BooksService {
	private BooksMapper booksMapper;
	
	@Autowired
	public BooksImpl(BooksMapper booksMapper) {
		this.booksMapper = booksMapper;
	}


	@Override
	public List<Books> findAll() {
		
		return booksMapper.findAll();
	}

}
