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

    public void setCelda(int x, int y, EstadoCelda e){
        celdas[x][y].setEstado(e);
    }
}
