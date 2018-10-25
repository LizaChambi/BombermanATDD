package Juego;

import Boomberman.*;
import Juego.Tablero.*;

import java.util.ArrayList;
import java.util.List;


public class Juego {

    private Mapa mapa;
    private Bomberman bman;
    private List<Bomba> bombas;

    public Juego (Mapa m, Bomberman b){
        mapa = m;
        bman = b;
        mapa.setCelda(0, 0, EstadoCelda.BOMBERMAN);
        bman.setPosicionActual(new Posicion(0, 0));
        bombas = new ArrayList<Bomba>();
    }


    public Mapa getMapa() {
        return mapa;
    }

    //Se pueden agregar mas direcciones , estas alcanzan para los tests
    //Se podrian mejorar los mensajes en el refactor

    public void moverBombermanNorte(){
        Posicion actual = this.bman.getPosicionActual();
        Posicion nueva = new Posicion(actual.x, actual.y+1);
        this.efectoAlMoverse(actual, nueva);
    }

    public void moverBombermanEste(){
        Posicion actual = bman.getPosicionActual();
        Posicion nueva = new Posicion(actual.x+1, actual.y);
        this.efectoAlMoverse(actual, nueva);
    }

    public void efectoAlMoverse(Posicion actual, Posicion nueva) {
        if (mapa.getCelda(nueva.x, nueva.y).getEstado() == EstadoCelda.VACIA) {
            bman.setPosicionActual(nueva);
            mapa.setCelda(nueva.x, nueva.y, EstadoCelda.BOMBERMAN);
            mapa.setCelda(actual.x, actual.y, EstadoCelda.VACIA);
        }
        if (mapa.getCelda(nueva.x, nueva.y).getEstado() == EstadoCelda.ENEMIGO) {
            bman.setEstado(EstadoBomberman.DEAD);
        }

        //si la celda es una pared, no hace nada
    }

    public Bomberman getBomberman()
    {
        return this.bman;
    }

    public void tick()
    {
        this.bombas.forEach(bomba -> bomba.tick());
        this.bombas.forEach(bomba -> bomba.exploto(this.mapa));
    }

    public void agregarBomba(Integer ticks)
    {
        this.bombas.add(this.bman.ponerBomba(ticks));
    }
}
