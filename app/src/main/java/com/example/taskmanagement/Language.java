package com.example.taskmanagement;

public class Language {  //POJO Class
    private String name;

    public static final Language[] languages = {
            new Language("Chemistry"),
            new Language("Math"),
    };

    public Language() {
    }

    public Language(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
