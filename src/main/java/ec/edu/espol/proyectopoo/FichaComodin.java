/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyectopoo;

/**
 *
 * @author Jeremy
 */
public class FichaComodin extends Ficha
{
    //CONSTRUCTOR-------------------------------------------
    public FichaComodin()
    {
        super(-1,-1);
    }
    
    //SETTERS------------------------------------------------
    public void setLado1(int lado1) 
    {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) 
    {
        this.lado2 = lado2;
    }
    
    //METODOS-----------------------------------------------
    public String toString()
    {
        return "*"+super.toString()+"*";
    }
}
