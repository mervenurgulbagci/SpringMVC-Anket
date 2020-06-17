package com.merve;

	import java.sql.*;
	import java.util.ArrayList;
	import java.util.List;
	import org.springframework.stereotype.Component;

	@Component
	public class Anket {
		private String ad;
		private String soyad;
		private int yas;
		private String mezuniyetYili;
		private String okul;
		private String dogumYeri;
		private String meslek;
		private String hobiler;
		private String yabanciDil;
		private String ehliyet;		
		private List<String> yillar;
		public String dbUrl = "jdbc:oracle:thin:@localhost:1521:ORACLE";
		public Connection myConn;
		public String getAd() {
			return ad;
		}

		public void setAd(String ad) {
			this.ad = ad;
		}

		public String getSoyad() {
			return soyad;
		}

		public void setSoyad(String soyad) {
			this.soyad = soyad;
		}

		public int getYas() {
			return yas;
		}

		public void setYas(int yas) {
			this.yas = yas;
		}

		public String getMezuniyetYili() {
			return mezuniyetYili;
		}

		public void setMezuniyetYili(String mezuniyetYili) {
			this.mezuniyetYili = mezuniyetYili;
		}

		public String getOkul() {
			return okul;
		}

		public void setOkul(String okul) {
			this.okul = okul;
		}

		public String getDogumYeri() {
			return dogumYeri;
		}

		public void setDogumYeri(String dogumYeri) {
			this.dogumYeri = dogumYeri;
		}

		public String getMeslek() {
			return meslek;
		}

		public void setMeslek(String meslek) {
			this.meslek = meslek;
		}

		public String getHobiler() {
			return hobiler;
		}

		public void setHobiler(String hobiler) {
			this.hobiler = hobiler;
		}

		public String getEhliyet() {
			return ehliyet;
		}

		public void setEhliyet(String ehliyet) {
			this.ehliyet = ehliyet;
		}

		public Anket() {
			
			yillar = new ArrayList<String>();
			yillar.add("2010");
			yillar.add("2011");
			yillar.add("2012");
			yillar.add("2013");
			yillar.add("2014");
			yillar.add("2015");
			yillar.add("2016");
			yillar.add("2017");
			yillar.add("2018");
			yillar.add("2019");
			yillar.add("2020");

			

//			dbUrl = "jdbc:oracle:thin:@localhost:1521:ORACLE";
//			try {
//				Connection myConn = DriverManager.getConnection(dbUrl, "JSF", "jsf");
//				st = myConn.createStatement();
//				rs = st.executeQuery("select * from JSF_TABLOSU");
//				if (rs.next()) {
//					this.ad = rs.getString(1);
//					this.soyad = rs.getString(2);
//					this.yas = rs.getInt(3);
//					this.mezuniyetYili = rs.getString(4) + "";
//					this.okul = rs.getString(5);
//					this.dogumYeri = rs.getString(6);
//					this.meslek = rs.getString(7);
//					this.ehliyet = rs.getString(8);
	//
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

		}

		public List<String> getYillar() {
			return yillar;
		}

		public void setYillar(List<String> yillar) {
			this.yillar = yillar;

		}

		public String getYabanciDil() {
			return yabanciDil;
		}

		public void setYabanciDil(String yabanciDil) {
			this.yabanciDil = yabanciDil;
		}

		/*
		public String kaydet() {
			String sorgu="insert into jsf_tablosu values (";
			String hobi="null";
			String dil="null";
			String tarih="null";
			if(hobiler.length>0) {
				hobi="";
			for(int i=0; i<hobiler.length; i++) {
				hobi+=hobiler[i]+" ";
			}
			}
			
			if(yabanciDil.length>0) {
				dil="";
			for(int i=0; i<yabanciDil.length; i++) {
				dil+=yabanciDil[i]+" ";
			}
			}
			sorgu+="'"+ad+"', ";
			sorgu+="'"+soyad+"', ";
			sorgu+=" "+yas+" ,";
			sorgu+=" "+mezuniyetYili+", ";
			sorgu+="'"+okul+"', ";
			sorgu+="'"+dogumYeri+"', ";
			sorgu+="'"+meslek+"', ";
			sorgu+="'"+ehliyet+"', ";
			sorgu+="'"+dil+"', ";
			sorgu+="'"+hobi+"', ";
			sorgu+=tarih+")";
			
			try {
				Connection myConn = DriverManager.getConnection(dbUrl, "JSF", "jsf");
				Statement	st = myConn.createStatement();
				System.out.println(Arrays.toString(hobiler));
				System.out.println(this.yabanciDil.toString());
				System.out.println("insert into jsf_tablosu"
						+ " values" + "('" + this.ad + "', '" + this.soyad + "', " + this.yas + ", "
						+ this.mezuniyetYili + ", '" + this.okul + "', '" + this.dogumYeri + "', '" + this.meslek + "', '"+this.ehliyet+"',"+tarih+")");
				
				System.out.println(sorgu);
//				ResultSet	rs = st.executeQuery("insert into jsf_tablosu"
//						+ " values" + "('" + this.ad + "', '" + this.soyad + "', " + this.yas + ", "
//						+ this.mezuniyetYili + ", '" + this.okul + "', '" + this.dogumYeri + "', '" + this.meslek + "', '"+this.ehliyet+"')");
				ResultSet	rs = st.executeQuery(sorgu);

				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "AnketSonuc";
		}
	*/
	}

