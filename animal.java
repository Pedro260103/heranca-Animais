/**
 * animal
 */
public class animal {
    private String nome;
    private int idade;
    private String cor;

    public animal(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    public void andar(){
      System.out.println("andando");
    }
    public void comer(){
      System.out.println("comendo");
    }
    public void morder(){
      System.out.println("Mordendo");
    }
    public String ToString(){
      return "Nome: " + nome + "| idade: " + idade + "| cor: " + cor;
    }
}
