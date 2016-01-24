package com.denderello.domain;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class CharacterRepository {

    @HystrixCommand(fallbackMethod = "getCharacterFallback")
    public Character getCharacter() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://character/character", Character.class);
    }

    public Character getCharacterFallback() {
        Character character = new Character();
        character.setCharacter(".");

        return character;
    }
}
