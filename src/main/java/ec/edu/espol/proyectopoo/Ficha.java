/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyectopoo;

/**
 * Integrantes del Proyecto: Alain Martínez Vega, Allan Moises Chacha León, Jeremy Rafael Delgado Rodriguez
 * Link del Github: https://github.com/allan23chacha/PROYECTO-POO/edit/main/src/main/java/ec/edu/espol/proyectopoo
 * @author Jeremy
 */
public class Ficha 
{
    protected int lado1;
    protected int lado2;
    
    //CONSTRUCTOR--------------------------------------------
    public Ficha(int lado1, int lado2) 
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    //GETTERS------------------------------------------------
    public int getLado1() 
    {
        return lado1;
    }

    public int getLado2() 
    {
        return lado2;
    }
    
    //METODOS-------------------------------------------------
    public String toString()
    {
        return (this.lado1 + ":" +this.lado2);
    }   
}
