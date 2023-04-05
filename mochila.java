public class mochila {
  private boolean agua;
  private boolean bolinha;

  public mochila(boolean agua , boolean bolinha){
    this.agua = agua;
    this.bolinha = bolinha;
  }
  public String ToString(){
      return "bolina: " + bolinha + "| agua: " + agua;
    }

  public boolean jogarBolinha(){
    if(bolinha == true){
      return true;
    }else{
      return false;
    }
  }
  public boolean darAgua(){
    if(agua == true){
      return true;
    }else{
      return false;
    }
  }

  

  
}
