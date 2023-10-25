public class Jogador {

    String nome;
    String clube;
    JogadorEstado estado;

    public Jogador(){
        this.estado = JogadorEstadoDiponivel.getInstance();
    }

    public boolean disponivel(){
        return estado.disponivel(this);
    }

    public boolean lesionado(){
        return estado.lesionado(this);
    }

    public boolean convocado(){
        return estado.convocado(this);
    }

    public boolean suspenso(){
        return estado.suspenso(this);
    }

    public boolean vendido(){
        return estado.vendido(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public JogadorEstado getEstado() {
        return estado;
    }

    public void setEstado(JogadorEstado estado) {
        this.estado = estado;
    }
}
