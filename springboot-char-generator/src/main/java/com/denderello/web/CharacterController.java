package com.denderello.web;

import com.denderello.domain.Character;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CharacterController {

    @RequestMapping("/character")
    public Character character() {
        return new Character("a");
    }
}