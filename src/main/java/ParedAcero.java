public class ParedAcero implements Objeto{
    @Override
    public void explotar(Celda celda) {
        celda.setObjeto(new Vacio());
    }

    @Override
    public void moverA(Bomberman bomberman) {
        bomberman.moverParedAcero();
    }

    @Override
    public EstadoCelda estado() {
        return EstadoCelda.PARED_ACERO;
    }
}
