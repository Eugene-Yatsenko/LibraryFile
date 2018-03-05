package by.htp.filelibrary.logic;

import by.htp.filelibrary.bean.Book;
import by.htp.filelibrary.bean.Catalog;
import by.htp.filelibrary.bean.Author;

public interface LibraryService {
	Catalog getMainCatalog() throws Exception;
}
