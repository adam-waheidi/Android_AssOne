package com.example.taskmanagement;

public class Activity {
    private String name;

    public static final Activity[] activities = {
            new Activity("Class Schedule"),
            new Activity("Courses"),
            new Activity("Exams"),
    };

    public Activity() {
    }

    public Activity(String name) {
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

