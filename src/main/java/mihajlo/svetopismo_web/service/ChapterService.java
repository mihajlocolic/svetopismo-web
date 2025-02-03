package mihajlo.svetopismo_web.service;

import mihajlo.svetopismo_web.model.Chapter;
import mihajlo.svetopismo_web.repository.ChapterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService {

    private final ChapterRepository chapterRepository;

    public ChapterService(ChapterRepository chapterRepository) {
        this.chapterRepository = chapterRepository;
    }

    public List<Chapter> findChapterByNumber(int bookNumber, int chapterNumber) {
        return chapterRepository.searchChapterByNumber(bookNumber, chapterNumber);
    }
}
