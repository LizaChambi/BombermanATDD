import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BombermanTest {

    Bomberman bman = new Bomberman();
    Mapa mapa = new Mapa(5); //cuadrado de 5 x 5 , celdas vacias, salvo la (0,0), ocupada por bman
    Juego juego = new Juego(mapa, bman);

    //Bomberman siempre empieza en la posicion x=0, y=0

    @Test
    public void bombermanSeMueveALaCeldaNorteLaCualEstaVaciaYCambiaSuPosicion() {

        assertEquals(juego.getMapa().getCelda(0, 0).getEstado(),EstadoCelda.BOMBERMAN);
        assertEquals(juego.getMapa().getCelda(0,1).getEstado(), EstadoCelda.VACIA);

        juego.moverBombermanNorte();

        assertEquals(juego.getMapa().getCelda(0,0).getEstado(), EstadoCelda.VACIA);
        assertEquals(juego.getMapa().getCelda(0,1).getEstado(), EstadoCelda.BOMBERMAN);
    }

    @Test
    public void bombermanSeMueveALaCeldaEsteLaCualEstaOcupadaYSeQuedaDondeEsta(){
        assertEquals(juego.getMapa().getCelda(0, 0).getEstado(),EstadoCelda.BOMBERMAN);
        juego.getMapa().setCelda(1,0,EstadoCelda.PARED_MELAMINA);
        assertEquals(juego.getMapa().getCelda(1,0).getEstado(), EstadoCelda.PARED_MELAMINA);

        juego.moverBombermanEste();

        assertEquals(juego.getMapa().getCelda(0,0).getEstado(), EstadoCelda.BOMBERMAN);

    }

    @Test
    public void bombermanSeMueveALaCeldaNoresteLaCualEstaOcupadaPorUnEnemigoYMuere(){
        assertEquals(juego.getMapa().getCelda(0, 0).getEstado(),EstadoCelda.BOMBERMAN);
        juego.getMapa().setCelda(1,1,EstadoCelda.ENEMIGO);
        assertEquals(juego.getMapa().getCelda(1,1).getEstado(), EstadoCelda.ENEMIGO);

        juego.moverBombermanNorte();
        juego.moverBombermanEste();

        assertEquals(juego.getMapa().getCelda(0,0).getEstado(), EstadoCelda.VACIA);
        assertEquals(bman.getEstado(), EstadoBomberman.DEAD);
    }

    @Test
    public void bombermanSueltaUnaBombaDondeSeEncuentraYLuegoDe1SegundosRompeTodasLasParedesDeMelaminaAUnRaddioDe3Casilleros()
    {
        assertEquals (juego.getMapa().getCelda(0, 0).getEstado(), EstadoCelda.BOMBERMAN);
        juego.getMapa().setCelda(1,0,EstadoCelda.PARED_MELAMINA);
        juego.getMapa().setCelda(2,0,EstadoCelda.PARED_MELAMINA);
        juego.getMapa().setCelda(3,0,EstadoCelda.PARED_MELAMINA);
        juego.getMapa().setCelda(4,0,EstadoCelda.PARED_MELAMINA);
        juego.agregarBomba(1);
        juego.tick();
        assertEquals(juego.getMapa().getCelda(1, 0).getEstado(), EstadoCelda.VACIA);
        assertEquals(juego.getMapa().getCelda(2, 0).getEstado(), EstadoCelda.VACIA);
        assertEquals(juego.getMapa().getCelda(3, 0).getEstado(), EstadoCelda.VACIA);
        assertEquals(juego.getMapa().getCelda(4, 0).getEstado(), EstadoCelda.PARED_MELAMINA);
    }

}