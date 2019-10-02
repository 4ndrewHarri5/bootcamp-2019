package com.manchesterDigital;

import jdk.nashorn.internal.codegen.CompilerConstants;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scratch {

    public static final String RED_COLOUR = "RED";

    public static void main(String[] args) {

        System.out.println("Colour " + RED_COLOUR);
        System.out.println(RainbowColours.BLUE.toString());

        OrderProcessor orderProcessor = new OrderProcessor(OrderStatus.DECLINED);
        orderProcessor.obtainCurrentOrderStatus();
        orderProcessor.printOrderMessage();

        Dog poodle = new Dog(DogSize.SMALL);
        poodle.setHungerLevel(100);
        poodle.hungry();

        Dog lab = new Dog(DogSize.LARGE);
        lab.bark();

        Person person = new Person();
        person.printAddress();


////////////////////////////////////////////////////////////////////////////


        Navigator nav = new Navigator(0d);

        Direction forwardsMove = Direction.FORWARDS;
        forwardsMove.setSteps(5);

        nav.makeMove(forwardsMove);

        forwardsMove.setSteps(90);

        nav.makeMove(forwardsMove);

        Direction turn = Direction.ROTATE;
        turn.setDegrees(370d);

        nav.makeMove(turn);

        System.out.println(nav.getDirectionFacing());
        System.out.println(nav.getStepsTaken());


        //////////////////////////////////////////////////////////////////

        Person otherPerson = new Person();
        System.out.println(otherPerson.toString());

        Student student = new Student("Andrew", "Harris", 2, new Address("28", "P", "c", "PR67QL"));
        student.setUniversityName("Man Met");
        System.out.println(student.toString());



        Phone andrewsPhone = new Phone();

        andrewsPhone.receiveText(new Caller("07526852072"));
        andrewsPhone.sendText(new Caller("07526852072"), "REPLYYYYYY");


        andrewsPhone.receiveCall(new Caller("07526852072"));
        andrewsPhone.makeCall(new Caller("07526852072"));
        andrewsPhone.openApp(new App("Yer da sells avon"));


        Lights lights = new Lights();
        Fan fan = new Fan();

        List<Controls> controlList = Arrays.asList(lights, fan);
        List<Controls> controls = new ArrayList<Controls>();


        //ArrayList<Controls> controls = new ArrayList<Controls>();
        controls.add(lights);
        controls.add(fan);

        for( Controls controllableItem : controls) {
            controllableItem.switchOn();
            controllableItem.switchOff();
        }
    }
}
