public class Bomberman {

    private Posicion posicionActual;
    private EstadoBomberman estado;

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
}
