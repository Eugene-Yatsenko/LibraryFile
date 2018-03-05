package by.htp.filelibrary.view.impl;

import by.htp.filelibrary.bean.Book;
import by.htp.filelibrary.view.BookOperations;

public class BookOperationImpl implements BookOperations {
	public void printBook(Book b) {
		System.out.print("[id="+b.getId()+", title="+b.getTitle()+", year="
				+b.getYear()+", author="+b.getAuthor().getName()+" "
					+b.getAuthor().getSurname()+"]");
	}
}
