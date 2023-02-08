package lez0602;
import java.util.ArrayList;
public class eserciziostringhe2d {
	public static void main (String[]args) {
int numbers[][]= new int[5][5];
//ArrayList<Int> listanum= new ArrayList<>();
int somma=0;

for ( int i = 0; i < numbers.length;i++) {
	for (int j = 0; j < numbers[i].length; j++) {
		numbers[i][j] = (i*5+j)+1; 
		System.out.print(numbers[i][j]);
	}System.out.println();
}


for (int i=0;i<numbers.length;i++) {
	for (int j=0;j<numbers[i].length;j++) {
	              somma=somma+numbers[i][j]; 
	              
	              } System.out.println();
	} System.out.print(somma);
	}
}