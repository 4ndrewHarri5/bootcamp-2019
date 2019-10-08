package com.manchesterDigital;

import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class StreamsTester {

    public static void main(String[] args) {



        User andrew = User.builder().age(18).firstname("Andrew").lastname("Harris").uid(UUID.randomUUID().toString()).build();
        User jim = User.builder().age(9).firstname("Jim").lastname("Jolly").uid(UUID.randomUUID().toString()).build();
        User jess = User.builder().age(29).firstname("Jess").lastname("White").uid(UUID.randomUUID().toString()).build();

        Map<String, User> data = Map.of(andrew.getUid(), andrew, jim.getUid(), jim, jess.getUid(), jess);

        Map<String, User> all = data.entrySet().stream()
                .filter(userEntry -> userEntry.getValue().getAge() > 16)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("all users over 16 years old = " + all);


    }

}
