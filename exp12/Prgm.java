/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prgm;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author affrin
 */
public class Prgm {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Integer> list=new ArrayList<>();
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int x;
        int z;
        boolean y=true;
        while(y)
        {
            System.out.println("Select the operation:\n");
            System.out.println("1.Enter element at first\n");
            System.out.println("2.Enter element at middle\n");
            System.out.println("3.Enter element at last\n");
            System.out.println("4.Delete specific index\n");
            System.out.println("5.Display the array\n");
            System.out.println("6.Exit\n");
            x=sc.nextInt();
            switch(x)
            {
                case 1:
                    System.out.println("Enter the element:");
                    z=sc.nextInt();
                    list.add(0, z);
                    break;
                case 2:
                    System.out.println("Enter the element:");
                    z=sc.nextInt();
                    int s=list.size()/2;
                    list.add(s, z);
                    break;
                case 3:
                    System.out.println("Enter the element:");
                    z=sc.nextInt();
                    list.add(z);
                    break;
                case 4:
                    System.out.println("Enter the index of element:");
                    z=sc.nextInt();
                    list.remove(z+1);
                    break;
                case 5:
                    System.out.println(list);
                    break;
                case 6:
                    y=false;
                    break;
                default:
                    System.out.println("Wrong operation!!!");
                    break;
            }
        }
    }   
}
        
   
