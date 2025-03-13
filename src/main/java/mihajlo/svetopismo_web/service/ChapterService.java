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

    public List<Chapter> findChapterByNumberAndBookName(String bookName, int chapterNumber) {
        return chapterRepository.searchChapterByNumberAndBookName(bookName, chapterNumber);
    }

    public List<Chapter> findChapterByNumberAndBookNumber(int bookNumber, int chapterNumber) {
        return chapterRepository.searchChapterByNumberAndBookNumber(bookNumber, chapterNumber);
    }
}
