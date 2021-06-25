package com.codechallenge;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class GraphUtils {
	
	/*
	 * Implement the following methods.
	 */

	public static int minDistance(Graph graph, String src, String dest) {
		
		if(graph == null || src == null || dest == null) {
			
			return -1;
		}
		try {
		if(graph.bfs(src, dest)) {
			
			int counter=0;
			
			Queue<String> queue = newNeighbors(graph, src);
			
			while(!queue.isEmpty()) {
				
				counter++;
				
				if(queue.contains(dest)) {
					
					return counter;
					
				} else {
					
					Queue<String> queue2 = new LinkedList<String>();
					
					for (String item : queue) {
						
						Queue<String> queue3 = newNeighbors(graph, item);
						
						for (String string : queue3) {
							
							if(! queue2.contains(string)) {
								
								queue2.add(string);
							}
						}
						
					}
					
					queue = queue2;
				}
			}
			
			return counter;
		}
		return -1;
		
	} catch (Exception e) {
		
		return -1;
	}
	}
	
	public static Queue<String> newNeighbors(Graph graph, String src){
		
		Set<String> set = graph.getNodeNeighbors(src);
		
		Queue<String> queue = new LinkedList<String>();
		
		for (String item : set) {
			
			queue.add(item);
		}
		
		return queue;
		
	}
	
	
	public static Set<String> nodesWithinDistance(Graph graph, String src, int distance) {
		
		if(graph == null || src == null || distance <= 0) {
			
			return null;
		}
		
		try {
		
		if(! graph.containsNode(src)) {
			
			return null;
		}
		
		Set <String> set = graph.getNodeNeighbors(src);
		
		int counter = 2;
		
		while(counter <= distance) {
			
			Set <String> set2 = new HashSet<String>();
			
			for (String item : set) {
				
				Set <String> set3 = graph.getNodeNeighbors(item); //item should not be null
				
				for (String item2 : set3) {
					
					set2.add(item2);
				}
			}
			
			for (String item : set2) {
				
				set.add(item);
			}
			
			counter++;
		}
		
		set.remove(src);
		
		return set;
		
	} catch (Exception e) {
		return null;
	}
	}
	
	
	public static boolean isHamiltonianCycle(Graph g, List<String> values) {
		
		if(g == null || values == null || values.size() <= 1) {
			
			return false;
		}
		
		try {
		
		int lengthOfList = values.size()-1;
		
		if(! values.get(0).equals(values.get(lengthOfList))) { //first and last element must be the same
			
			return false;
		}
		
		
		Set<String> checkLength = new HashSet<String>();
		
		for (String item : values) {
			
			checkLength.add(item);
		}
		
		if(checkLength.size() != values.size() - 1) { //length of set and list (minus the double counting for the first and last element) must be the same
			
			return false;
		}
		
		
		for (String item : checkLength) { //if node is not contained in the graph
			
			if(! g.containsNode(item)) {
				
				return false;
			}
		}
		
		if(values.size()==2) { //if there's only 2 items in the list
			
			if(values.get(0).equals(values.get(1))) {
				
				return true;
			}
		}
		
		
		if(g.getNumNodes() != values.size() - 1) { // all nodes must be present
			
			return false;
		}
		
		
		int duplicateCounter = 0; // making sure the first element doesn't occur more than 2 times
		
		for (String item : values) {
			
			if(item == values.get(0)) {
				
				duplicateCounter++;
			}
		}
		
		if(duplicateCounter>2) {
			
			return false;
		}
		
		
		Set <String> visitedNodes = new HashSet<String>();
		
		String firstElement = values.get(0);
		
		String lastElement= values.get(lengthOfList);
		
		
		for (int i = 0; i < values.size() - 1; i++) { // -1 because of the next variable functionality
			
		String variable = values.get(i);
		
		String nextVariable = values.get(i+1);
		
		Set <String> neighborNodes = g.getNodeNeighbors(variable);
		
		if(! neighborNodes.contains(nextVariable)) {
			return false;
		}
			
		if(visitedNodes.contains(nextVariable)) {
			return false;
		}
		
		if(! variable.equals(firstElement)) {
		
			visitedNodes.add(variable);
		}
		
		}	
		
		return true;
	} 
		catch (Exception e) {
		
			return false;
	}
	
}
}