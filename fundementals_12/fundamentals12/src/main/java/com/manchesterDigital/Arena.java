package com.manchesterDigital;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arena {

    public static void main(String[] args) {

        Artist arianaGrande = new Artist("Ariana Grande", List.of(new Member("Ariana Grande")), "London");

        Artist beatles = new Artist("Beatles", List.of(new Member("John Lennon"),
                new Member("Paul McCartney"), new Member("Ringo Starr"),
                new Member("George Harrison")), "Liverpool");

        Artist coldPlay = new Artist("Coldplay", List.of(new Member("Chris Martin"),
                new Member("Guy Berryman"),
                new Member("Will Champion"),
                new Member("Phil Harvey")), "London");


        List<Artist> artists = List.of(arianaGrande, beatles, coldPlay);
        long countFromLiverpool = 0;

        for (Artist artist : artists) {
            if (artist.isFrom("Liverpool")) {
                countFromLiverpool++;
            }
        }

        System.out.println("countFromLiverpool = " + countFromLiverpool);


        Long numberOfArtistsFromLiverpool = artists.stream()
                .filter(artist -> artist.isFrom("Liverpool"))
                .count();

        System.out.println("numberOfArtistsFromLiverpool = " + numberOfArtistsFromLiverpool);

        // it is immutable, can only be refered to or referenced to

        Long numberOfArtistsFromLiverpoolWithMoreThan2Members = artists.stream()
                .filter(artist -> artist.isFrom("Liverpool"))
                .filter(artist -> artist.getMembersList().size() > 2)
                .count();

        System.out.println("numberOfArtistsFromLiverpoolWithMoreThan2Members = " + numberOfArtistsFromLiverpoolWithMoreThan2Members);

        ////////////////////////


        Album everythingForSale = new Album("Everything's for Sale", List.of(
                new Song("Tired / Reflections"),
                new Song("Silent Ride"),
                new Song("Swap Meet"),
                new Song("Lolsmh")));

        Album supermarket = new Album("Supermarket", List.of(
                new Song("Bohemian Trapsody"),
                new Song("Can I Kick It"),
                new Song("Time Machine"),
                new Song("Pretty Young Girl"),
                new Song("Supermarket\"")));

        Album mapOfTheSoulPersona = new Album("Map of the Soul: Persona", List.of(
                new Song("Make It Right")));

        List<Album> albums = List.of(everythingForSale, supermarket, mapOfTheSoulPersona);

        albums.stream().filter(album -> album.getAlbumName().startsWith("S")).forEach(album -> System.out.println("album starts with S: " + album.getAlbumName()));


        String result = Stream.of("a", "b", "c")
                .filter(s -> s.equalsIgnoreCase("a"))
                .findFirst()
                .orElse(null);

        //basically says find me the first occurrence of this


        //gathering matched criteria to use maybe elsewhere:

        List<Artist> london = artists.stream()
                .filter(artist -> artist.isFrom("London"))
                .collect(Collectors.toList());

        //extracts all artists names and then print them
        london.stream()
                .map(Artist::getName)
                .forEach(System.out::println);

        //map changes one thing into another


        List<Member> collectMembers = artists.stream().map(Artist::getMembersList)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("collectMembers = " + collectMembers);


        Collections.sort(artists, new Comparator<Artist>() {
            @Override
            public int compare(Artist o1, Artist o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        artists.stream()
                .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()));


        List<Artist> collect = artists.stream()
                .sorted(Comparator.comparing(Artist::getName))
                .collect(Collectors.toList());


        Collections.sort(artists, Comparator.comparing(Artist::getName));

    }
}