package by.htp.filelibrary.dao.impl;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import by.htp.filelibrary.bean.Author;
import by.htp.filelibrary.bean.Book;
import by.htp.filelibrary.dao.BookDao;

public class FileBookDaoImpl implements BookDao{
	
	private static final String FILE_PATH = "resources/Library.txt";

	@SuppressWarnings("unused")
	@Override
	public Book[] readAll() throws Exception {
		Book[] books = new Book[5];
		BufferedReader abc;
		
		try {
			abc = new BufferedReader(
					new FileReader(FILE_PATH));
			String line;
			int count = 0;
			
			while((line = abc.readLine()) != null) {
					books[count] = parseStringToBook(count, line);
//					System.out.println(line);
					count ++ ;
				  }
			abc.close();	
		} catch (FileNotFoundException e) {
			System.out.println("Please check the data file location at 'Resources' folder");
			e.printStackTrace();
		}	
		return books;
	}
	
	public Book parseStringToBook(int authorId, String s) {
		Book b = new Book();
		String[] arr = new String[5];
		arr = s.split(",");
		b.setId(Integer.parseInt(arr[0]));
		b.setTitle(arr[1].trim());
		b.setYear(Integer.parseInt(arr[2].trim()));
		Author author = new Author(authorId, arr[3].trim(), arr[4].trim());
		b.setAuthor(author);
		return b;
	}

}
