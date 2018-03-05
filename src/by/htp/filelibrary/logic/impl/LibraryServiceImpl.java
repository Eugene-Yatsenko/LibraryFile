package by.htp.filelibrary.logic.impl;

import by.htp.filelibrary.bean.Book;
import by.htp.filelibrary.bean.Catalog;
import by.htp.filelibrary.dao.BookDao;
import by.htp.filelibrary.dao.impl.FileBookDaoImpl;
import by.htp.filelibrary.logic.LibraryService;

public class LibraryServiceImpl implements LibraryService {

	private BookDao dao = new FileBookDaoImpl();
	
	@Override
	public Catalog getMainCatalog() throws Exception {
		Catalog catalog = new Catalog();
		Book[] books = dao.readAll();
		catalog.setBooks(books);
		catalog.setTitle("HTP_TAT_7_BOOK_CATALOG");
		
		
		return catalog;
	}
}
