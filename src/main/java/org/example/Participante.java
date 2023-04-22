package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Participante {
    private  String nombre;
    private int puntos ;
    private List<Pronostico> pronosticoParticipante;
    private int cantAciertos;

    public Participante(String nombre) {
        this.nombre = nombre;
        this.puntos =0;
        pronosticoParticipante = new ArrayList<>();
        this.cantAciertos = 0;
    }


    public String getNombre() {
        return nombre;
    }

    public void puntosYCantitadDeAciertos(){
        for (Pronostico p : pronosticoParticipante){
            puntos += p.puntos();
            cantAciertos += p.cantAciertos();
        }
    }

    public List<Pronostico> getPronosticoParticipante() {
        return pronosticoParticipante;
    }

    public void setPronosticoParticipante(Pronostico pronosticoParticipante) {
        this.pronosticoParticipante.add(pronosticoParticipante);
    }





    public boolean acertoTodo (){
        boolean acierto = false;
        if(pronosticoParticipante.size() == cantAciertos){
            acierto = true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\n"+"Participante " +
                "Nombre: " + nombre + '\n' +
                " puntos: " + puntos + '\n' +
                " Cantidad De Aciertos: " + cantAciertos + '\n' +
        " Cantitad De Apuestas :" + pronosticoParticipante.size()
                +"\n";
    }
}
