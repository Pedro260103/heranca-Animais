import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int opicao = 0;
    boolean agua = false;
    boolean bolinha = false;
    String teste = "";
    Scanner ler = new Scanner(System.in);
    pessoa dono = new pessoa("Pedro",20,"11748983644");
    
    while(opicao != 1 && opicao != 2){
      System.out.println("guardou a agua? 1-Sim 2-Não");
      opicao = ler.nextInt();
      if(opicao == 1){
        agua = true;
      }else if(opicao == 2){
        agua = false;
      }
    }
    opicao = 0;
    
    while(opicao != 1 && opicao != 2){ 
      System.out.println("guardou a bolinha? 1-Sim 2-Não");
      opicao = ler.nextInt();
      if(opicao == 1){
        bolinha = true;
      }else if(opicao == 2){
        bolinha = false;
      } 
    }
    
    
    
    
    mochila mochila = new mochila(agua,bolinha);
    System.out.println(mochila.darAgua());
    System.out.println(mochila.jogarBolinha());
    

    
    animal animal = new animal("animal",5,"Preto");
    cachorro cachorro1 = new cachorro("Rex", 3, "Marrom", "Pastor Alemão");
    animal.andar();
    
    
        
    cachorro1.latir();
    
    cachorro1.beberAgua(mochila.darAgua());
    
    cachorro1.beberAgua(mochila.darAgua());
    
    cachorro1.beberAgua(mochila.darAgua());
    
    cachorro1.buscarObjeto(mochila.jogarBolinha());
    cachorro1.andar();
    cachorro1.beberAgua(mochila.darAgua());
    cachorro1.comer();

    System.out.println(cachorro1.ToString());
    System.out.println(mochila.ToString());
    System.out.println(animal.ToString());
  }
}
