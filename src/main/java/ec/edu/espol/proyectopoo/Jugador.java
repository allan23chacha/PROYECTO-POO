/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyectopoo;
import java.util.ArrayList;
/**
 * Integrantes del Proyecto: Alain Martínez Vega, Allan Moises Chacha León, Jeremy Rafael Delgado Rodriguez
 * Link del Github: https://github.com/allan23chacha/PROYECTO-POO/edit/main/src/main/java/ec/edu/espol/proyectopoo
 * @author Alain
 */
public class Jugador {
    
    private String nombre;
    private ArrayList<Ficha> mano;

    public Jugador(String nombre, ArrayList<Ficha> mano)
    {
        this.nombre = nombre;
        this.mano = mano;
        
    }

    public ArrayList<Ficha> getMano() {
        return mano;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Ficha getFicha(int i)
    {
        if(mano.get(i)!=null)
        {
            return mano.get(i);
        }
        else
            return null;
        
    }
    
    public String imprimirMano()
    {
        StringBuilder m = new StringBuilder();
        int cont =0;
        for(Ficha ficha: mano)
        {
            if(cont<(mano.size()-1))
            {
                m.append(ficha.toString()+"-");
            }
            else
            {
                m.append(ficha.toString());
            }
            cont++;
        }
        
        return m.toString();
    }
    
    public void removerFicha(Ficha ficha)
    {
       mano.remove(ficha);
       
    }
    
    
    
}
