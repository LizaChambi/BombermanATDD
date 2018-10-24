public class Bomberman {

    private Posicion posicionActual; // Debería ser del tipo Celda.
    private EstadoBomberman estado;

    // Esto debería retornar una Celda.
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

    public void ponerBomba(Integer duracionDeLaBomba, Mapa map)
    {
        map.getCelda(this.posicionActual.x, this.posicionActual.y).setEstado(EstadoCelda.BOMBA);
        map.getCelda(this.posicionActual.x, this.posicionActual.y).ponerBomba(new Bomba (duracionDeLaBomba));
    }
}
