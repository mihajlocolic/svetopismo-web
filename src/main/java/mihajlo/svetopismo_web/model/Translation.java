package mihajlo.svetopismo_web.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Translation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prevod_id", unique = true, nullable = false)
    private int translationId;

    @Column(name = "prevod_ime", nullable = false)
    private String translationName;

    @Column(name = "skracenica", nullable = false)
    private String abbreviation;

}
