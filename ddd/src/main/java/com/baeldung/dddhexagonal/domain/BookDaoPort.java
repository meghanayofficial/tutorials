package main.java.com.baeldung.dddhexagonal.domain;

public interface BookDaoPort {
  Book get(String isbn);
}
