package Model;

import java.util.HashMap;

public class Model {
	
	
	java.util.HashMap<Integer,Telefonbuch> map2 = new java.util.HashMap<Integer,Telefonbuch>();
	
	Telefonbuch Test1 = new Telefonbuch("Test1", "Berlin", "1" , "2");
	Telefonbuch Test2 = new Telefonbuch("Test1", "München", "2" , "3");
	Telefonbuch Test3 = new Telefonbuch("Test2", "Köln", "3" , "4");
	Telefonbuch Test4 = new Telefonbuch("Test3", "Kassel", "4" , "5");
	
	
	public Model() {

		map2.put(1, Test1);
		map2.put(2, Test2);
		map2.put(3, Test3);
		map2.put(4, Test4);
	}



public void suchen(String string, String string2) {

	
	for (int i = 1; i < map2.size()+1; i++) {
		
			if(string.equals(map2.get(i).getName()) && string2.equals("Ort o. PLZ")){
			System.out.println(map2.get(i));
			}	
		
			if(string.equals(map2.get(i).getName()) && string2.equals(map2.get(i).getAdresse())) {	
			System.out.println(map2.get(i));
			} 
			
			if(string.equals("Name (oder Suchwort)") && string2.equals(map2.get(i).getPlz())){
			System.out.println(map2.get(i));
			}
		
			if(string.equals("Name (oder Suchwort)") && string2.equals(map2.get(i).getAdresse())) {
			System.out.println(map2.get(i));
			}
		
			if(string.equals(map2.get(i).getName()) && string2.equals(map2.get(i).getPlz())){
			System.out.println(map2.get(i));
			}
				
				
				}
			}	
		
	
	



	public void suchen2(String string2) {
		for (int j = 1; j < map2.size()+1; j++) {
		if(string2.equals(map2.get(j).getTelefon())){
			System.out.println(map2.get(j));
			
			}
		}
		
	}

}
