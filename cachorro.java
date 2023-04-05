/**
 * cachorro
 */
public class cachorro extends animal {
  private String raca ;
  private int sede;
  private int contidadeDeVezesJogadas;

  public cachorro (String nome , int idade , String cor , String raca){
    super(nome,idade,cor);
    this.raca = raca;
    this.sede = sede;
    this.contidadeDeVezesJogadas = contidadeDeVezesJogadas;
  }

  public String ToString(){
      return "| raca: " + raca;
    }



  
  public void latir() {
        System.out.println(raca + " está latindo.");
    }

  public void buscarObjeto(Boolean Valor) {
    if(Valor == true){
      contidadeDeVezesJogadas = contidadeDeVezesJogadas + 1;
      System.out.println(raca + " está buscando um objeto da vez " + contidadeDeVezesJogadas);
      if(sede > 0){
      sede = sede - 1;
      System.out.println("A sede do " + raca + " está em " + sede + "/10");  
      }else{
        System.out.println("O " + raca + " está com cansado sua sede está em " + sede + "/10");
      }
      
    }else{
      System.out.println("não ha Bolinha na mochila");
        
    }
  }
  public void andar(){
    System.out.println(raca + " está andando");
  }




  
  public void mostrarSede(){
    System.out.println("A sede do " + raca + " está em " + sede + "/10");
  }

  public void beberAgua(Boolean Valor){
    if(Valor == true && sede < 10 && sede >= 0){

      System.out.println("Bebendo agua ....");
        
      sede = sede + 1;
      System.out.println("A sede do " + raca + " está em " + sede + "/10");
    }else{
      System.out.println("não ha agua na mochila");
    }
  }
  
  
}
