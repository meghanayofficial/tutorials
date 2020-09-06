package main.java.com.baeldung.dddhexagonal.infrastructure;

import main.java.com.baeldung.dddhexagonal.domain.Book;
import main.java.com.baeldung.dddhexagonal.domain.BookDaoPort;

public class BookMongoDbAdapter implements BookDaoPort {

  @Override
  public Book get(String isbn) {
    // TODO implement MongoDb logic here

    return null;
  }
}
