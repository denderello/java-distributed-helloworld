package com.denderello.web;

import com.denderello.domain.Character;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

    @RequestMapping("/character/{requestedCharacter}")
    public Character character(@PathVariable char requestedCharacter) {
        return new Character(requestedCharacter);
    }
}