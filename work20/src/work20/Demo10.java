package work20;

public class Demo10 {

	public static void main(String[] args)
	{
		String a[]={"Java", "47Z7", "10", "34", "1Python"};
	     int Numeric=0;
	     int Strings=0;
	     for(int i=0; i<a.length; i++)
	     {
	    	 boolean num=false;
        	 boolean alp=false;
        	 boolean alpnum=false;
	         String b=a[i];
	         for(int j=0; j<b.length(); j++)
	         {
	        	 
	        	 if(Character.isDigit(b.charAt(j)))
		         {
		             num=true;
		         }
		         else if(Character.isAlphabetic(b.charAt(j)))
		         {
		        	 alp=true;
		         } 
		         else
		         {
		        	 num=true;
		         }
	         }
	         
	     }
	     System.out.println(Numeric);
	     System.out.println(Strings);
	}

}
