package com.manchesterDigital;

import java.util.*;
import java.util.function.Predicate;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Sue");

        names.add(names.size(), "Steve");

        System.out.println(String.format("Number of elements %d", names.size()));
        System.out.println(String.format("Name at index 0 %s", names.get(0)));

        String removedElement = names.remove(0);
        System.out.println(removedElement);

        names.removeIf(Predicate.isEqual("John"));
        System.out.println(String.format("Number of elements %d", names.size()));

        boolean removedElementViaObject = names.remove("Steve");

        System.out.println("Removed by object => " + removedElement);

        ArrayList<String> zooAnimals = new ArrayList<>();

        zooAnimals.add("Lion");
        zooAnimals.add("Hippo");
        zooAnimals.add("Leopard");

        boolean hasLeopard = zooAnimals.contains("Leopard");
        System.out.println(hasLeopard);

        Collections.sort(zooAnimals);
        System.out.println("After sort, animal at index 0: " + zooAnimals.get(0));

        Collections.shuffle(zooAnimals);

        System.out.println("shuffled arrayList: " + zooAnimals.toString());

        zooAnimals.set(1, "Cheetah");

        System.out.println(zooAnimals.get(1));

        zooAnimals.clear();

        int [] lotteryArray = new int[10];
        int [] lotteryArray2 = {1, 23, 45, 6, 88};

        List<Integer> lotteryNumbers = Arrays.asList(1, 23, 45, 6, 88);









    }

}
