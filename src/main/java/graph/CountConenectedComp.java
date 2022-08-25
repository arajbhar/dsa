package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class CountConenectedComp {

	static HashMap<Integer, ArrayList<Integer>> inp = new HashMap<Integer, ArrayList<Integer>>();

	static HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
	
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(2);
		inp.put(1, a1);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(1);
		a2.add(3);
		inp.put(2, a2);
		ArrayList<Integer> a3=new ArrayList<Integer>();
		a3.add(1);
		inp.put(3, a3);
		ArrayList<Integer> a4=new ArrayList<Integer>();
		a4.add(5);
		inp.put(4, a4);
		ArrayList<Integer> a5=new ArrayList<Integer>();
		a5.add(4);
		inp.put(5, a5);
		ArrayList<Integer> a6=new ArrayList<Integer>();
		a6.add(7);
		inp.put(6, a6);
		ArrayList<Integer> a7=new ArrayList<Integer>();
		a7.add(6);
		inp.put(7, a7);
		
		int count=0;
		
		for(Integer key:inp.keySet()) {
			if(visited.get(key)==null || !visited.get(key) ) {
				count++;
				dfs(key);
			}
		}
		
		System.out.println(count);
		
	}
	
	public static void dfs(int v) {
		visited.put(v, true);
		ArrayList<Integer> adjList=inp.get(v);
		for(Integer i:adjList) {
			if(visited.get(i)==null || !visited.get(i)) {
				visited.put(i, true);
				dfs(i);
			}
		}
	}

}
