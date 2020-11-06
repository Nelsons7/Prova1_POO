public class Personagem {

    private String genero;
    private String nickname;
    private String classe_pers;
    private int vida;

    public Personagem(String genero, String nickname, String classe_pers){
       this.genero = genero;
       this.nickname = nickname;
       this.classe_pers = classe_pers;
    }
    // metodos nao especificos

    public void atacar(){
        vida();
        System.out.println("atacando");
    }
    public void pular(){
        System.out.println("pulando");
    }
    public void deslisar(){
        System.out.println("deslisando");
    }
    public void mostrarVida(){
        System.out.println(nickname + " causa " + vida + " pontos de vida ao inimigo!");
    }
    // metodo privado
    private void vida(){
        vida -= 10;
    }
    
    // get
    public String getNick(){
        return this.nickname;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getClase(){
        return this.classe_pers;
    }
    //set
    public void SetNick(String nickname){
        this.nickname = nickname;
    }
    public void setGenero(String genero){
        this.genero = classe_pers;
    }
    public void setClase(String classe){
        this.classe_pers = classe;
    }
}
