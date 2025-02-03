package mihajlo.svetopismo_web.controller;


import mihajlo.svetopismo_web.model.Chapter;
import mihajlo.svetopismo_web.service.ChapterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/glava")
public class ChapterController {

    private final ChapterService chapterService;

    public ChapterController(ChapterService chapterService) {
        this.chapterService = chapterService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Chapter> findChapterByNumber(@RequestParam(value = "bookNumber") int bookNumber, @RequestParam(value = "chapterNumber") int chapterNumber) {
        return chapterService.findChapterByNumber(bookNumber, chapterNumber);
    }
}
