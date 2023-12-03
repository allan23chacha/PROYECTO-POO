/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espol.proyectopoo;
import java.util.Scanner;
/**
 *
 * @author allan,alain,jeremy
 */
public class ProyectoPoo {

    public static void main(String[] args) {

        Juego juego = new Juego();
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Bienvenido al juego Dominó");
        System.out.println("<------------------------->");
        System.out.println("");
        System.out.println("Si desea jugar contra la maquina ingrese -->Y<-- , si desea jugar contra otro jugador ingrese -->N<-- ");
        String modo = sc.next();
                
        boolean condicionfinal2 = true;
        boolean condicionfinal = true;

         if(modo.toUpperCase().equals("Y"))
        { 
        System.out.println("Ingrese su nombre de jugador");
        String nombre = sc.next();
        juego.agregarJugador("0");
        juego.agregarJugador(nombre);
        Jugador jugador1 = juego.getJugadores().get(0);
        Jugador jugador2 = juego.getJugadores().get(1); 
        
        while(((jugador1.getMano().size()!=0)&&(jugador2.getMano().size()!=0)) && (condicionfinal && condicionfinal2) )
        {
            
            if(condicionfinal)
            {
                System.out.println("Jugador "+jugador1.getNombre()+": Mano --> "+jugador1.imprimirMano());
            
                System.out.println("Linea de juego --> "+juego.mostrarLinea());
                int indice = juego.Maquina(jugador1);
            
                
                if(indice!=-1)
                   {
                       System.out.println("Ingrese el indice de ficha para jugar(0 es el primero): ");
                       System.out.println(indice);
                       boolean condc = juego.jugar(jugador1, indice);
                    
                   }
                else
                   {
                    System.out.println("Upss! Jugador "+jugador1.getNombre()+", tiene una mano no jugable Perdio el juego, intentelo de nuevo ");
                    condicionfinal2 = false; // indica q el jugador 0 perdio
                   }
                  
                
            }
            
            
            if(condicionfinal2)
            {
                System.out.println("Jugador "+jugador2.getNombre()+": Mano --> "+jugador2.imprimirMano());
            
                System.out.println("Linea de juego --> "+juego.mostrarLinea());
                boolean condicion2 = false;
                boolean jugable2 = juego.manoJugable(jugador2);
                
            
                do{
                    
                    if(jugable2)
                      {
                        System.out.println("Ingrese el indice de ficha para jugar(0 es el primero): ");
                        int indice = sc.nextInt();
                        boolean condc1 = juego.jugar(jugador2, indice);
                        condicion2 = condc1;
                      }
                    else
                      {   
                        System.out.println("Upss! Jugador "+jugador2.getNombre()+", tiene una mano no jugable Perdio el juego, intentelo de nuevo");
                        condicion2 = true;
                        condicionfinal = false; // indica q el jugador 1 perdio
                      }
                 }    
                 while(!condicion2);
            }
            
            
       }  
        
        
        
       if(condicionfinal== false)
       {
           System.out.println("Felicidades!! "+jugador1.getNombre() +" ha ganado el juego de Domino");
       }
       
        else
       {
           System.out.println("Felicidades!! "+jugador2.getNombre() +" ha ganado el juego de Domino");
       }
       }
        // else de if principal
       
       else
        {
        System.out.println("Ingrese el nombre del jugador 1");
        String nombre = sc.next();
        juego.agregarJugador(nombre);
        System.out.println("Ingrese el nombre del jugador 2");
        String nombre2 = sc.next();
        juego.agregarJugador(nombre2);
        Jugador jugador1 = juego.getJugadores().get(0);
        Jugador jugador2 = juego.getJugadores().get(1);
        
         while(((jugador1.getMano().size()!=0)&&(jugador2.getMano().size()!=0)) && (condicionfinal && condicionfinal2) )
        {
           
            if(condicionfinal)
            {
                System.out.println("Jugador "+jugador1.getNombre()+": Mano --> "+jugador1.imprimirMano());
            
                System.out.println("Linea de juego --> "+juego.mostrarLinea());
                boolean condicion1 = false;
                boolean jugable1 = juego.manoJugable(jugador1);
                
            
                do{
                    
                    if(jugable1)
                      {
                        System.out.println("Ingrese el indice de ficha para jugar(0 es el primero): ");
                        int indice = sc.nextInt();
                        boolean condc = juego.jugar(jugador1, indice);
                        condicion1 = condc;
                      }
                    else
                      {   
                        System.out.println("Upss! Jugador "+jugador1.getNombre()+", tiene una mano no jugable Perdio el juego, intentelo de nuevo");
                        condicion1 = true;
                        condicionfinal = false; // indica q el jugador 1 perdio
                      }
                 }    
                 while(!condicion1);
                  
                
            }
            
            if(condicionfinal2)
            {
                System.out.println("Jugador "+jugador2.getNombre()+": Mano --> "+jugador2.imprimirMano());
            
                System.out.println("Linea de juego --> "+juego.mostrarLinea());
                boolean condicion2 = false;
                boolean jugable2 = juego.manoJugable(jugador2);
                
            
                do{
                    
                    if(jugable2)
                      {
                        System.out.println("Ingrese el indice de ficha para jugar(0 es el primero): ");
                        int indice = sc.nextInt();
                        boolean condc1 = juego.jugar(jugador2, indice);
                        condicion2 = condc1;
                      }
                    else
                      {   
                        System.out.println("Upss! Jugador "+jugador2.getNombre()+", tiene una mano no jugable Perdio el juego, intentelo de nuevo");
                        condicion2 = true;
                        condicionfinal = false; // indica q el jugador 1 perdio
                      }
                 }    
                 while(!condicion2);
            }   
       }  
        
       if(condicionfinal== false)
       {
           System.out.println("Felicidades!! "+jugador1.getNombre() +" ha ganado el juego de Domino");
       }
       else
       {
           System.out.println("Felicidades!! "+jugador2.getNombre() +" ha ganado el juego de Domino");
       }   
       } 
    }  
}

