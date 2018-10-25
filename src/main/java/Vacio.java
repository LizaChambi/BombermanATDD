public class Vacio implements Objeto {
    @Override
    public void explotar(Celda celda) {

    }

    @Override
    public void moverA(Bomberman bomberman) {
        bomberman.mover();
    }

    @Override
    public EstadoCelda estado() {
        return EstadoCelda.VACIA;
    }
}
