package in.nileshit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nileshit.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{

}