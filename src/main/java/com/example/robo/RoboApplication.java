package com.example.robo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.robo.arrays.ShallowCopyDeepCopy;
import com.example.robo.loops.Loops;

@SpringBootApplication
public class RoboApplication {

	public static void main(String[] args){
		SpringApplication.run(RoboApplication.class, args);

		// Hacker Rank For loop Questions
		Loops hackerRankLoops = new Loops();

		// hackerRankLoops.forLoop();

		// Shallow Copy Deep copy
		ShallowCopyDeepCopy shallowDeepCo = new ShallowCopyDeepCopy();
		// shallowDeepCo.shallowDeep(); 
	}

}
