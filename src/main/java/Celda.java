public class Celda {

    protected int x;
    protected int y;
    protected EstadoCelda estado;

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


}
