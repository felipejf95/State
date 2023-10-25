public class JogadorEstadoDiponivel extends JogadorEstado{

    private JogadorEstadoDiponivel() {};
    private static JogadorEstadoDiponivel instance = new JogadorEstadoDiponivel();
    public static JogadorEstadoDiponivel getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Disponivel";
    }

    public boolean lesionado(Jogador jogador){
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        return true;
    }

    public boolean convocado(Jogador jogador){
        jogador.setEstado(JogadorEstadoConvocado.getInstance());
        return true;
    }

    public boolean suspenso(Jogador jogador){
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        return true;
    }

    public boolean vendido(Jogador jogador){
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        return true;
    }
}
