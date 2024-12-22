package fact.it.bookservice.service;

import fact.it.bookservice.dto.BookRequest;
import fact.it.bookservice.dto.BookResponse;
import fact.it.bookservice.model.Book;
import fact.it.bookservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class BookService {
    private final BookRepository bookRepository;

    public BookResponse createBook(BookRequest bookRequest) {
        Book book = new Book();
        book.setTitle(bookRequest.getTitle());
        book.setAuthor(bookRequest.getAuthor());
        book.setIsbn(bookRequest.getIsbn());
        book.setAvailableCopies(bookRequest.getAvailableCopies());

        Book savedBook = bookRepository.save(book);
        return mapToResponse(savedBook);
    }

    public List<BookResponse> getAllBooks() {
        return bookRepository.findAll().stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    public List<BookResponse> getBooksByTitle(List<String> titles) {
        List<Book> books = bookRepository.findByTitleIn(titles);
        return books.stream().map(this::mapToResponse).collect(Collectors.toList());
    }

    private BookResponse mapToResponse(Book book) {
        return new BookResponse(book.getId(), book.getTitle(), book.getAuthor(), book.getIsbn(), book.getAvailableCopies());
    }
}