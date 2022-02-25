/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percabangan.identitas;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class PercabanganIdentitas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama, panggilan, sekolahAsal, identitas;
        int suhuBadan;
        
        identitas=" Nahda Ayuni Narindri / X RPL 6 / 26";
        System.out.println("Identitas :" + identitas);
        
        Scanner input=new Scanner (System.in);
        
        System.out.print("Nama Lengkap = ");
        nama= input.nextLine();
        System.out.print("Nama Panggilan = ");
        panggilan= input.nextLine();
        System.out.print("Sekolah Asal = ");
        sekolahAsal= input.nextLine();
        System.out.print("Suhu Badan = ");
        suhuBadan= input.nextInt();
        
        if(suhuBadan <= 37){
        System.out.println("Suhu badan memenuhi kriteria,Silahkan memasuki area sekolah");
    }
        else 
        System.out.println("Suhu badan tinggi, dilarang memasuki area sekolah");
        

        
    }
    
}
