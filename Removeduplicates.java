package tilak;

public class Removeduplicates {

	public static void main(String[] args) {
		String s="hyderabbas";
		String output="";
		char[]s1=s.toCharArray();
		char[]s2=new char[s.length()];
		int []a1=new int[26];
		int a=0;
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i]!=s2[j]) {
					a+=1;
				}
				if(a==s2.length) {
					s2[i]=s1[i];
					a1[i]++;
				}
				
			}
			a=0;
		}
		for(int i=0;i<s2.length;i++) {
			if(a1[i]>0) {
				output+=s2[i];
			}
		}
		System.out.println(output);
	


	

	
	
		
		
	}

}
