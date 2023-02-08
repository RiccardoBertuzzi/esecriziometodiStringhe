package lez0602;

public class MetodiStringhe {

	public static void main(String[] args) {

       //utilizzo tutti i metodi delle stringhe
		String frase = "Hello World!";
		
		
		//metodo length
		int length = frase.length();
		System.out.println(length); // risultato 12;
		
       //metodo charAt
		char ch = frase.charAt(6); // risultato w;
		System.out.println(ch);
       
	   //metodo substring
		String subStr= frase.substring(0,5); // risultato Hello
		System.out.println(subStr);
		
	 //metodo IndexOff
        int index = frase.indexOf("World"); // risultato 6
        System.out.println(index);
		
      // metodo replace
        
        String newStr = frase.replace('o','i');
        System.out.println(newStr); // risultato  Helli Wirld!
        
      // metodo toUpperCase
       String upperCase = frase.toUpperCase();
       System.out.println(upperCase); // risultato HELLO WORLD!
        
      // metodo toLowerCase
       String lowercase=frase.toLowerCase();
       System.out.println(lowercase); // risultato hello world!
       
      // trim
       String trim= frase.trim();
       System.out.println(trim); // risultato hello world!
      
	}
   

}
