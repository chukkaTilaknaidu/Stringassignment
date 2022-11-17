package tilak;


public class Panagram {

	public static void main(String[] args) {
   String a="abcd efgh ijkl mnop qrst uv wxyz";
   String b="";
   a=a.replace(" ", "");
   boolean z=true;
   for(int i=0;i<a.length();i++) {
	   if(a.charAt(i)>='a') {
		   b+=a.charAt(i);
		   
	   }
	   if(a.charAt(i)<'a') {
		   b+=(char)(a.charAt(i)+32);
	   }
   }
   char[]c=b.toCharArray();
   int []d=new int[26];
   for(int i=0;i<c.length;i++) {
	   int index=c[i]-97;
	   d[index]++;
	   
   }
   for(int i=0;i<d.length;i++) {
	   if(d[i]==0) {
		   System.out.print("its not a pangram");
		   z=false;
		   
	   }
	   
	   

   }
   if(z=true) {
	   System.out.print("its a pangram");
   }
   
  		

	}

}
