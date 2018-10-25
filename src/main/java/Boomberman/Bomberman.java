package Boomberman;

import Juego.Tablero.Celda;
import Juego.Tablero.EstadoCelda;
import Juego.Tablero.Posicion;
import Objetos.Objeto;

public class Bomberman implements Objeto {

    private Posicion posicionActual; // Debería ser del tipo Juego.Tablero.Celda.
    private EstadoBomberman estado;

    // Esto debería retornar una Juego.Tablero.Celda.
    public Posicion getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Posicion posicion) {
        this.posicionActual = posicion;
    }

    public void setEstado(EstadoBomberman estado){
        this.estado = estado;
    }

    public EstadoBomberman getEstado(){
        return this.estado;
    }

    public Bomba ponerBomba(Integer duracionDeLaBomba)
    {
        return new Bomba(duracionDeLaBomba, this.posicionActual);
    }

    public void morir() {
        estado = EstadoBomberman.DEAD;
    }

    @Override
    public void explotar(Celda celda) {

    }

    @Override
    public void moverA(Bomberman bomberman) {

    }

    @Override
    public EstadoCelda estado() {
        return EstadoCelda.BOMBERMAN;
    }

    public void moverParedAcero() {
        // No se puede mover
    }

    public void moverParedMelamina() {
        // No se puede mover
    }

    public void mover(){
        // TODO modificar
    }
}
