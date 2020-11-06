public class Principal {
    public static void main(String[] args) {
        Personagem personagem = new Personagem("Masculino","DarkSouls", "Arqueiro");
        Inimigo inimigo = new Inimigo("Waterman", "humano", "Watercity");
        Fase fase = new Fase(1,"agua", "WaterCity");

        System.out.println(personagem.getNick());
        personagem.atacar();
        personagem.mostrarVida();

        inimigo.transformacao();
        fase.concluido();
        fase.bauLendario();
    }
    
}
