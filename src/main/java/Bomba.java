public class Bomba
{
    private Integer tiempoDeDetonacion;
    private Posicion posicion;

    public Bomba(Integer tiempo, Posicion pos)
        {
            this.tiempoDeDetonacion = tiempo;
            this.posicion = pos;
        }

    public void tick()
    {
        this.tiempoDeDetonacion = tiempoDeDetonacion-1;
    }

    public void exploto(Mapa map)
    {
        if( tiempoDeDetonacion == 0)
        {
            map.limpiarCeldas(posicion);
        }
    }
}
