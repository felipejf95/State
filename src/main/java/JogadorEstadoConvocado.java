public class JogadorEstadoConvocado extends JogadorEstado {

    private JogadorEstadoConvocado() {};
    private static JogadorEstadoConvocado instance = new JogadorEstadoConvocado();
    public static JogadorEstadoConvocado getInstance(){
        return instance;
    }
    public String getEstado(){
        return "Convocado";
    }
    public boolean lesionado(Jogador jogador){
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        return true;
    }

    public boolean vendido(Jogador jogador){
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        return true;
    }
}
