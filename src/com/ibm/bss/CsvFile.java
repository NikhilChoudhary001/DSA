package com.ibm.bss;

import java.util.ArrayList;
import java.util.List;

class CurrRatio{
	private String currency1;
	private String currency2;
	private float ratio;
	
	CurrRatio(String curr1, String curr2, float ratio){
		this.currency1 = curr1;
		this.currency2 = curr2;
		this.ratio = ratio;
	}

	public String getCurrency1() {
		return currency1;
	}

	public void setCurrency1(String currency1) {
		this.currency1 = currency1;
	}

	public String getCurrency2() {
		return currency2;
	}

	public void setCurrency2(String currency2) {
		this.currency2 = currency2;
	}

	public float getRatio() {
		return ratio;
	}

	public void setRatio(float ratio) {
		this.ratio = ratio;
	}

	
}
public class CsvFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		USD , 0.01, yen
//		YEN, 5.2, GBP
//		GBP, 2.2, INR
//		DUT, 2.3, INR
//		XYZ, 1.1, PQR
//		MNO, 2.5, USD
		
		String r1 = "USD";
		String r2 = "DUT";
		
		CurrRatio c1 = new CurrRatio("USD", "YEN", 0.01f);
		CurrRatio c2 = new CurrRatio("YEN", "GBP", 5.2f);
		CurrRatio c3 = new CurrRatio("GBP", "INR", 2.2f);
		CurrRatio c4 = new CurrRatio("DUT", "INR", 2.3f);
		CurrRatio c5 = new CurrRatio("XYZ", "PQR", 1.1f);

		List<CurrRatio> c = new ArrayList<>();
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		
		float r = 0f;
		
		float finalRatio = 0f
		
		for(CurrRatio ratio1 : c) {
			finalRatio = 0f;
			String cur1 = ratio1.getCurrency1();
			String curr2 = ratio1.getCurrency2();
			if(cur1.equalsIgnoreCase(r1)) {
				for(CurrRatio ratio2 : c) {
					if(curr2.equals(ratio2.getCurrency1())) {
						finalRatio = ratio1.getRatio() * ratio2.getRatio();
					}else if(curr2.equals(ratio2.getCurrency2())) {
						finalRatio = ratio1.getRatio() * (1f/ratio2.getRatio());
					}
					
					if(r2.equals(ratio2))
				}
			}
		}
		
	}

}


//List<Node> 
//
//a
//b c
//d e f 
//
//class Mapping{
//	String curr2;
//	float ratio;
//}
//
//class Node {
//	String curr1;
//	
//	List<Mapping> mapping;
//}
//
//List<Mapping> map = new ArrayList<>();
//map.add("YEN", 0.01f);
//Node t = new Node("USD", map);
//
//
//
//mapping.add()

