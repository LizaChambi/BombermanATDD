public class Celda {

    protected int x;
    protected int y;
    private EstadoCelda estado;
    private Bomba bomba;

    public Celda(int x , int y){
        this.x = x;
        this.y = y;
        estado = EstadoCelda.VACIA;
    }

    public EstadoCelda getEstado(){
        return estado;
    }

    public void setEstado(EstadoCelda e){
        this.estado = e;
    }

    public void ponerBomba(Bomba bomba)
    {
        setBomba(bomba);
    }

    public void setBomba(Bomba bombaActivada)
    {
        this.bomba = bombaActivada;
    }

    public void tick(Mapa map)
    {
        this.bomba.tick();
        if (this.bomba.exploto())
        {
            limpiarCeldas(map, this.x, this.y);
            setEstado(EstadoCelda.VACIA);
        }
    }

    private void limpiarCeldas(Mapa map, int x, int y)
    {
        map.getCelda(x+1, y).explotar();
        map.getCelda(x+2, y).explotar();
        map.getCelda(x+3, y).explotar();
        map.getCelda(x, y+1).explotar();
        map.getCelda(x, y+2).explotar();
        map.getCelda(x, y+3).explotar();
    }

    private void explotar()
    {
        this.estado = EstadoCelda.VACIA;
    }
}
