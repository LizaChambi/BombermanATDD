public class Enemigo implements Objeto {
    @Override
    public void explotar(Celda celda) {
        celda.setObjeto(new Vacio());
    }

    @Override
    public void moverA(Bomberman bomberman) {
        bomberman.morir();
    }

    @Override
    public EstadoCelda estado() {
        return EstadoCelda.ENEMIGO;
    }
}
