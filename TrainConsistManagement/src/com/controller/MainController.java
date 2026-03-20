package com.controller;
import java.util.*;
import java.util.stream.Collectors;

import com.trainconsist.*;


public class MainController {
	
    Scanner sc = new Scanner(System.in);
    
    public void displayHeader() {
        System.out.println("==================================================");
        System.out.println(" UC13 - Performance Comparison ");
        System.out.println("==================================================\n");
    }
    
    public void runBenchMark(Train train) {  // performance comparison between loop and streams
    	// creating large test dataset
    	for(int i = 0 ; i < 1000000 ; i ++) {
    		train.addBogie("Passenger", (i%100)+10);
    	}
    	
    	List<Train.Bogie> bogies = train.getBogie();
    	
    	// 1. Loop based processing
    	long startLoop = System.nanoTime();
    	List<Train.Bogie> loopFiltered = new ArrayList<>();
    	for(Train.Bogie bogie : bogies) {
    		if(bogie.getCapacity() > 50) {
    			loopFiltered.add(bogie);
    		}
    	}
    	
    	long endLoop = System.nanoTime();
    	long loopExectuionTime = endLoop - startLoop;
    	
    	// 2. Stream based processing
    	
    	long startStream = System.nanoTime();
    	List<Train.Bogie> streamFiltered = bogies.stream().filter(b -> b.getCapacity() > 50).collect(Collectors.toList());
    	long endStream = System.nanoTime();
    	long streamExecutionTime = endStream - startStream;
    	
    	//Display Execution time
    	
    	System.out.println("Loop execution time(ns) : "+loopExectuionTime);
    	System.out.println("Stream execution time(ns) : "+streamExecutionTime);
    }

}