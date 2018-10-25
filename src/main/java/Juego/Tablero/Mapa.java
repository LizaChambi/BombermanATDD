package Juego.Tablero;

import Objetos.Objeto;

import java.util.Hashtable;

public class Mapa {

    protected Celda[][] celdas;

    public Mapa(int cantidad){
        this.celdas = new Celda[cantidad][cantidad];
        for (int x= 0; x<cantidad; x++) {
            for(int y=0 ; y<cantidad; y++) {
                this.celdas[x][y]= new Celda(x,y);
            }
        }
    }

    public Celda getCelda(int x , int y){
        return celdas[x][y];
    }

    public void setCelda(int x, int y, Objeto e){
        celdas[x][y].setObjeto(e);
    }

    public void limpiarCeldas(Posicion posicion)
    {
        Integer x = posicion.getX();
        Integer y = posicion.getY();
        getCelda(x+1, y).explotar();
        getCelda(x+2, y).explotar();
        getCelda(x+3, y).explotar();
        getCelda(x, y+1).explotar();
        getCelda(x, y+2).explotar();
        getCelda(x, y+3).explotar();
    }
}
