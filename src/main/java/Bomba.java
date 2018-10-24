public class Bomba
{
        private Integer tiempoDeDetonacion;

        public Bomba(Integer tiempo)
        {
            this.tiempoDeDetonacion = tiempo;
        }

    public void tick()
    {
        this.tiempoDeDetonacion = tiempoDeDetonacion-1;
    }

    public Boolean exploto()
    {
        return tiempoDeDetonacion==0;
    }
}
