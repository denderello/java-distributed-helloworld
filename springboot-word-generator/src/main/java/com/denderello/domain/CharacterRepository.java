package com.denderello.domain;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class CharacterRepository {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getCharacterFallback")
    public Character getCharacter(char requestedCharacter) {
        return this.restTemplate.getForObject("http://character/character/" + requestedCharacter, Character.class);
    }

    public Character getCharacterFallback(char requestedCharacter) {
        Character character = new Character();
        character.setCharacter('.');

        return character;
    }
}
