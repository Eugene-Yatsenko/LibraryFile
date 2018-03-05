package by.htp.filelibrary.dao;

import by.htp.filelibrary.bean.Book;

public interface BookDao {
	Book[] readAll() throws Exception;
}
