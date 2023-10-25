public class JogadorEstadoLesionado extends JogadorEstado{

    private JogadorEstadoLesionado() {};
    private static JogadorEstadoLesionado instace = new JogadorEstadoLesionado();
    public static  JogadorEstadoLesionado getInstance() {
        return instace;
    }
    public String getEstado(){
        return "Lesionado";
    }
    public boolean vendido(Jogador jogador){
        jogador.setEstado(JogadorEstadoVendido.getInstance());
        return true;
    }

    public boolean disponivel(Jogador jogador){
        jogador.setEstado(JogadorEstadoDiponivel.getInstance());
        return true;
    }
}
