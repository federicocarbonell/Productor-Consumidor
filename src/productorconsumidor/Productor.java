
package productorconsumidor;


public class Productor extends Thread{

  private Buffer buffer;
  private int numero;
  private final String letras="abcdefghijklmnopqrstuvxyz";
  
  public Productor(Buffer buffer,int numero) {
    this.buffer=buffer;
    this.numero=numero;
  }
  
  public void run() {
    for(int i=0; i<10; i++){
        char c=letras.charAt((int)(Math.random()*letras.length()));
        buffer.poner(c,numero);
        System.out.println(i+" Productor : " +numero + ", produciendo: "+ c);
        try {
            sleep(20);
        } catch (InterruptedException e) { }
    }
  }
}
