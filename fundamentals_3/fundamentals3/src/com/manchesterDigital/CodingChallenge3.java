package com.manchesterDigital;

public class CodingChallenge3 {

    public static void main(String[] args) {

        System.out.println(schedule(6));
        System.out.println(newSchedule(5));

    }


    public static String schedule(int day) {

        switch (day) {

            case 1:
                return "Today is Monday";
            case 2:
                return "This is Tuesday, go to the gym";
            case 3:
                return "This is Wednesday";
            case 4:
                return "This is Thursday, go to the gym";
            case 5:
                return "This is Friday";
            case 6:
                return "It is Saturday";
            case 7:
                return "It is Sunday, the weekend. Do some gardening";
            default:
                return "This is not a day of the week :(";

        }
    }

    public static String newSchedule(int day) {

        if (day > 0 && day < 8) {
            if ((day == 2) || (day == 4)) {
                return day == 2 ? "It is a weekday. It is Tuesday, go to the gym" : "It is a weekday. It is Thursday, go to the gym";
            } else if ((day == 6) || (day == 7)) {
                return day == 6 ? "It is Saturday, it's the weekend" : "It is Sunday, It's the weekend. Go do some gardening";
            } else {
                return "It is a weekday but you do not have anything planned for today";
            }
        } else {
            return "This is not a day!!";
        }
    }

}
