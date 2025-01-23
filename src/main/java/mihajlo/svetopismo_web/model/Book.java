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
    private long bookId;

    @Column(name = "knjiga_ime")
    private String bookName;

    @Column(name = "prevod_id")
    private long translationId;

    @Column(name = "skracenica")
    private String abbreviation;
}
