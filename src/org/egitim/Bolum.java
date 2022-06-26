package org.egitim;

import java.util.ArrayList;
import java.util.List;

public class Bolum {
	
	private List<OgretimUyesi>ogretimUyesiListe;
	
	public Bolum() {
		ogretimUyesiListe=new ArrayList<OgretimUyesi>();
	
	}
	public List<OgretimUyesi> getOgretimUyesiListe() {
		return ogretimUyesiListe;
	}
	public void setOgretimUyesiListe(List<OgretimUyesi> ogretimUyesiListe) {
		this.ogretimUyesiListe = ogretimUyesiListe;
	}
	void addOgretimUyesi(OgretimUyesi ogrUyesi) {
		if(!ogretimUyesiListe.contains(ogrUyesi)) {
			ogretimUyesiListe.add(ogrUyesi);
		}
		
	}

}
