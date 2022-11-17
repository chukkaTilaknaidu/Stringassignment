package tilak;

public class UniqueCharacters {

	public static void main(String[] args) {
		String s="hyder";
		s=s.replace(" ", "");
		boolean z=true;
		char[]ch=s.toCharArray();
		int[]a=new int[26];
		for(int i=0;i<ch.length;i++) {
			int index=ch[i]-97;
			a[index]++;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>1) {
				System.out.println("No, its not have unique characters");
				z=false;
				break;
				
			}
			

		}
		if(z==true) {
			System.out.println("ITS have unique characters");
		}

	}

}
