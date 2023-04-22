package org.example;

import lombok.Data;

@Data
public class Partido {

    private Equipo equipo1 , equipo2;
    private int golesEquipo1 , golesEquipo2;
    private Resultado resultado;
    private int idPartido ;
    private static int contador = 0;

    public Partido(Equipo equipo1, Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        idPartido = ++contador;
    }

    public Resultado resultadoPartido(){

        if(golesEquipo1 == golesEquipo2){
            resultado = Resultado.EMPATE;
        }
        else if(golesEquipo1 > golesEquipo2){
            resultado = Resultado.GANADOR_EQUIPO1;
        }
        else resultado = Resultado.GANADOR_EQUIPO2;

        return resultado;
    };

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    @Override
    public String toString() {
        return  "Partido "+ idPartido +
                ": equipo1: " + equipo1 +
                " " + golesEquipo1 +
                " - equipo2: " + equipo2 +
                "  " + golesEquipo2 +
                " resultado: " + resultado +
                '\n';
    }
}
