import java.util.*;
import java.io.*;

public class Main{
  
  public static void main(String args[]){
    
    int x = Mod(-1,1,20);
    System.out.println(x);
  }
  
  static int Mod(int x , int n ,int M){
    
    if(n==0) return 1;
    
    else if(n%2 == 0){
      
      int y = Mod(x,n/2,M);
      return (y*y)%M;
      
    }
    
    else{
      return (((x%M)*(Mod(x,n-1,M)))%M);
    }
    
  }
  
}