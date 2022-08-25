package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectBFS {
	static HashMap<Integer, ArrayList<Integer>> inp=new HashMap<Integer, ArrayList<Integer>>();
	static HashMap<Integer, Boolean> visited=new HashMap<Integer, Boolean>();
	static Queue<Elm> q=new LinkedList<Elm>();
	
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
		
		Boolean b=bfsCycle(1);
		System.out.println(b);
	}
	
	static Boolean bfsCycle(int a) {
		visited.put(a, true);
		Elm e=new Elm(a, a);
		q.add(e);
		
		while(!q.isEmpty()) {
			Elm currNode=q.poll();
			
			for(Integer i:inp.get(currNode.x)) {
				if(visited.get(i)==null || !visited.get(i)) {
					visited.put(i, true);
					Elm connectedNode=new Elm(i, currNode.x);
					q.add(connectedNode);
				}else {
					if(i!=currNode.p) {
						return true;
					}
				}
			}
		}
		
		return false;
		
		
	}

}

class Elm{
	int x;
	int p;
	Elm(int x,int y){
		this.x=x;
		this.p=y;
	}
}
