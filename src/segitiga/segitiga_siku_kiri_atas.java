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
public class segitiga_siku_kiri_atas {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int x;
        
         boolean menu =true;
         while(menu)
         {
        	System.out.print("Masukkan nilai x =");
        	x = scan.nextInt();
        
        	System.out.println("\nCetak Segitiga Kiri Atas");
        	System.out.println("==========================");
                int baris,bintang,jumlah = 0;
            for(baris=0;baris<jumlah;baris++){
        for(bintang=5;bintang>baris;bintang--){
            System.out.print("*");
            }
            System.out.println("");
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
