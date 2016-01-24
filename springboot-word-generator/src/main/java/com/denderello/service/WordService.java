package com.denderello.service;

import com.denderello.domain.CharacterRepository;
import com.denderello.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordService {
    private CharacterRepository characterRepository;

    @Autowired
    public void SetCharacterRepository(CharacterRepository cp) {
        this.characterRepository = cp;
    }

    public Word generateWord(String requestedWord) {
        char[] characters = new char[requestedWord.length()];
        int characterIndex = 0;

        for (char ch : requestedWord.toCharArray()){
            characters[characterIndex] = this.characterRepository.getCharacter(ch).getCharacter();
            characterIndex++;
        }

        return new Word(new String(characters));
    }
}
