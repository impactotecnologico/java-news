package DoubleFunction;

import java.util.function.DoubleFunction;

public class Main {

	public static void main(String[] args) {
		DoubleFunction<String> getGrade = marks->{
			if(marks>90 && marks<=100){
				return "A";
			} else if(marks>70 && marks<=90){
				return "B";
			} else if(marks>50 && marks<=70){
				return "C";
			} else {
				return "D";
			}
		};
		
		double input = 91;
		System.out.println("Input Marks: "+input);
		String grade = getGrade.apply(input);
		System.out.println("Grade : "+grade);

	}

}
