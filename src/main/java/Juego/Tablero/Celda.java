package Juego.Tablero;

import Boomberman.Bomba;
import Objetos.Objeto;
import Objetos.Vacio;

public class Celda {

    protected int x;
    protected int y;
    private Bomba bomba;
    private Objeto objeto;

    public Celda(int x , int y){
        this.x = x;
        this.y = y;
        objeto = new Vacio();
    }

    public EstadoCelda getEstado(){
        return objeto.estado();
    }

    public void ponerBomba(Bomba bomba)
    {
        setBomba(bomba);
    }

    public void setBomba(Bomba bombaActivada)
    {
        this.bomba = bombaActivada;
    }

    public void explotar()
    {
        this.objeto.explotar(this);
    }

    public void setObjeto(Objeto objeto) {
        this.objeto = objeto;
    }
}
