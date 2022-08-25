package graph;

import java.util.ArrayList;
import java.util.HashMap;

public class DetectCycle {
	static HashMap<Integer, ArrayList<Integer>> inp=new HashMap<Integer, ArrayList<Integer>>();
	static HashMap<Integer, Boolean> visited=new HashMap<Integer, Boolean>();
	
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(2);
		inp.put(1, a1);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(1);
		a2.add(3);
		inp.put(2, a2);
		
		ArrayList<Integer> a3=new ArrayList<Integer>();
		a3.add(2);
		a3.add(4);
		a3.add(5);
		inp.put(3, a3);
		
		ArrayList<Integer> a4=new ArrayList<Integer>();
		a4.add(3);
		a4.add(5);
		inp.put(4, a4);
		
		ArrayList<Integer> a5=new ArrayList<Integer>();
		a5.add(3);
		a5.add(4);
		inp.put(5, a5);
		
		int v=1;
		Boolean b=dfs(v,v);
		
		System.out.println(b);
	}

	private static Boolean dfs(int v,int p) {
		visited.put(v, true);
		
		ArrayList<Integer> adjL=inp.get(v);
		System.out.println("Main : " + v + p);
		Boolean flag=false;
		for(Integer i: adjL) {
			System.out.println(i);
			if(visited.get(i)==null || !visited.get(i)) {
				visited.put(i, true);
				p=v;
				System.out.println("DfS invoked" + i + p);
				dfs(i,p);
			}else if(visited.get(i)) {
				System.out.println("Visited : "+ i);
				if(i!=p) {
					System.out.println("got it");
					flag=true;
				}
			}
			//System.out.println("i : " + i + " p : "+p);
		}
		if(flag) {
			return true;
		}else {
			return false;
		}
	}

}
