package Objetos;

import Boomberman.Bomberman;
import Juego.Tablero.Celda;
import Juego.Tablero.EstadoCelda;


public class ParedMelamina implements Objeto {
    @Override
    public void explotar(Celda celda) {
        celda.setObjeto(new Vacio());
    }

    @Override
    public void moverA(Bomberman bomberman) {
        bomberman.moverParedMelamina();
    }

    @Override
    public EstadoCelda estado() {
        return EstadoCelda.PARED_MELAMINA;
    }
}
