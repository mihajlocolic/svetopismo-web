package mihajlo.svetopismo_web.repository;

import mihajlo.svetopismo_web.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
