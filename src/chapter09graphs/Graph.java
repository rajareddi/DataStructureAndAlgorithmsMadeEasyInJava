/*Copyright (c) 07-Mar-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: Graph.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter09graphs;

public class Graph {
    private boolean adjMatrix[][];
    private int numVertices;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new boolean[numVertices][numVertices];
  }

    public void addEdge(int i, int j) {
              adjMatrix[i][j] = true;
              adjMatrix[j][i] = true;
  }

    public void removeEdge(int i, int j) {
              adjMatrix[i][j] = false;
              adjMatrix[j][i] = false;
  }

    public boolean isEdge(int i, int j) {
                return adjMatrix[i][j];
  }

  public String toString() {
      StringBuilder s = new StringBuilder();
      for (int i = 0; i < numVertices; i++) {
          s.append(i + ": ");
          for (boolean j : adjMatrix[i]) {
              s.append((j?1:0) + " ");
          }
          s.append("\n");
      }
      return s.toString();
  }

  public static void main(String args[])
  {
      Graph g = new Graph(4);

      g.addEdge(0, 1);
      g.addEdge(0, 2);
      g.addEdge(1, 2);
      g.addEdge(2, 0);
      g.addEdge(2, 3);

      System.out.print(g.toString());
      /* Outputs
         0: 0 1 1 0 
         1: 1 0 1 0 
         2: 1 1 0 1 
         3: 0 0 1 0 
        */
  }

}