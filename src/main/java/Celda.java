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

    public void explotar()
    {
        if (this.estado != EstadoCelda.PARED_ACERO)
        {
            this.estado = EstadoCelda.VACIA;
        }
    }
}
