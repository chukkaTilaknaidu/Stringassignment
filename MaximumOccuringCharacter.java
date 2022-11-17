package tilak;

import java.util.ArrayList;

public class MaximumOccuringCharacter {

	public static void main(String[] args) {
		String s="Tilaknaiduattt";
		s=s.replace(" ", "");
		
		int max=0;
		s=s.toLowerCase();
		char []ch=s.toCharArray();
		char [] z=new char[26];
		int []x=new int[26];
		for(int i=0;i<ch.length;i++) {
			int f=ch[i]-97;
			z[f]=ch[i];
			x[f]++;
		}
		for(int i=0;i<z.length;i++) {
			
			if(x[i]>max) {
				max=x[i];
				
				
			}
		}
		
		for(int i=0;i<x.length;i++) {
			if(x[i]==max) {
				System.out.println(z[i]);
			}
		}


	}

}
