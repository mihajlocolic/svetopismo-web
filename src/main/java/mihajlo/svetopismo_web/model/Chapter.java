package mihajlo.svetopismo_web.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "glave")
@Data
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "glava_id", nullable = false, unique = true)
    private long chapterId;

    @Column(name = "glava_broj", nullable = false)
    private long chapterNumber;

    @Column(name = "stihovi", nullable = false)
    private String verses;

    @Column(name = "knjiga_id", nullable = false, unique = true)
    private long bookId;

    @Column(name = "prevod_id", nullable = false, unique = true)
    private long translationId;
}
