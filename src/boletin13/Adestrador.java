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
public class Adestrador extends Seleccion{
    private String idFederacion;
    
    public Adestrador(){
        
    }
    
    public Adestrador(int id, String nome, String apelido, int idade, String idFederacion){
        super(id, nome, apelido, idade);
        this.idFederacion = idFederacion;
    }
    
    @Override
    public void viaxar(){
        System.out.println("viaxan os adestradores");
    }
    
    public void dirixirPartido(){
       System.out.println(super.getNome() + " dirixe o partido");
    }
    
    public void dirixirAdestramento(){
       System.out.println(super.getNome() + " dirixe o entrenamento");
    }

    @Override
    public String toString() {
        return super.toString() + " idFederacion = " + idFederacion;
    }
}
