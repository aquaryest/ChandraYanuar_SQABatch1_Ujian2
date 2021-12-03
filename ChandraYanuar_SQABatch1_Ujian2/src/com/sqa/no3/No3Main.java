package com.sqa.no3;

import java.util.Scanner;

public class No3Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan jarak (kilometer) = ");
		double jarak = in.nextInt();
		
		System.out.print("Masukkan waktu (jam) = ");
		double waktu = in.nextInt();
		
		double hasil = hitungKecepatan(jarak, waktu);
		
		System.out.print("Kecepatan rata-rata anda adalah " +hasil+ " km/jam");
		
	}

	static double hitungKecepatan(double jarak, double waktu) {
		// TODO Auto-generated method stub
		double hasil;
		
		hasil = jarak/waktu;
		
		return hasil;
	}
}
