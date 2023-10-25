import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    Jogador jogador;

    @BeforeEach
    public void setUp() {
        jogador = new Jogador();
    }

    // Jogador Disponivel

    @Test
    public void deveConcovocarJogadorDisponivel(){
        jogador.setEstado(JogadorEstadoDiponivel.getInstance());
        assertTrue(jogador.convocado());
        assertEquals(jogador.getEstado(), JogadorEstadoConvocado.getInstance());
    }

    @Test
    public void deveLesionarJogadorDisponivel(){
        jogador.setEstado(JogadorEstadoDiponivel.getInstance());
        assertTrue(jogador.lesionado());
        assertEquals(jogador.getEstado(), JogadorEstadoLesionado.getInstance());
    }

    @Test
    public void deveSuspenderJogadorDisponivel(){
        jogador.setEstado(JogadorEstadoDiponivel.getInstance());
        assertTrue(jogador.suspenso());
        assertEquals(jogador.getEstado(), JogadorEstadoSuspenso.getInstance());
    }

    @Test
    public void deveVenderJogadorDisponivel(){
        jogador.setEstado(JogadorEstadoDiponivel.getInstance());
        assertTrue(jogador.vendido());
        assertEquals(jogador.getEstado(), JogadorEstadoVendido.getInstance());
    }

    @Test
    public void naoDeveDisponibilizarJogadorDisponivel(){
        jogador.setEstado(JogadorEstadoDiponivel.getInstance());
        assertFalse(jogador.disponivel());
    }

    // Jogador Convocado

    @Test
    public void naoDeveDisponibilizarJogadorConvocado(){
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertFalse(jogador.disponivel());
    }

    @Test
    public void naoDeveConvocarJogadorConvocado(){
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertFalse(jogador.convocado());
    }

    @Test
    public void naoDeveSuspenderJogadorConvocado(){
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertFalse(jogador.suspenso());
    }
    @Test
    public void deveVenderJogadorConvocado(){
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertTrue(jogador.vendido());
        assertEquals(jogador.getEstado(), JogadorEstadoVendido.getInstance());
    }

    @Test
    public void deveLesionarJogadorConvocado(){
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        assertTrue(jogador.lesionado());
        assertEquals(jogador.getEstado(), JogadorEstadoLesionado.getInstance());
    }

    // Jogador Lesionado

    @Test
    public void naoDeveLesionarJogadorLesionado(){
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertFalse(jogador.lesionado());
    }

    @Test
    public void naoDeveConvocarJogadorLesionado(){
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertFalse(jogador.convocado());
    }

    @Test
    public void naoDeveSuspenderJogadorLesionado(){
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertFalse(jogador.suspenso());
    }

    @Test
    public void deveVenderJogadorLesionado(){
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertTrue(jogador.vendido());
        assertEquals(jogador.getEstado(), JogadorEstadoVendido.getInstance());
    }

    @Test
    public void deveDisponibilizarJogadorLesionado(){
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertTrue(jogador.disponivel());
        assertEquals(jogador.getEstado(), JogadorEstadoDiponivel.getInstance());
    }

    // Jogador Suspenso

    @Test
    public void naoDeveSuspenderJogadorSuspenso(){
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertFalse(jogador.suspenso());
    }

    @Test
    public void deveVenderJogadorSuspenso(){
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertTrue(jogador.vendido());
        assertEquals(jogador.getEstado(), JogadorEstadoVendido.getInstance());
    }

    @Test
    public void deveDisponibilizarJogadorSuspenso(){
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertTrue(jogador.disponivel());
        assertEquals(jogador.getEstado(), JogadorEstadoDiponivel.getInstance());
    }

    @Test
    public void deveConvocarJogadorSuspenso(){
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertTrue(jogador.convocado());
        assertEquals(jogador.getEstado(), JogadorEstadoConvocado.getInstance());
    }

    @Test
    public void deveLesionarJogadorSuspenso(){
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertTrue(jogador.lesionado());
        assertEquals(jogador.getEstado(), JogadorEstadoLesionado.getInstance());
    }

    // Jogador Vendido

    @Test
    public void naoDeveVenderJogadorVendido(){
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        assertFalse(jogador.vendido());
    }

    @Test
    public void naoDeveDisponibilizarJogadorVendido(){
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        assertFalse(jogador.disponivel());
    }

    @Test
    public void naoDeveConvocarJogadorVendido(){
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        assertFalse(jogador.convocado());
    }
    @Test
    public void naoDeveLesionarJogadorVendido(){
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        assertFalse(jogador.lesionado());
    }

    @Test
    public void naoDeveSuspenderJogadorVendido(){
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        assertFalse(jogador.suspenso());
    }
}