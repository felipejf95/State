public class JogadorEstadoSuspenso extends JogadorEstado{

    private JogadorEstadoSuspenso() {};
    private static JogadorEstadoSuspenso instance = new JogadorEstadoSuspenso();
    public static JogadorEstadoSuspenso getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Suspenso";
    }
    public boolean convocado(Jogador jogador){
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        return true;
    }
    public boolean vendido(Jogador jogador){
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        return true;
    }

    public boolean lesionado(Jogador jogador){
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        return true;
    }

    public boolean disponivel(Jogador jogador){
        jogador.setEstado(JogadorEstadoDiponivel.getInstance());
        return true;
    }

}
