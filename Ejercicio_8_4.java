/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_8_4;

import ejercicio_8_4.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author maylenhaagrosbaco
 */
public class Ejercicio_8_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto, tendremos una clase Pelicula con el titulo, director y duración
        de la película (en horas). Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo que se pide a continuación:
        En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.
        Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
        Después de ese bucle realizaremos las siguientes acciones:
        • Mostrar en pantalla todas las películas.
        • Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
        • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
        • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
        • Ordenar las películas por titulo, alfabéticamente y mostrarlo en pantalla.
        • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
         */

        Scanner leer = new Scanner(System.in);
        
        //En el main deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos y guardándolos en el objeto Pelicula.
        int aux = 0;

        ArrayList<Pelicula> peliculasArrayList = new ArrayList();

        do {
            Pelicula Pelicula = new Pelicula();

            System.out.println("Ingrese el título de la película");
            Pelicula.setTitulo(leer.next());
            System.out.println("");

            System.out.println("Ingrese el director de la película");
            Pelicula.setDirector(leer.next());
            System.out.println("");

            System.out.println("Ingrese la duración de la película");
            Pelicula.setDuracion(leer.nextDouble());
            System.out.println("");

            //Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
            peliculasArrayList.add(Pelicula);

            System.out.println("¿Desea ingresar otra película? Presione s (si) o n (no)");
            String resp = leer.next();

            if (resp.equals("s")) {
                aux = 0;
            } else if (resp.equals("n")) {
                aux = 1;
            }

        } while (aux == 0);

        //• Mostrar en pantalla todas las películas.
        System.out.println(peliculasArrayList);
        
    

        

    }

}
