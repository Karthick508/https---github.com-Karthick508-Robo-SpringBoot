package com.example.robo;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.robo.arrays.ShallowCopyDeepCopy;
import com.example.robo.loops.Loops;
import com.example.robo.streams.StreamsDemo;

@SpringBootApplication
public class RoboApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoboApplication.class, args);

		// Hacker Rank For loop Questions
		Loops hackerRankLoops = new Loops();

		// hackerRankLoops.forLoop();

		// Shallow Copy Deep copy
		ShallowCopyDeepCopy shallowDeepCo = new ShallowCopyDeepCopy();
		// shallowDeepCo.shallowDeep();

		// Stream test
		StreamsDemo streamsDemo = new StreamsDemo();
		streamsDemo.emptyStream();

		// ? Pass list of string and return without null values
		List<String> listOfString = Arrays.asList("Karthick", "Vijay", "Russel", "Naren");
		// listOfString.forEach(System.out::println);

		Stream<String> streamList = streamsDemo.streamOf(listOfString);
		Stream<String> streamList1 = streamsDemo.streamOf(listOfString);

		// ! JAVA 8 FOR EACH LOOP
		// streamList.forEach(System.out::println);

		// ! do operations with -> arrow
		streamList.forEach((list)-> System.out.println("List of Values " + list));
		// //! CANNOT REUSE STREAM VARIBLES THIS WILL THROW R=ERROR
		// streamList1.forEach((list) -> System.out.println("List of Values " + list));

		// ! Create collection Integer and convert to stream
		Collection<Integer> collection = Arrays.asList(12, 32, 545, 89);
		// collection.forEach((list) -> System.out.println("Normal collection looping" +
		// list));
		Stream<Integer> streamCollection = collection.stream();
		// streamCollection.forEach(System.out::println);

		// ! An array can also be the source of a stream:
		Stream<String> streamOfArray = Stream.of("Dhoni", "kohli", "Maxwell");
		// streamOfArray.forEach(System.out::println);


		//  ! in javascript splice also in stream starting index and ending index
		String[] arr = { "kolkata", "punjab", "chennai" ,"banglore","rajasthan","pune"};
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		// streamOfArrayPart.forEach(System.out::println);


		// ! STREAM BUILDER TEST
		streamsDemo.streamBuilderTest();
	}

}
