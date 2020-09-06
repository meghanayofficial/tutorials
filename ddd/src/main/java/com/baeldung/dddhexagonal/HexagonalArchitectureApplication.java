package main.java.com.baeldung.dddhexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.baeldung.dddhexagonal")
public class HexagonalArchitectureApplication {
  public static void main(String[] args) {
    SpringApplication.run(com.baeldung.ddd.PersistingDddAggregatesApplication.class, args);
  }
}
