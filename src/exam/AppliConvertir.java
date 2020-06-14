package exam;

import java.util.Scanner;

public class AppliConvertir {
    public static void main(String [] args) {
    	Convert number=new Convert(); //instanciation of the objet number
    	String res=""; //declaration du chaine de caractere qui va contenir le resultat;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number to convert");
        String decimal=sc.nextLine();
        if(number.verifBase10(decimal)) {
       int number1=number.toInt(decimal); //Conversion du chaine de caracteres en chiffres;
       res=number.ToHexa(number1);   //Conversion du nombre decimal en hexadecimal;
       System.out.println("Voici le nombre en hexadecimal: "+res); //Affichage du resultat;
       }
        else {
        	System.out.println("Please check out the number you have entered");
        }
      }
}
class Convert{
	
    boolean verifBase10(String sDecimal) // methode qui teste si la chaine de caractere contient uniquement des chiffres
    {
       boolean test = true;
       String chiffreDecimal= "0123456789";
       if(sDecimal.length() == 0) //teste si la chaine entree est vide
       return false;
       for(int i = 0; i < sDecimal.length() ;i++)
       if(chiffreDecimal.indexOf(sDecimal.charAt(i)) == -1) //teste  de chaque  caractere entree n' appartient pas dans "0123456789"
       {
    	  test = false;
          break;
       }
    	 return test;
    }
     /* methode qui convertit la chaine tapee en nombre */		
    int toInt(String number) {
	   int num=Integer.parseInt(number);
      
       return num;
   }
    //Methode de conversion decimal-hexadecimal
   String ToHexa(int num) {
	   int rem;
	   String str2="";
	   char hex[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	   while(num >0 && num<=65535)
	   {
		   rem=num%16;
		   str2=hex[rem]+str2;  //changement du chiffre en code hexadecimal
		   num=num/16;
	   }
	   return str2;
   }
}