public class Juego {

    private Mapa mapa;
    private Bomberman bman;


    public Juego (Mapa m, Bomberman b){
        mapa = m;
        bman = b;

        mapa.setCelda(0, 0, EstadoCelda.BOMBERMAN);
        bman.setPosicionActual(new Posicion(0, 0));
    }

    public Bomberman getBman() {
        return bman;
    }

    public Mapa getMapa() {
        return mapa;
    }

    public Posicion getPosicionBomberman(){
        return bman.getPosicionActual();
    }

    public void moverBombermanNorte(){
        Posicion actual = bman.getPosicionActual();
        Posicion nueva = new Posicion(actual.x, actual.y+1);
        if(mapa.getCelda(nueva.x, nueva.y).getEstado() == EstadoCelda.VACIA){
            bman.setPosicionActual(nueva);
            mapa.setCelda(nueva.x, nueva.y, EstadoCelda.BOMBERMAN);
            mapa.setCelda(actual.x, actual.y, EstadoCelda.VACIA);
        }
        else{
            //TODO
        }

    }
}
