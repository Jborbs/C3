package com.codechallenge;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by merciersj on 8/29/2018.
 */
public class HelloWorld {
/*
* [Intro: Choir]
(In Napoli where love is king)
(When boy meets girl)
(Here's what they say)
* */

    public static class Vertex implements Comparable<Vertex> {


        private String name;
        private List<Edge> adjacenciesList;
        private boolean visited;
        private Vertex predecessor;
        private double distance = Double.MAX_VALUE;
       /* [TONY & JOE]
        For this is the night
        And the heavens are right
        On this lovely Bella Notte*/

/*[DISNEY STUDIO Chorus]
        This is the night
        It's a beautiful night
        And we call it Bella Notte

        Look at the skies
        They have stars in their eyes
        On this lovely Bella Notte*/

        public Vertex(String name) {
            this.name = name;
            this.adjacenciesList = new ArrayList<>();
        }

        public void addNeighbour(Edge edge) {
            this.adjacenciesList.add(edge);
        }

        public String getName() {
            return name;
        }
        /*Side by side with your loved one
        You'll find enchantment here
        The night will weave its magic spell
        When the one you love is near

        Oh, this is the night
        And the heavens are right
        On this lovely Bella Notte*/

        public void setName(String name) {
            this.name = name;
        }

        public List<Edge> getAdjacenciesList() {
            return adjacenciesList;
        }

        public void setAdjacenciesList(List<Edge> adjacenciesList) {
            this.adjacenciesList = adjacenciesList;
        }

        public boolean isVisited() {
            return visited;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
        }

        public Vertex getPredecessor() {
            return predecessor;
        }

        public void setPredecessor(Vertex predecessor) {
            this.predecessor = predecessor;
        }

        public double getDistance() {
            return distance;
        }

        public void setDistance(double distance) {
            this.distance = distance;
        }

        @Override
        public String toString() {
            return this.name;
        }

        @Override
        public int compareTo(Vertex otherVertex) {
            return Double.compare(this.distance, otherVertex.getDistance());
        }
    }
    public static class Edge {

        private double weight;
        private Vertex startVertex;
        private Vertex targetVertex;

        public Edge(double weight, Vertex startVertex, Vertex targetVertex) {
            this.weight = weight;
            this.startVertex = startVertex;
            this.targetVertex = targetVertex;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public Vertex getStartVertex() {
            return startVertex;
        }

        public void setStartVertex(Vertex startVertex) {
            this.startVertex = startVertex;
        }

        public Vertex getTargetVertex() {
            return targetVertex;
        }

        public void setTargetVertex(Vertex targetVertex) {
            this.targetVertex = targetVertex;
        }
    }

/*[Chorus: Dean Martin]
    When the moon hits your eye
    Like a big pizza pie, that's amore
    When the world seems to shine
    Like you've had too much wine, that's amore*/

    public static class DijkstraShortestPath {

        public void computeShortestPaths(Vertex sourceVertex){

            sourceVertex.setDistance(0);
            PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>();
            priorityQueue.add(sourceVertex);
            sourceVertex.setVisited(true);

            while( !priorityQueue.isEmpty() ){
                // Getting the minimum distance vertex from priority queue
                Vertex actualVertex = priorityQueue.poll();

                for(Edge edge : actualVertex.getAdjacenciesList()){

                    Vertex v = edge.getTargetVertex();
                    if(!v.isVisited())
                    {
                        double newDistance = actualVertex.getDistance() + edge.getWeight();

                        if( newDistance < v.getDistance() ){
                            priorityQueue.remove(v);
                            v.setDistance(newDistance);
                            v.setPredecessor(actualVertex);
                            priorityQueue.add(v);
                        }
                    }
                }
                actualVertex.setVisited(true);
            }
        }

        public List<Vertex> getShortestPathTo(Vertex targetVertex){
            List<Vertex> path = new ArrayList<>();

            for(Vertex vertex=targetVertex;vertex!=null;vertex=vertex.getPredecessor()){
                path.add(vertex);
            }

            Collections.reverse(path);
            return path;
        }

    }

    public static void main(String[] args) {

        Vertex LINGUINE = new Vertex("A");
        Vertex PENNE = new Vertex("B");
        Vertex BUCATINI = new Vertex("C");
        Vertex CAVATAPPI = new Vertex("D");
        Vertex SPAGHETTI = new Vertex("E");

        /*[Bridge: Dean Martin]
        Bells will ring, ting-a-ling-a-ling
        Ting-a-ling-a-ling and you'll sing, "Vita bella"
        Hearts will play tippy-tippy-tay
        Tippy-tippy-tay like a gay tarantella*/

        LINGUINE.addNeighbour(new Edge(10,LINGUINE,BUCATINI));
        LINGUINE.addNeighbour(new Edge(17,LINGUINE,PENNE));
        BUCATINI.addNeighbour(new Edge(5,BUCATINI,PENNE));
        BUCATINI.addNeighbour(new Edge(9,BUCATINI,CAVATAPPI));
        BUCATINI.addNeighbour(new Edge(11,BUCATINI,SPAGHETTI));
        PENNE.addNeighbour(new Edge(1,PENNE,CAVATAPPI));
        CAVATAPPI.addNeighbour(new Edge(6,CAVATAPPI,SPAGHETTI));
/*[Verse: Dean Martin]
        When the stars make you drool
        Just like a pasta e fasule, that's amore
        When you dance down the street
        With a cloud at your feet, you're in love*/

        /*When you walk in a dream
        But you know, you're not dreaming, signore
        Scusami, but you see
        Back in old Napoli, that's amore*/
        DijkstraShortestPath shortestPath = new DijkstraShortestPath();
        shortestPath.computeShortestPaths(LINGUINE);




        /*[TONY]
        Oh, this is the night
        It's a beautiful night
        And they call it Bella Notte*/
        //Lmao
        System.out.println("Hello World");
    }

}
