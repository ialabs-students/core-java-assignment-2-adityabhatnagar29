package com.assignment;
import java.util.*;

public class assignment2 {

	public static void main(String[] args) {
		ArrayList<Integer> l1= new ArrayList<>();
		System.out.println("Enter the elements");
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<5; i++) {
			l1.add(sc.nextInt());
		}
		System.out.println("Before sorting" + l1);
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println("After  sorting in descending order" + l1);
	}

}
