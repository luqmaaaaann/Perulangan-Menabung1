/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marimenabung1;

/**
 *
 * @author Inue
 */
import java.util. *;
public class MariMenabung1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b; //merupakan jmlh bulan joko menabung
        System.out.print("Masukkan Bulan : ");
        b = a.nextInt();
        
        int o; //merupakan tabungan joko
        System.out.print("Masukkan Setoran Awal : ");
        o = a.nextInt();
        
        int t; //merupakan jmlh yg ditabung joko
        System.out.print("Masukkan Setoran Perbulan : ");
        t = a.nextInt();
        System.out.print("hasil : ");
        
        for (int i=b; b>0; b--){
            System.out.print(o+" ");
            o+=t;  
            
        }
        
    }       
}
