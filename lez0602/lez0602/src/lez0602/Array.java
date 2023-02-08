package lez0602;
//importo il java utils di arraylist
import java.util.ArrayList;
//importo la collections per java sort
import java.util.Collections;



public class Array {

	public static void main(String[] args) {

	   	//creazione di un array 2d
			int[][] numbers2 = new int[3][4];
			 System.out.println(numbers2.length);
			 System.out.println(numbers2[0].length);
	      
			// assegno i valori a tutti gli elementi
			for ( int i = 0; i < numbers2.length;i++) {
				for (int j = 0; j < numbers2[i].length; j++) {
					
					numbers2[i][j] = i *4+j;
				}
		}
	       //stampo il mio array
			for (int i = 0; i <numbers2.length; i++) {
				for(int j = 0;j<numbers2[i].length;j++) {
					System.out.print(numbers2[i][j]);
				}
				System.out.println();
			}
			
			//array list
			ArrayList<String> nomi = new ArrayList<>();
			
			//aggiungo dei nomi nel mio array con add()
	        nomi.add("Enzo");
	        nomi.add("Riccardo");
	        nomi.add("Massimo");
	        nomi.add("Giulio");
	        nomi.add("Nello");
	        // Stampo tutto l'array completo
	        System.out.println(nomi);
	        // stampo tutto l'array list (per ogni nome che sta dentro nomi stampa la variabile)
	        for(String nome : nomi) {
	        	System.out.println(nome);
	        }
	        
	        
	        //uso il metodo get per recuperare un elemento in un determinato indice
	        System.out.println(nomi.get(1));
	       
	        //uso il metodo clear - rimuove tutti gli elementi della lista
	        nomi.clear();
	        System.out.println(nomi); // risultato: Array vuoto
	        
	        // uso il metodo contains per restituire true oppure false se l'ogetto esiste nella lista
	        nomi.add("massimo");
	        nomi.add("San Francesco");
	        System.out.println(nomi.contains("massimo")); // risultato true
	        System.out.println(nomi.contains("molise")); // risultato false perchè il molise non esiste nella lista
	        
	        //uso il metodo remove per eliminare un determinato elemento dalla mia lista
	        nomi.remove(0);
	        System.out.println(nomi); // risultato [San Francesco]
	        
	        // uso il metodo isEmpty per capire se il mio array è vuoto tramite un true oppure false
	        System.out.println(nomi.isEmpty());// risultato false
	        // creo un if per sperimentare il funzionamento di isEmpty
	        if(nomi.isEmpty() == true) {
	        	 System.out.println("Array Vuoto");
	        }else {
	        	 System.out.println("Array Pieno");
	        }
	       
	        //uso il metodo sort che serve per ordinare la lista in base al comparatore
	        nomi.clear();
	        nomi.add("d");
	        nomi.add("a");
	        nomi.add("c");
	        nomi.add("b");
	        Collections.sort(nomi);
	        System.out.println(nomi); // risultato [a,b,c,d]
	        
	      //uso il metodo sort per ordine decrescente
	        Collections.sort(nomi, Collections.reverseOrder());
	        System.out.println(nomi); // risultato [d,c,b,a]
	        
	        //uso il metodo set per modificare un elemento in un array
	        nomi.set(0, "Dario");
	        System.out.println(nomi); //  [Dario,c,b,a];
	        
	        // uso il metodo size per restituire la dimensione della lista
	        System.out.println(nomi.size()); // risultato 4
	        
	}

}
