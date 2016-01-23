package com.denderello.web;

import com.denderello.domain.CharacterRepository;
import com.denderello.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {

    private CharacterRepository charRepo;

    @Autowired
    public void SetCharacterRepository(CharacterRepository cp) {
        this.charRepo = cp;
    }

    @RequestMapping("/word")
    public Word word() {
        return new Word(this.charRepo.getCharacter().getCharacter());
    }
}
