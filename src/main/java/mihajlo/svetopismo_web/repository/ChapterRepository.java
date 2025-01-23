package mihajlo.svetopismo_web.repository;

import mihajlo.svetopismo_web.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {
    List<Chapter> findByChapterNumber(long chapterNumber);
}
