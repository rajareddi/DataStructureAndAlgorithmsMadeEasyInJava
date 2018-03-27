/*Copyright (c) 07-Mar-2018 CareerMonk Publications and others.
 * E-Mail           	: info@careermonk.com 
 * Creation Date    	: 2015-01-10 06:15:46 
 * Last modification	: 2006-05-31 
               by		: Narasimha Karumanchi 
 * File Name			: A.java
 * Book Title			: Data Structures And Algorithms Made In Java
 * Warranty         	: This software is provided "as is" without any 
 * 							warranty; without even the implied warranty of 
 * 							merchantability or fitness for a particular purpose. 
 * 
 */


package chapter09graphs;

//Java program to print DFS traversal from a given given graph
import java.io.*;
import java.util.*;

//This class represents a directed graph using adjacency list
//representation
class Graph3
{
 private int V;   // No. of vertices

 // Array  of lists for Adjacency List Representation
 private LinkedList<Integer> adj[];

 // Constructor
 Graph3(int v)
 {
     V = v;
     adj = new LinkedList[v];
     for (int i=0; i<v; ++i)
         adj[i] = new LinkedList();
 }

 //Function to add an edge into the graph
 void addEdge(int v, int w)
 {
     adj[v].add(w);  // Add w to v's list.
 }

 // A function used by DFS
 void DFSUtil(int v,boolean visited[])
 {
     // Mark the current node as visited and print it
     visited[v] = true;
     System.out.print(v+" ");

     // Recur for all the vertices adjacent to this vertex
     Iterator<Integer> i = adj[v].listIterator();
     while (i.hasNext())
     {
         int n = i.next();
         if (!visited[n])
             DFSUtil(n, visited);
     }
 }

 // The function to do DFS traversal. It uses recursive DFSUtil()
 void DFS(int v)
 {
     // Mark all the vertices as not visited(set as
     // false by default in java)
     boolean visited[] = new boolean[V];

     // Call the recursive helper function to print DFS traversal
     DFSUtil(v, visited);
 }

 public static void main(String args[])
 {
     Graph3 g = new Graph3(4);

     g.addEdge(0, 1);
     g.addEdge(0, 2);
     g.addEdge(1, 2);
     g.addEdge(2, 0);
     g.addEdge(2, 3);
     g.addEdge(3, 3);

     System.out.println("Following is Depth First Traversal "+
                        "(starting from vertex 2)");

     g.DFS(0);
 }
}
//This code is contributed by Aakash Hasija