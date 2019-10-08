package com.manchesterDigital;

import org.apache.commons.lang3.StringUtils;

import java.security.MessageDigest;
import java.util.List;

public class Scratch {

    public static void main(String[] args) {

        List<String> names = List.of("", "andrew", "emalin");

        String sam = StringUtils.defaultString(names.get(0), "sam");
        System.out.println("sam = " + sam);
        //Null safe



    }

}
