package com.band;

public class TestBand {
	public static void main(String[] args) {
		Band b1 = new Band();
		b1.setBand("Band1", new String[] {"MAK","SAM"}, new String[]{"G1","G2"}, "Drummer001", "keyboardPlayer001");
		b1.printBand();
		Band b2 = new Band();
		b2.setBand("Band2", new String[] {"MAK","KAM"}, new String[]{"G1","G2"}, "Drummer001", "keyboardPlayer001");
		b2.printBand();
		if(b1.noa==b2.noa)
			System.out.println("\nNumber of Artists are the same in both Bands");
		else if(b1.noa>b2.noa)
			System.out.println("\nBand "+b1.bandName+" has more Artists("+b1.noa+")");
		else
			System.out.println("\nBand "+b2.bandName+" has more Artists("+b2.noa+")");
		String a[] = {"","",""};

		
	}
}
