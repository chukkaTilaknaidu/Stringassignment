package tilak;



public class LaunchAnagram {

	public static void main(String[] args) {
		
		String m="tilaknaidu";
		String r="Tilaknaiduchukka";
		String a="";
		String b="";
		int c=0;
		boolean z=true;
		m=m.replace(" ", "");
		r=r.replace(" ", "");
		
		for(int i=0;i<m.length();i++) {
			if(m.charAt(i)>='a') {
				a+=m.charAt(i);
				
				
			}
			if(m.charAt(i)<'a') {
				a+=(char)(m.charAt(i)+32);
				
			}
			
		}
		for(int i=0;i<r.length();i++) {
			if(r.charAt(i)>='a') {
				b+=r.charAt(i);
				
				
			}
			if(r.charAt(i)<'a') {
				b+=(char)(r.charAt(i)+32);
			}
			
			}
		if(a.length()==b.length()) {
			for(int i=0;i<a.length();i++) {
				if(a.charAt(i)==b.charAt(i)) {
					c+=1;
					
				}
			}
			
		}
		if(c==a.length()) {
			System.out.print("its an anagram");
		}
		else {
			System.out.println("its not an anagram");
		}
		
	}

}
