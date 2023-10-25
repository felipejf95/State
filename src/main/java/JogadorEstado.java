public abstract class JogadorEstado {

    public abstract String getEstado();

    public boolean disponivel(Jogador jogador){
        return false;
    }

    public boolean lesionado(Jogador jogador){
        return false;
    }

    public boolean convocado(Jogador jogador){
        return false;
    }

    public boolean suspenso(Jogador jogador){
        return false;
    }

    public boolean vendido(Jogador jogador){
        return false;
    }
}
