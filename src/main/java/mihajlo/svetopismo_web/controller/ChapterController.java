package mihajlo.svetopismo_web.controller;


import mihajlo.svetopismo_web.model.Chapter;
import mihajlo.svetopismo_web.service.ChapterService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/glava")
public class ChapterController {

    private final ChapterService chapterService;

    public ChapterController(ChapterService chapterService) {
        this.chapterService = chapterService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Chapter> findChapterByNumberAndBookName(@RequestParam(value = "bookName") String bookName, @RequestParam(value = "chapterNumber") int chapterNumber) {
        return chapterService.findChapterByNumberAndBookName(bookName, chapterNumber);
    }

    @RequestMapping(path = "/pretraga", method = RequestMethod.GET)
    public List<Chapter> findChapterByNumberAndBookNumber(@RequestParam(value = "bookNumber") int bookNumber, @RequestParam(value = "chapterNumber") int chapterNumber) {
        return chapterService.findChapterByNumberAndBookNumber(bookNumber, chapterNumber);
    }
}
