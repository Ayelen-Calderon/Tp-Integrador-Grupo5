package org.example;


import org.example.persistenciaDeDatos.archivo.ParticipanteArchivo;
import org.example.persistenciaDeDatos.archivo.RondaArchivo;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
        sacar dao
        calculo de puntaje tiene que tener en cuenta las rondas.. entrega 2
        calculo de puntaje es por persona

        main
        unalista de rondas cada ronado con sus partidos

        una lista de participante cada uno con su pronostico.

        hacer un metodo por fuera del main para comparar que pida como parametro un participante
        y las lista de las rondas y con eso calcular el puntaje de la persona sabiendo que si la persona acerto a todo
        tiene un punto mas..
        este metodo debe ser testeado.



        /
         */

      RondaArchivo estarategiaArchivo = new RondaArchivo();


      System.out.println( estarategiaArchivo.listarTodos().toString());
        System.out.println(estarategiaArchivo.listarTodos().get(0).getRonda());

        ParticipanteArchivo participanteArchivo = new ParticipanteArchivo();

        System.out.println(participanteArchivo.listarTodos().toString());






    }

}