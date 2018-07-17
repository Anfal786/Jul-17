package com.band;

public class Band {
	String bandName,drummer, keyboardPlayer;
	String[] singers,guitarists;
	int noa;
	public void setBand(String bandName, String[] singers, String[] guitarists, String drummer, String keyboardPlayer) {
		
		this.bandName=bandName;
		this.singers=singers;
		this.guitarists = guitarists;
		this.drummer=drummer;
		this.keyboardPlayer=keyboardPlayer;
	}
	public void printBand() {
		int noa=2;
		System.out.println("\n\nBand Name: "+this.bandName);
		System.out.println("Band Singers: ");
		for(int i=0;i<singers.length;i++) 
		{
			System.out.print(singers[i]+"\t");
			noa++;
		}
		System.out.println("\nBand Guitarists: ");
		for(int i=0;i<guitarists.length;i++) 
		{
			System.out.print(guitarists[i]+"\t");
			noa++;
		}
		System.out.println("\nBand Drummer: "+this.drummer);
		System.out.println("Band Keyboard Player: "+this.keyboardPlayer);
		System.out.println("Numbers of artists are: "+noa);
		this.noa=noa;
	}
	 
}
