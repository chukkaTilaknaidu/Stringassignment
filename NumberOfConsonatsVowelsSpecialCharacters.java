package tilak;

public class NumberOfConsonatsVowelsSpecialCharacters {

	public static void main(String[] args) {
		String s="sdhdsoihofoeuf";
		String z="aeiou";
		String v="bcdfghjklmnpqrstvwxyz";
		int m=0;
		int noofvowels=0;
		int noofconsonants=0;
		int noofspecialcharacters=0;
		s=s.replace(" ", "");
		s=s.toLowerCase();
		z=z.toLowerCase();
		char[]a=s.toCharArray();
		char[]b=z.toCharArray();
		char[]c=v.toCharArray();
		char[]l=new char[26];
		int []d=new int[26];
		int[]e=new int[26];
		int[]k=new int[26];
		char[]f=new char[26];
		char[]g=new char[26];
		char[]h=new char[26];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					int index=b[j]-97;
					f[index]=b[j];
					d[index]++;
					
					
				}
				
				
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<c.length;j++) {
				if(a[i]==c[j]) {
					int index=c[j]-97;
					g[index]=c[j];
					e[index]++;
				}
			}
		}
		
		
		for(int i=0;i<d.length;i++) {
			noofvowels+=d[i];
		}
		for(int i=0;i<e.length;i++) {
			noofconsonants+=e[i];
			
		}
		noofspecialcharacters=a.length-(noofconsonants+noofvowels);
		
		System.out.println("no of vowels are "+noofvowels);
		System.out.println("no of consonats are "+noofconsonants);
		System.out.print("no of special characters are "+noofspecialcharacters);
		
		
		
		
		

	}

}
