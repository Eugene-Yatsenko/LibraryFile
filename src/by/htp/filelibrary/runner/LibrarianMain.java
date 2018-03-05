package by.htp.filelibrary.runner;

import by.htp.filelibrary.bean.Book;
import by.htp.filelibrary.bean.Catalog;
import by.htp.filelibrary.logic.LibraryService;
import by.htp.filelibrary.logic.impl.LibraryServiceImpl;
import by.htp.filelibrary.view.BookOperations;
import by.htp.filelibrary.view.impl.BookOperationImpl;

public class LibrarianMain {

	public static void main(String[] args) throws Exception {
		
		LibraryService service = new LibraryServiceImpl();
		Catalog booksCatalog = service.getMainCatalog();
		viewCatalogInfo(booksCatalog);
	}
	
	private static void viewCatalogInfo(Catalog catalog) {
		BookOperationImpl bo = new BookOperationImpl();
		for (Book book: catalog.getBooks()) {
			System.out.println();
			bo.printBook(book);
		}
	}

}
