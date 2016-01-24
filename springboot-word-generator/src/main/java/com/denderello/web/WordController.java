package com.denderello.web;

import com.denderello.domain.Word;
import com.denderello.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    private WordService wordService;

    @Autowired
    public void SetWordService(WordService wordService) {
        this.wordService = wordService;
    }

    @RequestMapping("/word/{requestedWord}")
    public Word word(@PathVariable String requestedWord) {
        return this.wordService.generateWord(requestedWord);
    }
}
