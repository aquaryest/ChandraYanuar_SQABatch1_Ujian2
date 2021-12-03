package com.sqa.no9;

import java.util.ArrayList;
import java.util.Scanner;

public class No9Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int[] nilai;
		nilai = new int[5];
		
		
		System.out.println("Masukkan 5 data : ");
		for (int i = 0; i < 5; i++) {
			nilai[i] = in.nextInt();
		
		
		}
	}
	
	
	public int jumlahArray(int[] nilai) {
		int sum = 0;
		
		for (int i = 0; i<nilai.length; i++) {
			sum += nilai[i];
		}
		return sum;
	}
	
	
	public boolean cariNilai(int[] arr, int nilai) {
		
		for (int x = 0; x<arr.length; x++) {
			if (arr[x] == nilai)
				return true;
		}
		return false;
	}

}
