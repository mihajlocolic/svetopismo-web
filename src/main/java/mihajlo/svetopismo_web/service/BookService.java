package mihajlo.svetopismo_web.service;

import mihajlo.svetopismo_web.model.Book;
import mihajlo.svetopismo_web.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> showAll() {
        return bookRepository.findAll();
    }

    public Optional<Book> findBookById(long id) {
        return bookRepository.findById(id);
    }

    public List<Book> findByTitle(String bookTitle) {
        String str = "%" + bookTitle + "%";
        return bookRepository.searchBooksByTitle(str.trim());
    }

    public List<Book> findByAbbreviation(String abbreviation) {
        String str = "%" + abbreviation + "%";
        return bookRepository.searchBooksByAbbreviation(str.trim());
    }

}
