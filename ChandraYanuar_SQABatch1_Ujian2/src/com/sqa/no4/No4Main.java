package com.sqa.no4;

import java.util.Scanner;

public class No4Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan sisa BBM dalam tangki (liter) = ");
		double sisa = in.nextDouble();
		
		System.out.print("Masukkan konsumsi BBM kendaraan(km/liter) = ");
		double jarakPerLiter = in.nextDouble();
		
		double sisaJarak = hitungSisaJarak(sisa, jarakPerLiter);
		
		System.out.println("Kendaraan anda dapat menemput jarak "+sisaJarak+ " kilometer dengan sisa BBM yang ada di tangki");
	}

	static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		// TODO Auto-generated method stub
		double sisaJarak = sisa * jarakPerLiter;
		
		return sisaJarak;
	}
	
	
}
