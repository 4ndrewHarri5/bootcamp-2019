package com.manchesterDigital;

public class CodingChallenge1 {

    public static void main(String[] args) {

        System.out.println(teaParty(6,8).returnScale());
        System.out.println(teaParty(3,8).returnScale());
        System.out.println(teaParty(20,6).returnScale());

    }

    public static Scale teaParty(int tea, int candy){
        if (tea < 5 || candy < 5) {
            return Scale.bad;
        } else if (tea >= (2*candy) || candy >= (2*tea)) {
            return Scale.great;
        }
        return Scale.good;
    }

}

enum Scale {

    bad,
    good,
    great;

    public int returnScale() {

        switch (this) {
            case bad:
                return 0;
            case good:
                return 1;
            case great:
                return 2;
            default:
                return 3;
        }
    }
}
