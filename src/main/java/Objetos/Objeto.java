package Objetos;

import Boomberman.Bomberman;
import Juego.Tablero.Celda;
import Juego.Tablero.EstadoCelda;

public interface Objeto {
    public void explotar(Celda celda);
    public void moverA(Bomberman bomberman);
    public EstadoCelda estado();
}
