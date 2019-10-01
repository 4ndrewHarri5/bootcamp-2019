package com.manchesterDigital;

public class DoWhileExample {

    public static void main(String[] args) {

        do {
            System.out.println("cant wait for today to finish");
        }while(false);

        quitWhen7();

    }

    public static void quitWhen7() {

        int i = 0;
        do {
            System.out.println(i);
            if (i == 7) {
                break;
            }
            i++;
        }while(i <= 10);

    }

}
