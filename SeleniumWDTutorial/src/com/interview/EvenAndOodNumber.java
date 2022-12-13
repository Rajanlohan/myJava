package com.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class EvenAndOodNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,3,5,6,9,10);
		List<Integer> evennumber = list.stream()
		        .filter(e -> e%2==0)
		            .collect(Collectors.toList());
		System.out.println("the even numbers is: "+evennumber);

		List<Integer> oddnumber = list.stream()
		        .filter(e -> e%2!=0)
		            .collect(Collectors.toList());
		System.out.println("the odd numbers is: "+oddnumber);
		
	}

}
