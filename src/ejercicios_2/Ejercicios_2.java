/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_2;
import java.util.*;

/**
 *
 * @author ville
 */
public class Ejercicios_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        double num_1, num_2, suma, resta, multip, division, rest;
        System.out.println("Escribe el primer número");
        num_1= tec.nextDouble();
        System.out.println("Escribe el segundo número");
        num_2= tec.nextDouble();
        
        suma=num_1+num_2;
        resta=num_1-num_2;
        multip=num_1*num_2;
        division=num_1/num_2;
        rest=num_1%num_2;
        
        System.out.println(num_1+" + "+num_2+"= "+suma);
        System.out.println(num_1+" - "+num_2+"= "+resta);
        System.out.println(num_1+" x "+num_2+"= "+multip);
        System.out.println(num_1+" ÷ "+num_2+"= "+division);
        System.out.println(num_1+" % "+num_2+"= "+rest);        
        
    }
    
}
