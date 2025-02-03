package mihajlo.svetopismo_web.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="knjige")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "knjiga_id")
    private int bookId;

    @Column(name = "knjiga_broj")
    private int bookNumber;

    @Column(name = "knjiga_ime")
    private String bookName;

    @Column(name = "prevod_id", nullable = false, unique = true)
    private int translationId;

    @Column(name = "skracenica")
    private String abbreviation;
}
