/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematika;

/**
 *
 * @author hp
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika s=new Matematika();
        s.pertambahan(20, 20);
        s.pengurangan(10,5);
        s.perkalian(10, 20);
        s.pembagian(21, 2);
        System.out.println("----------------------");
        MatematikaCanggih C =new MatematikaCanggih();
        C.pertambahan(12.5, 28.7, 14.2);
        C.pertambahan(12, 28, 14);
        C.pertambahan(23, 34);
        //C.pertambahan(3.4, 4.9);
        
    }
    
}
