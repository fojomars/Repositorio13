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
public class Xogador extends Seleccion{
    // VARIABLES
    private int dorsal;
    private String demarcacion;
    
    // CONSTRUCTOR
    public Xogador(int id, String nome, String apelido, int idade, int dorsal, String demarcacion){
        
        super(id, nome, apelido, idade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    // GETTERS Y SETTERS

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    
    // MÉTODOS
    @Override
    public void viaxar(){
        System.out.println("viaxan os xogadores");
    }
    
    public void xogarPartido(){
       System.out.println(super.getNome() + " xoga");
    }
    
    public void entrenar(){
       System.out.println(super.getNome() + " entrena");
    }

    @Override
    public String toString() {
        return super.toString() + " dorsal = " + dorsal + ", demarcacion = " + demarcacion;
    }
}
