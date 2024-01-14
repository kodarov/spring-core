package ru.kodarovs.springapp;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Classic music...";
    }
}
