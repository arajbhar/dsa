package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class DFSGraph {
	
	static HashMap<Integer, ArrayList<Integer>> inp=new HashMap<Integer, ArrayList<Integer>>();
	
	static HashMap<Integer, Boolean> visited=new HashMap<Integer, Boolean>();
	
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(2);
		a1.add(4);
		inp.put(1, a1);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(1);
		a2.add(4);
		a2.add(3);
		inp.put(2, a2);
		ArrayList<Integer> a3=new ArrayList<Integer>();
		a3.add(2);
		a3.add(5);
		inp.put(3,a3);
		ArrayList<Integer> a4=new ArrayList<Integer>();
		a4.add(1);
		a4.add(2);
		a4.add(5);
		inp.put(4,a4);
		ArrayList<Integer> a5=new ArrayList<Integer>();
		a5.add(4);
		a5.add(3);
		a5.add(6);
		inp.put(5,a5);
		ArrayList<Integer> a6=new ArrayList<Integer>();
		a6.add(5);
		inp.put(6,a6);
		
		Integer src=1;
		Integer tar=7;
		
		Queue<Integer> q= new LinkedList<>();
		System.out.println(inp);
		Boolean ans=dfs(q,src,tar);
		System.out.println(visited);
		System.out.println(ans);		
		
	}
	
	static Boolean dfs(Queue<Integer> q,Integer s,Integer t) {
		
		visited.put(s, true);
		if(s==t) {
			return true; 
		}
		
		q.add(s);
		
		while(!q.isEmpty()) {
			Integer i=q.poll();
			ArrayList<Integer> a=inp.get(i);
			for(Integer elm: a) {
				if(visited.get(elm)==null || !visited.get(elm)) {
					if(elm==t) {
						return true;
					}
					visited.put(elm, true);
					q.add(elm);
				}	
			}
		}
		
		return false;	
	}
	

}
