package mihajlo.svetopismo_web.repository;

import mihajlo.svetopismo_web.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {

    @Query("SELECT c FROM Chapter c WHERE c.bookNumber = :bookNumber AND c.chapterNumber = :chapterNumber")
    List<Chapter> searchChapterByNumber(long bookNumber, long chapterNumber);
}
