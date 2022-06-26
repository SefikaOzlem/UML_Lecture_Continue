package org.egitim;

import java.util.ArrayList;
import java.util.List;

public class OgretimUyesi extends Kisi{
	
	private String sicilNo;
	private List<Bolum>bolumListe;
	private Bolum bolum_1;

	public OgretimUyesi() {
		this.sicilNo=sicilNo;
		bolum_1=new Bolum();
		bolumListe=new ArrayList<Bolum>();
		bolumListe.add(bolum_1);
	}
	public void addBolum(Bolum bolum) {
		if(!bolumListe.contains(bolum)) {
			bolumListe.add(bolum);
		}
	}
	public String getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}

	public List<Bolum> getBolumListe() {
		return bolumListe;
	}

	public void setBolumListe(List<Bolum> bolumListe) {
		this.bolumListe = bolumListe;
	}
	
	

}
