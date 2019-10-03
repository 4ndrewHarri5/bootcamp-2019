package com.manchesterDigital;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        Map<String, String> countries = new HashMap<String, String>(); // this is collections

        countries.put("enGB", "England");
        countries.put("esEs", "Spain");
        countries.put("ptPt", "Portugal");

        HashMap<String, String> another = new HashMap<>();
        another.put("John", "John");

        String key = "ptPt";

        String portugal = countries.get(key);

        System.out.println("result = " + portugal);

        countries.put(key, "DUNCAN");

        String dunc = countries.get(key);
        System.out.println("result = " + dunc);

        countries.forEach(((k,v) -> { if (v == "England") System.out.println(k); }));

        Map<Integer, String> names = new HashMap<>();
        names.put(1, "John");
        names.put(2, "Andrew");

        String removedName = names.remove(2);
        System.out.println("removedName = " + removedName);
        //removes item by key 
        System.out.println(names.get(2));

        names.clear();

        System.out.println("number of items = " + names.size());

        names.put(1, "April");
        names.put(2, "Sania");
        names.put(3, "Schmek");


        // each thing in the map is refereed to as an entry
        for (Map.Entry<Integer, String> name : names.entrySet() /*provides us with an entry set, which is everything inside of the map as entries (key value pairs) */) {
            System.out.println("Key = " + name.getKey() + ", value = " + name.getValue());
        }

        for (Integer mapKey : names.keySet() /*provides us with just the keys */) {
            System.out.println("Key = " + mapKey);
        }

        for (String val : names.values() /*provides us with just the values in the map */) {
            System.out.println("Value = " + val);
        }

        if(names.containsKey(1)) {
            System.out.println("The map contains Key 1");
        }

        boolean hasGotApril = names.containsValue("April");

        System.out.println(hasGotApril);




    }

}
