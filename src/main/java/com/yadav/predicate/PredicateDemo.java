package com.yadav.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateDemo {
	public void welcome() {
		System.out.println("Welcome To Java 8 Features");
	}
	public static void main(String[] args) {
		/*
		Predicate<String> p=(name)->{
			return name.equals("Sudha");
		};
		*/
		List<String> nameList=new ArrayList<String>();
		nameList.add("Sudharshan");
		nameList.add("Suresh");
		nameList.add("Narendra");
		Predicate<String> p=name->name.equals("Sudharshan");
		boolean test = p.test("Sudha");
		System.out.println("Is Pridicate :"+test);
		List<String> filteredNames = nameList.stream()
		        .filter(name->name.startsWith("S"))
		        .collect(Collectors.toList());
		System.out.println(filteredNames);
		filteredNames.forEach(System.out::println);
	}

}
