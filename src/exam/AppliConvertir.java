package exam;

import java.util.Scanner;

public class AppliConvertir {
    public static void main(String [] args) {
    	Convert number=new Convert(); //instanciation of the objet number
    	String res=""; //declaration of the string to show the result
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number to convert");
        String decimal=sc.nextLine();
        if(number.verifBase10(decimal)) {
       int number1=number.toInt(decimal); //Conversion of the string in to number
       res=number.ToHexa(number1);   
       System.out.println("Voici le nombre en hexadecimal: "+res);
       }
        else {
        	System.out.println("Please check out the number you have entered");
        }
      }
}
class Convert{
	
    boolean verifBase10(String sDecimal) // method which test the entered number
    {
       boolean test = true;
       String chiffreDecimal= "0123456789";
       if(sDecimal.length() == 0) 
       return false;
       for(int i = 0; i < sDecimal.length() ;i++)
       if(chiffreDecimal.indexOf(sDecimal.charAt(i)) == -1) 
       {
    	  test = false;
          break;
       }
    	 return test;
    }
    		
    int toInt(String number) {
	   int num=Integer.parseInt(number);
      
       return num;
   }
   
   String ToHexa(int num) {
	   int rem;
	   String str2="";
	   char hex[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	   while(num >0 && num<=65535)
	   {
		   rem=num%16;
		   str2=hex[rem]+str2;  //conversion in hexadecimal code
		   num=num/16;
	   }
	   return str2;
   }
}