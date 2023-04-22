package org.example;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor
public class Equipo {

    private String nombre;

    @Override
    public String toString() {
        return
                nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

