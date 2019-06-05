package productorconsumidor;
import java.util.concurrent.Semaphore;

public class Buffer {
    
  private char contenido;
  private boolean disponible=false;
  public Buffer() {
  }
/*  public char recoger(){
    if(disponible){
        disponible=false;
        return contenido;
    }
    return ('\t');
  }
  public void poner(char c){
    contenido=c;
    disponible=true;
  }     */

  public synchronized char recoger(int numero){
    while(!disponible){
        try{
            wait();
            System.out.println("Consumidor: "+ numero + " esperando");
        }catch(InterruptedException ex){}
    }
    disponible=false;
    notify();
    return contenido;
  }
  public synchronized void poner(char valor, int numero){
     while(disponible){
        try{
            wait();
            System.out.println("Productor: "+ numero + " esperando");
        }catch(InterruptedException ex){}
    }
    contenido=valor;
    disponible=true;
    notify();
  }
}

