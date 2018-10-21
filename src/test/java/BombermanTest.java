import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BombermanTest {

    Bomberman bman = new Bomberman();
    Mapa mapa = new Mapa(2); //cuadrado de 2 x 2
    Juego juego = new Juego(mapa, bman);

    @Test
    public void bombermanSeMueveALaCeldaNorteLaCualEstaVaciaYCambiaSuPosicion() {

        assertEquals(juego.getMapa().getCelda(0, 0).getEstado(),EstadoCelda.BOMBERMAN);
        assertEquals(juego.getMapa().getCelda(0,1).getEstado(), EstadoCelda.VACIA);

        juego.moverBombermanNorte();

        assertEquals(juego.getMapa().getCelda(0,0).getEstado(), EstadoCelda.VACIA);
        assertEquals(juego.getMapa().getCelda(0,1).getEstado(), EstadoCelda.BOMBERMAN);
    }

}