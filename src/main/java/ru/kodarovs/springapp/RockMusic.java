package ru.kodarovs.springapp;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock Music ....";
    }
}
