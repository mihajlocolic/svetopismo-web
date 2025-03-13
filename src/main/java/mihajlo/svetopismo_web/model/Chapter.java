package mihajlo.svetopismo_web.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

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

    @Lob
    @Column(name = "stihovi", nullable = false)
    private String verses;

    @ManyToOne
    @JoinColumn(name="knjiga_broj", referencedColumnName = "knjiga_broj")
    private Book book;

    @Column(name = "prevod_id", nullable = false, unique = true)
    private int translationId;
}
