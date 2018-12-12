/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13;

/**
 *
 * @author fojomars
 */
public class Boletin13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Xogador obxXogador1 = new Xogador(5, " Alvaro ", " Morata ", 10, 5, " defensa ");
        Seleccion obxXogador2 = new Xogador(8, " Javier ", " Rodriguez ", 2, 12, " centrocampista ");
        Seleccion obxPersoa = new Masaxista(1, "Felipe", "Perez", 45, "Fisioterapeuta", 20);
        System.out.println(obxPersoa.toString());
        System.out.println(obxXogador1.toString());
        System.out.println(obxXogador2.toString());
    }
    
}
