public class Inimigo {

    
    private String nome;
    private String tipo;
    private int vidaInimigo;
    private String local;
    private int vida;

    public Inimigo(String nome, String tipo, String local){
        this.nome = nome;
        this.tipo = "Ogre";
        this.local = "Westland";
        this.vidaInimigo = 100;
     }
     // metodos nao especificos
 
     public void atacar(){
         vida();
         System.out.println("atacando");
     }
     public void esquiva(){
         System.out.println("Esquivou de um ataque");
     }
     public void transformacao(){
         vidaInimigo();
         System.out.println("O Inimigo aumenta o seu poder");
         System.out.println("A vida do " + nome + " aumentou para " + vidaInimigo);
     }
     public void mostrarVida(){
         System.out.println(nome + " causa " + vida + " pontos de vida ao personagem!");
     }
     // metodo privado
     private void vida(){
         vida -= 10;
     }
     private void vidaInimigo(){
        vidaInimigo += 25;
     }
     
     // get
     public String getNome(){
         return this.nome;
     }
     public String getTipo(){
         return this.tipo;
     }
     public String getLocal(){
         return this.local;
     }
     //set
     public void SetNome(String nome){
         this.nome = nome;
     }
     public void setGenero(String tipo){
         this.tipo = tipo;
     }
     public void setLocal(String local){
         this.local = local;
     }
}
