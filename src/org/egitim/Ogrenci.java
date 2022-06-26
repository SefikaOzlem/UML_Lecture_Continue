package org.egitim;

import java.util.ArrayList;
import java.util.List;

public class Ogrenci extends Kisi {
	
	private int ogrenciNo;
	private double ortalama;
	private List<Bolum>bolumListe;
	private Bolum bolum_1;
	
	public Ogrenci () {
		bolumListe=new ArrayList<Bolum>();
		bolum_1=new Bolum();
		bolumListe.add(bolum_1);
	}
	public void add(Bolum bolum_2) {
		if(bolumListe.size()<3 && !bolumListe.contains(bolum_2)) {
			bolumListe.add(bolum_2);
		}
		
	}

	public List<Bolum> getBolumListe() {
		return bolumListe;
	}


	public void setBolumListe(List<Bolum> bolumListe) {
		this.bolumListe = bolumListe;
	}


	public double getOrtalama() {
		return ortalama;
	}
	public void setOrtalama(double ortalama) {
		this.ortalama = ortalama;
	}
	public int getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(int ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}
	
	public void ortalamaHesapla() {
		
	}

}
