package com.sqa.no8;

public class Tabungan {
	
	int rekening, saldo;
	String nama;
	
	public Tabungan(String nama, int rekening, int saldo){
		this.nama = nama;
		this.rekening = rekening;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Tabungan [rekening=" + rekening + ", saldo=" + saldo + ", nama=" + nama + "]";
	}
	
}
