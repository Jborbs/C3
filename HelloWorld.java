package com.codechallenge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {

	public static void main(String[] args) {
GraphUtils util = new GraphUtils();
		
		DirectedGraph graph2 = new DirectedGraph(); //try with directed graph
		
		graph2.addEdge("H", "E");
		graph2.addEdge("E", "L");
		graph2.addEdge("L", "l");
		graph2.addEdge("l", "O");
		graph2.addEdge("O", " ");
		graph2.addEdge(" ", "W");
		graph2.addEdge("W", "o");
		graph2.addEdge("o", "R");
		graph2.addEdge("R", "1");
		graph2.addEdge("1", "D");
		
		List<String> list = new ArrayList<String>();
		
		//{ D, E, A, B, D } 
		//{ A, B, D, E, C, A } 
		//{ A, B, C, D, E } 
		
		list.add("H");
		list.add("E");
		list.add("L");
		list.add("L");
		list.add("O");
		list.add(" ");
		list.add("W");
		list.add("O");
		list.add("R");
		list.add("L");
		list.add("D");
		
		util.isHamiltonianCycle(graph2, list);
		
		util.nodesWithinDistance(graph2, "D", 2);
		
		util.minDistance(graph2, "A", "C");
		
		graph2.dfs("H", "W");
		
		System.out.print("ello World");
	}
	
	
}
