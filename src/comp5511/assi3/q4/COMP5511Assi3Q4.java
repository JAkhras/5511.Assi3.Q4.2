
package comp5511.assi3.q4;
import java.util.*;
public class COMP5511Assi3Q4 {

    
    public static void main(String[] args) {
      
      LinkedList Data = new LinkedList();  
      //insert data in the List
      Data.add("6876543204");
      Data.add("7876543203");
      Data.add("8876543202");
      Data.add("9876543201");
      int n = Data.size();
     
     
        //print the initial sorted list
         for (int z=0; z<n; z++){
         System.out.print(Data.get(z)+ "\n");}
         System.out.println();
         
        //possibility to simply use the API below 
        //Collections.reverse(Data);
        
        for(int u=0; u < n ; u++){
            //To change the location of a cell:
            //1 Take the value from location 0
            //2 Add it where it belongs
            //3 Delete value from location 0
            
            //(1)Take data in value 0 and (2)add at location (n-u)
            Data.add(n-u,Data.get(0));
            //(3)Then delete value 0
            Data.remove();
        }
     
     //Print reverse sorted list
     for (int z=0; z<n; z++){
         System.out.print(Data.get(z) + "\n");}
    }
     
   
        
    
}
    

