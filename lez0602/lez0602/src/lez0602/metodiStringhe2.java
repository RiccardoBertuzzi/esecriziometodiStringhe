package lez0602;
import java.util.ArrayList;
public class metodiStringhe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> Lista = new ArrayList<>();
		String InputString = "Esercizio Completato";
		int length= InputString.length();
		System.out.print(length);
		System.out.println();
		char at = InputString.charAt(12);
		System.out.print("lettera:"+at);
		System.out.println();
		String substring = InputString.substring(2,6);
		System.out.print("sottostringa:"+substring);
		int Index =substring.indexOf(at);
		

	}

}
