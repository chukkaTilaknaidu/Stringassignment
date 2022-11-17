package tilak;

public class Printduplicates {

	public static void main(String[] args) {
		String s="sai kiran";
		s=s.replace(" ", "");
		char []ch=s.toCharArray();
		char []z=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
		
			for(int j=i+1;j<z.length;j++) {
				if(ch[i]==z[j]) {
					System.out.println(ch[i]);
					
					
				}

				
			}
			
			
			
			
			
			
			
			
		}


	}

}
