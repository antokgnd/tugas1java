/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga;
import java.util.Scanner;

/**
 *
 * @author Antok
 */
public class segitiga_siku_kiri_bawah {
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        int x;
        
        boolean menu =true;
        while(menu)
        {
        	System.out.print("Masukkan nilai x =");
        	x = scan.nextInt();
        
        	System.out.println("\nCetak Segitiga Kiri Bawah");
        	System.out.println("==========================");
        	for (int i=1;i<=x;i++)
                        {
                                for(int j=1;j<=i;j++)
                                {
                                    System.out.print("*");
                                }
                                    System.out.println();
        	}
        
        	System.out.print("\nIngin Mencoba lagi (Y/N) ?:");
        	String cek = scan.next();
        	
        	if(cek.equalsIgnoreCase("N"))
        	{
        		menu = false;
        	}
        	else if(cek.equalsIgnoreCase("Y"))
        	{
        		menu = true;
        	}
        	else
        	   System.exit(0);
        }   
    }
    
}
