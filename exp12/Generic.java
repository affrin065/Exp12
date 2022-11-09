/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic2;
import java.util.*;
/**
 *
 * @author mansoorsaharbanu
 */
public class Generic2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Integer y[]={11,20,44,1,23,765,10,34,2};
         Generic2 o=new  Generic2 ();
         o.min(y);
     
    }
    <t extends Comparable <t>> void min(t[] y){
  t m;
        m=y[0];
  for(int i=0;i<y.length;i++)
  {
     for(int j=0;j<y.length;j++)
     {
         if(y[i].compareTo(y[j])>0)
         {
             m=y[j];
         }
     }
  }
     System.out.println("THE MINIMUM NUMBER IS:::"+ m);
       
    }
}

   
