package com.manchesterDigital;

import java.util.*;

public class Scratch {

    public static void main(String[] args) {

        Artist adele = new Artist("Adele", 9_000_000L);
        Artist prince = new Artist("Prince", 20_000_000L);
        List<Artist> artists = Arrays.asList(
                adele,
                prince
        );
        
        for (Artist artist : artists) {
            System.out.println("artist.toString() = " + artist.toString());
        }


        Map<Long, Artist> artistMap = new HashMap<>();

        artistMap.put(1L, adele);
        artistMap.put(2L, prince);

        for (Map.Entry<Long, Artist> entry : artistMap.entrySet()) {

            System.out.println("entry = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());

        }
        //will print out in an arbetory way, not sorted, unlike TreeMap which is sorted
        //can search by value, keys or the whole entry set

        for(Long key : artistMap.keySet()){

            System.out.println("key = " + key);
            
        }
        
        //for values
        
        for(Artist artist : artistMap.values()) {

            System.out.println("artist. = " + artist);
            
        }


        Set<Artist> artistSet = new HashSet<>(artistMap.values());

        // iterate over unique values from artist

        for (Artist artist : artistSet) {
            System.out.println("unique artist = " + artist);
        }


        // Immutability, cannot be added to or changed

        List<Integer> numbers = List.of(1,2,3,4,5);

        for(Integer i : numbers) {
            System.out.println("i = " + i);
        }

        Set<Long> distances = Set.of(1L,2L,3L);

        for (Long distance : distances) {

            System.out.println("distance = " + distance);

        }

        Map<Long, String> namesMap =  Map.of(1L, "John", 2L, "April");

        //of function automatically knows the key value pairs, you can add them all in one line

        for(Map.Entry<Long, String> namEntry : namesMap.entrySet()) {
            System.out.println("namEntry = " + namEntry.getValue());
        }

        List<Artist> allArtists = List.of(adele, prince);

        for(Artist artist : allArtists) {
            System.out.println("artist = " + artist);
        }


        allArtists.forEach(artist -> System.out.println("artist = " + artist));

        allArtists.forEach(System.out::println);


        

    }
}
