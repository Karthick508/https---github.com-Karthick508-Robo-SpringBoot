package com.example.robo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.example.robo.login.entity.User;

public class StreamsDemo {

    public void emptyStream() {
        Stream<String> emptyStream = Stream.empty();
        // System.out.println("Empty Stream" + emptyStream);
    }

    public Stream<String> streamOf(List<String> list) {

        Long count = list.stream().count();
        System.out.println("Count of list length" + count);
        // ? Return empty if list is null or empty
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }

    public Stream<String> streamBuilderTest() {

        EmptyStream emptyStream = new EmptyStream();

        // ? Stream builder generate
        Stream<String> builderStream = emptyStream.streamBuilder();
        // builderStream.forEach(System.out:: println);

        // ? Stream to reduce limit output
        // emptyStream.generatedStream().forEach(System.out::println);

        // ? reduce limit list with stream
        List<String> list = Arrays.asList("Goku", "Gotens", "Vegeta");
        Stream<String> reducStreamList = emptyStream.limitArrayUsingStream(list);
        // reducStreamList.forEach(System.out::println);

        List<String> containsStreamFilter = emptyStream.filterMethodContains(list).collect(Collectors.toList());
        containsStreamFilter.forEach(System.out::println);
        return builderStream;
    }

}

class EmptyStream {

    public Stream<String> streamBuilder() {

        Stream<String> streamBuilder = Stream.<String>builder().add("karthick").add("Test").build();
        return streamBuilder;
    }

    public Stream<String> generatedStream() {
        Stream<String> streamGenerated = Stream.generate(() -> "hi").limit(5);
        return streamGenerated;
    }

    public Stream<String> limitArrayUsingStream(List<String> list) {
        Stream<String> filteredStream = Stream.generate(() -> list.get(0)).limit(1);
        return filteredStream;
    }

    public Stream<String> filterMethodContains(List<String> list) {

        // ! try later
        // Stream<List<String>> filterdData = Stream.of(list).filter(element ->
        // element.contains("Gotens"));
        // filterdData.forEach(System.out::println);

        Stream<String> filteredData = Stream.of("KB", "B", "Z")
                .filter(element -> element.contains("K") && element.contains("B"));

        // ? Find first element in list
        Optional<String> firstElement = list.stream().findFirst();
        // System.out.println("First Element" + firstElement);

        // ? Skip Values
        List<List<String>> onceModifiedStream = Stream.of(list).skip(0).collect(Collectors.toList());
        return filteredData;
    }

    // regedx for allow decimal and numbers\
    // ^[1-9]\d*(\.\d+)?$

}

class MovieArrayStreams {
    Movie movieObj1 = new Movie("KGF", 1, 2020, "Yash", "ABC");
    Movie movieObj2 = new Movie("KKK", 2, 2022, "DQ", "ZED");
    Movie movieObj3 = new Movie("RRR", 3, 2024, "XXX", "TTT");

    List<Movie> moviesList = Arrays.asList(movieObj1,movieObj2,movieObj3);
    
}

class Movie{
    String name;
    int no;
    int year;
    String actor;
    String actress;

    public Movie(String name,int no,int year,String actor,String actress){
        this.name = name;
        this.no = no;
        this.year = year;
        this.actor = actor;
        this.actress = actress;
    }

    @Override
    public String toString() {
        return "Movie [name=" + name + ", no=" + no + ", year=" + year + ", actor=" + actor + ", actress=" + actress
                + "]";
    }
}
