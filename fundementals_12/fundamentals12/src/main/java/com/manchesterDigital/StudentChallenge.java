package com.manchesterDigital;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentChallenge {

    public static void main(String[] args) {

        Student jose = new Student(Language.English, 2, "Jose", "english");
        Student andrew = new Student(Language.French, 102, "Andrew", "french");
        Student sam = new Student(Language.German, 89, "Sam", "german");
        Student amy = new Student(Language.English, 59, "Amy", "english");
        Student emalin = new Student(Language.German, 24, "Emalin", "german");

        List<Student> students = List.of(jose, andrew, sam, amy, emalin);

        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getScore() > 50)
                .filter(student -> student.getName().startsWith("A") || student.getName().startsWith("S"))
                .collect(Collectors.toList());


        filteredStudents.stream()
                .filter(student -> student.getLanguage().equals(Language.English))
                .forEach(student -> System.out.println("English Student = " + student.getName()));

        filteredStudents.stream()
                .filter(student -> student.getLanguage().equals(Language.French))
                .forEach(student -> System.out.println("French Student = " + student.getName()));

        filteredStudents.stream()
                .filter(student -> student.getLanguage().equals(Language.German))
                .forEach(student -> System.out.println("German Student = " + student.getName()));


    }

    private static List<Student> extractStudents(List<Student> students, String subject, Integer minScore) {
        return students.stream()
                .filter(student -> student.getSubject().equalsIgnoreCase(subject))
                .filter(student -> student.getScore() > minScore)
                .filter(student -> (student.getName().startsWith("A") || student.getName().startsWith("S")))
                .collect(Collectors.toList());
    }

    private static List<Student> extractStudentsUsingPredicate(List<Student> students, String subject, Integer minScore) {
        return students.stream()
                .filter(studentFilter(subject, minScore))
                .collect(Collectors.toList());
    }

    private static Predicate<Student> studentFilter(String subject, Integer minScore) {

        return student -> student.getSubject().equalsIgnoreCase(subject) &&
                (student.getScore() > minScore || student.getName().startsWith("A") || student.getName().startsWith("S"));

    }



}
