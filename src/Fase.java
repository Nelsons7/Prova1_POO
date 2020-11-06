public class Fase {
    private int nivel;
    private String elemento;
    private String cidade;
    private boolean complete;

    public Fase(int nivel, String elemento, String cidade){
       this.nivel = 1;
       this.complete = false;
       this.elemento = "terra";
    }// metodos nao especificos
 
    public void bonusArena(){

        System.out.println("Aumenta a velocidade de ataque em 10% ");
    }
    public void bauLendario(){
        System.out.println("Você encontrou: ");
        System.out.println("Artefato gladiador");
        System.out.println("Elmo Fenix");
        System.out.println("Botas do Gargula");
    }

    public void fonteDeVida(){
        System.out.println("Recupera 18 de HP.");
    }
    public void concluido(){
        complete();
        System.out.println("Fase concluída!");
    }
    public void gameOver(){
        System.out.println("GAME OVER!");
    }

    // metodo privado
    private void complete(){
        complete = true;
    }
    
    // get
    public String getElemento(){
        return this.elemento;
    }
    public int getNivel() {
        return this.nivel;
    }
    public String getCidade(){
        return this.cidade;
    }
    //set
    public void SetNivel(int nivel) {
        this.nivel = nivel;
    }
    public void setElemento(String elemento){
        this.elemento = elemento;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
}
