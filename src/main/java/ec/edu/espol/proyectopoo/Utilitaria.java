/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espol.proyectopoo;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
/**
 * Integrantes del Proyecto: Alain Martínez Vega, Allan Moises Chacha León, Jeremy Rafael Delgado Rodriguez
 * Link del Github: https://github.com/allan23chacha/PROYECTO-POO/edit/main/src/main/java/ec/edu/espol/proyectopoo
 * @author Alain
 */
public class Utilitaria {

    public static ArrayList<Ficha> crearManoJugador()
    {
        Random dado = new Random();
        
        ArrayList<Ficha> fichas = new ArrayList<>();
        
        
        for(int i = 0; i<5;i++)
        {
            int lado1 = (dado.nextInt(6-1+1)+1);
            int lado2 = (dado.nextInt(6-1+1)+1);
            
            if( i==4)
            {
                FichaComodin comodin = new FichaComodin();
                fichas.add(comodin);
            }
            
            Ficha ficha = new Ficha(lado1,lado2);
            fichas.add(ficha);
        }
        
      return fichas;

    }
    
}
