
package productorconsumidor;

public class Consumidor extends Thread {
    
  private Buffer buffer;
  private int numero;
  public Consumidor(Buffer buffer, int numero) {
    this.buffer=buffer;
    this.numero=numero;
  }
  
  public void run(){
      
    char valor;
    for(int i=0; i<10; i++){
        valor=buffer.recoger(numero);
        System.out.println(i+ " Consumidor: "+ numero+ ", consumiendo :"+valor);
        try{
            sleep(20);
        }catch (InterruptedException e) { }
        
    }
  }
}
