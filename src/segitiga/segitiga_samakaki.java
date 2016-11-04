/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segitiga; 			//menjelaskan dari induk folder
import java.util.Scanner;    		//mempunyai fungsi untuk mengaktifkan fungsi scanner

/**
 *
 * @author Antok
 */
public class segitiga_samakaki {			/**merupakan sebuah penampung class */
    public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        int x; 						/**merupakan nilai  inputan dari interger */
        
        boolean menu =true;		/**merupakan salahsatu tipe data yang yang berguna untuk memunculkan nilai pembanding */
        while(menu)
        {
        	System.out.print("Masukkan nilai x =");		
        	x = scan.nextInt();			//** berguna untuk memberikan nilai yang dinama bisa merupakan nilai yang di inputkan manual */
        
        	System.out.println("\nCetak Segitiga Sama Kaki"); //** merupakan sebuah nilai yang ditamplikan */
        	System.out.println("==========================");
        	for (int i=1;i<=x;i++)
			{
										//Membuat spasi
				for(int j=x-1;j>=i;j--)
				{ 
					System.out.print(" ");
				}
										//Membuat bintang dari sistem keluaran
				for(int k=1;k<=i;k++)				// merupakan nilai inti  yang dalam perhitungan menjadikan program sesuai yang di maksud
				{ 
					System.out.print("*");
				}
				for (int l=1;l<=i-1;l++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
        	
        	System.out.print("\nIngin Mencoba lagi (Y/N) ?:"); // sebuah kepastian bila program ini mau di coba kembali
        	String cek = scan.next();
        	
        	if(cek.equalsIgnoreCase("N"))			
        	{
        		menu = false;
        	}
        	else if(cek.equalsIgnoreCase("Y"))    //suatu nilai yang dari if jika ya  atau mau melanjutkan
        	{
        		menu = true;
        	}
        	else
        	   System.exit(0); //suatu nilai keluaran jika selesai
        }   
    }
    
}
