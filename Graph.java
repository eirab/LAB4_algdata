package LAB4;

import java.io.File;
import java.io.FileNotFoundException;
import java.rmi.NoSuchObjectException;
import java.util.Scanner;

/*
---- LAB 4, ASSIGNMENT 1 ----

This is an implementation of the Graph class found in Algorithms, 4th edition by
Sedgewick & Wayne.

Support is provided to create a new graph consisting of an adjacency list - an array
of type Bag<String>.
 */
public class Graph {

    private int vertices;
    private int edges;
    private boolean[] visited;
    private Bag<String>[] graph;

    //Initialise an empty of size vertices
    public Graph(int v) throws FileNotFoundException {
        this.vertices = v;
        this.edges = 0;
        this.visited = new boolean[v];
        graph = (Bag<String>[]) new Bag[v];
        for (int i = 0; i < v; i++) {
            graph[v] = new Bag<String>();
    }
    }



   public static void graphFromTxt() throws FileNotFoundException {
       File txt = new File("test.txt");
       Scanner sc = new Scanner(txt);
       BinarySearchST<String, Integer> st = new BinarySearchST<>();
       String current;


       while(sc.hasNext()){

           current = sc.next();

           if(st.contains(current)){
           st.put(current, st.get(current)+1);
           }

           else if(!st.contains(current)){
               st.put(current, 1);
           }
           sc.nextLine();
       }


    graphFromTxt(st,txt);

   } //verticesFromTxt


    public static void graphFromTxt(BinarySearchST<String, Integer> st, File txt) throws FileNotFoundException {


       Graph newGraph = new Graph(st.size());

        for(String key : st.keys()){
            int n = st.get(key);

            for(int j = 0; j < n; j++){


            }

        }


    }















} //Class
