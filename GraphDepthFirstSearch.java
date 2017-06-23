/*

Takes STD input as follows

10 10  // No. of nodes(n), No. of edges(m)
8 1    // m statements --> connection between the nodes
8 3
7 4
7 5
2 6
10 7
2 8
10 9
2 10
5 10
2       // root node

This can be used to find disconnected graphs in the entire graph as well. as we loop through the visited matrix

*/



import java.util.*;
import java.io.*;


public class GraphDepthFirstSearch{
    
    static void dfs(int i , int[][] adj , boolean[] visited){
        
        visited[i] = true;
        //System.out.println(i);
        for(int j = 0 ; j < visited.length; j++){
            
            if(adj[i][j] == 1 && !visited[j]){
                dfs(j,adj,visited);
            }
            
        }
        
    }
    
    public static void main(String args[] ) throws Exception {
        
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] mat = new int[n][n];
        
        for (int i = 0 ; i < m ; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a-1+" "+ (b-1));
            mat[a-1][b-1] = 1;
            
            
        }
        
        boolean[] visited = new boolean[n];
        int root = sc.nextInt();
        dfs(root-1,mat,visited);
        
        int count = 0;
        for(boolean f : visited){if(!f)count++;System.out.println(f);}
        System.out.println(count);
    }
    
      
    
}