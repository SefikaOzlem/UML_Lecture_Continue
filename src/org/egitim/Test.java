package org.egitim;

public class Test {

	public static void main(String[] args) {
		
		ILog kisi=new Kisi();
		kisi.log();
	    
		Kisi kisi1=new Kisi();
	    kisi1.setAd("Özlem");
	    
	   System.out.println(kisi1.getAdresListe());
	   
	   Ogrenci ogr=new Ogrenci();
	   ogr.setAd("Merve");
	   System.out.println(ogr.getAd());
	   
	   System.out.println(ogr.getAdresListe());
	   
	   Bolum bolum=new Bolum();
	   ogr.add(bolum);
	   
	   System.out.println(ogr.getBolumListe());
	   
	   System.out.println(bolum.getOgretimUyesiListe());
	   
	   OgretimUyesi ogrUyesi=new OgretimUyesi();
	   
	   
	   bolum.addOgretimUyesi(ogrUyesi);
	   
	   System.out.println(bolum.getOgretimUyesiListe());
	   
	   System.out.println(ogrUyesi.getBolumListe());
	   
	   ogrUyesi.addBolum(bolum);
	   
	   

	}

}
