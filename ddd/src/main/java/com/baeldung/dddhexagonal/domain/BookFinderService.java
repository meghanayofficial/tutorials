package main.java.com.baeldung.dddhexagonal.domain;

public class BookFinderService {
  private BookDaoPort bookDaoPort;

  public BookFinderService(BookDaoPort bookDaoPort) {
    this.bookDaoPort = bookDaoPort;
  }

  public Book search(String isbn) {
    return bookDaoPort.get(isbn);
  }
}
