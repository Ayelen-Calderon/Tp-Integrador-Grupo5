package org.example;

import java.util.ArrayList;
import java.util.List;

public class Ronda {
    private int id;
    private List<Partido> rondaPartido;


    public Ronda(int id) {
        this.id = id;
        this.rondaPartido = rondaPartido = new ArrayList<>();
    }

    public int getId() {
        return id;
    }



    public List<Partido> getRondaPartido() {
        return rondaPartido;
    }

    public void setRondaPartido(List<Partido> rondaPartido) {
        this.rondaPartido = rondaPartido;
    }

    public void agregarPartido(Partido partido){
        rondaPartido.add(partido);
    }

    @Override
    public String toString() {
        return "Ronda{" +
                "id=" + id +
                ", rondaPartido=" + rondaPartido +
                '}';
    }
}
