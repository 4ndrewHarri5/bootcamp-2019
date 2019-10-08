package com.manchesterDigital;

public class Student {

    private final Language language;
    private final Integer score;
    private final String name;
    private final String subject;

    public Student(Language language, Integer score, String name, String subject) {
        this.language = language;
        this.score = score;
        this.name = name;
        this.subject = subject;
    }

    public Language getLanguage() {
        return language;
    }

    public Integer getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "language=" + language +
                ", score=" + score +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}