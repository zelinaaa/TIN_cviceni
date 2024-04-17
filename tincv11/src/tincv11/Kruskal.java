package tincv11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Kruskal {
	
	private Graf graf;
	
	public Kruskal(Graf graf) {
		this.graf = graf;
	}
	
	
	public ArrayList<Hrana> getSpanningTree(){
		HashMap<Uzel, Set<Uzel>> forest = new HashMap<Uzel, Set<Uzel>>();
		inicializujLes(forest);
		ArrayList<Hrana> minSpanTree = new ArrayList<Hrana>();
		nalezniKostruGrafu(forest, minSpanTree);
		
		return minSpanTree;
	}


	private void nalezniKostruGrafu(HashMap<Uzel, Set<Uzel>> forest, ArrayList<Hrana> minSpanTree) {
		// TODO Auto-generated method stub
		LinkedList<Hrana> hrany = new LinkedList<Hrana>();
		hrany.addAll(graf.getHrany());
		
		Collections.sort(hrany, new ComparatorDleCeny());
		
		for (Hrana hrana : hrany) {
			Set<Uzel> mnozinaUzlu1 = forest.get(hrana.getOdkud());
			Set<Uzel> mnozinaUzlu2 = forest.get(hrana.getKam());
			
			if (!mnozinaUzlu1.equals(mnozinaUzlu2)) {
				minSpanTree.add(hrana);
				
				mnozinaUzlu1.addAll(mnozinaUzlu2);
				
				for (Uzel u : mnozinaUzlu1) {
					forest.put(u, mnozinaUzlu1);
				}
			}
		}
		
	}

	private void inicializujLes(HashMap<Uzel, Set<Uzel>> forest) {
		// TODO Auto-generated method stub
		Collection<Uzel> uzly = graf.getVrcholy();
		for(Uzel uzel : uzly) {
			Set<Uzel> set = new HashSet<>();
			set.add(uzel);
			forest.put(uzel, set);
		}
		
	}
}
