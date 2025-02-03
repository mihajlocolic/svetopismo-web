package mihajlo.svetopismo_web.controller;


import mihajlo.svetopismo_web.model.Book;
import mihajlo.svetopismo_web.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/knjige")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public List<Book> getAllBooks() {
        return bookService.showAll();
    }

    @RequestMapping(value = "/pretraga/{id}", method = RequestMethod.GET)
    public Optional<Book> getBookById(@PathVariable long id) {
        return bookService.findBookById(id);
    }

    @RequestMapping(value = "/ime", method = RequestMethod.GET)
    public List<Book> findBooksByName(@RequestParam(value = "keyword") String bookTitle) {
        return bookService.findByTitle(bookTitle.trim());
    }

    @RequestMapping(value = "/skracenica", method = RequestMethod.GET)
    public List<Book> findBooksByAbbreviation(@RequestParam(value = "keyword") String abbreviation) {
        return bookService.findByAbbreviation(abbreviation.trim());
    }

}
