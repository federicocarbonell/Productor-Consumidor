
package productorconsumidor;


public class ProductorConsumidor {

    public static void main(String[] args) {
    Buffer b=new Buffer();

    Productor p1 = new Productor(b,1);
    Consumidor c1 = new Consumidor(b,1);
    Consumidor c3 = new Consumidor(b,3);
    Productor p3 = new Productor(b,3);
    Productor p2 = new Productor(b,2);
    Consumidor c2 = new Consumidor(b,2);
    
    p1.start();
    c1.start();
    c3.start();
    p3.start();
    p2.start();
    c2.start();


    try  {
//espera la pulsación de una tecla y luego RETORNO
        System.in.read();
    }catch (Exception e) {  }
  }
}
