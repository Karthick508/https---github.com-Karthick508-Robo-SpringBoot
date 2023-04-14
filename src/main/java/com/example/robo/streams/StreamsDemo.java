package com.example.robo.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    
    public void emptyStream(){
        Stream<String> emptyStream = Stream.empty();  
        // System.out.println("Empty Stream" + emptyStream);
    }

    public Stream<String> streamOf(List<String> list){

        // ? Return empty if list is null or empty
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
        
    }
    
}

class EmptyStream{
   
}
