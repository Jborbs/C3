package com.codechallenge;
import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		UndirectedGraph graph = new UndirectedGraph(); //try with directed graph
		
		graph.addEdge("Dallas", "NYC");
		graph.addEdge("Dallas", "Boston");
		graph.addEdge("Boston", "NYC");
		graph.addEdge("Dallas", "Philadelphia");
		graph.addEdge("NYC", "Austin");
		graph.addEdge("Austin", "Trenton");
		graph.addEdge("Austin", "Michigan");
		graph.addEdge("Michigan", "Seattle");
		graph.addNode("Houston");
		
		
		
		GraphUtils util = new GraphUtils();
		
		System.out.println(util.minDistance(graph, "NYC", "Boston"));
		
		System.out.println(util.nodesWithinDistance(graph, "Austin", 0));
		
		
		DirectedGraph graph2 = new DirectedGraph(); //try with directed graph
		
		graph2.addEdge("A", "B");
		graph2.addEdge("A", "D");
		graph2.addEdge("B", "C");
		graph2.addEdge("B", "D");
		graph2.addEdge("C", "D");
		graph2.addEdge("D", "E");
		graph2.addEdge("E", "A");
		graph2.addEdge("E", "C");
		//graph2.addNode("Houston");
		
		List<String> list = new ArrayList<String>();
		
		//{ D, E, A, B, D } 
		//{ A, B, D, E, C, A } 
		//{ A, B, C, D, E } 
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("A");
		
		System.out.println(util.isHamiltonianCycle(graph2, list));
		
		System.out.println(util.nodesWithinDistance(graph2, "D", 10));
		
		System.out.println(util.minDistance(graph2, "A", "C"));
	}

}
