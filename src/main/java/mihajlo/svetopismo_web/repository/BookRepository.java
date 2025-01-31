package mihajlo.svetopismo_web.repository;

import mihajlo.svetopismo_web.model.Book;
import mihajlo.svetopismo_web.service.BookService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b FROM Book b WHERE LOWER(b.bookName) LIKE LOWER(:keyword)")
    List<Book> searchBooksByTitle(@Param("keyword") String bookTitle);

    @Query("SELECT b FROM Book b WHERE LOWER(b.abbreviation) LIKE LOWER(:keyword)")
    List<Book> searchBooksByAbbreviation(@Param("keyword") String abbreviation);

}
