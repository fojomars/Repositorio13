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
public class Masaxista extends Seleccion{
    // VARIABLES
    private String titulacion;
    private int anosExperiencia;
    
    // CONSTRUCTORES
    public Masaxista(int id, String nome, String apelido, int idade, String titulacion, int anosExperiencia){
        
        super(id, nome, apelido, idade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }
    
    // GETTERS Y SETTERS
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    // METODOS
    public void darMasaxes(){
       System.out.println(super.getNome() + " da masaxes");
    }
    
    @Override
    public void viaxar(){
        System.out.println("viaxan os masaxistas");
    }

    @Override
    public String toString() {
        return super.toString() + "titulacion = " + titulacion + ", anosExperiencia = " + anosExperiencia;
    }

}
