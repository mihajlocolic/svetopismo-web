package mihajlo.svetopismo_web.repository;

import mihajlo.svetopismo_web.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {
    List<Chapter> findByChapterNumber(long chapterNumber);
}
