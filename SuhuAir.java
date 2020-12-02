/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;
import java.util.Scanner;

/**
 *
 * @author fadil
 */
public class SuhuAir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Contoh pemakain IF tiga kasus : wujud air*/
        
        /*Kamus*/
        int T;
        
        /*Program*/
        System.out.println("Contoh IF tiga kasus");
        System.out.println("Suhu(der.C) = ");
        
        //scanner untuk masukan suhu air
        Scanner scanner = new Scanner (System.in);
        T = scanner.nextInt(); //masukkan suhu air dengan tipe int
        
        //proses pengecekan dengan if
        if (T < 0) {
            System.out.println("Wujud air beku" + T);
        }
        else if ((0 <= T) && (T <= 100)){
            System.out.println("Wujud air cair" + T);
        }
        else if ( T > 100){
            System.out.println("Wujud air uap/gas " + T );
        }
    }
    
}
