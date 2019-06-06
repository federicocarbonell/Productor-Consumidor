
package productorconsumidor;

import java.io.Console;
import java.util.Scanner;


public class ProductorConsumidor {

    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Buffer b=new Buffer();
    System.out.println("Ingrese cuantos productores quiere crear");
    String x = teclado.nextLine();
    int cons = Integer.parseInt(x);
    for (int i = 0; i < cons; i++) {
        Consumidor consumidor = new Consumidor(b,i);
        consumidor.start();
    }
    System.out.println("Ingrese cuantos consumidores quiere crear");
    String z = teclado.nextLine();
    int prod= Integer.parseInt(z);
    for (int i = 0; i < prod; i++) {
        Productor productor = new Productor(b,i);
        productor.start();
    }
    

    try  {
//espera la pulsación de una tecla y luego RETORNO
        System.in.read();
    }catch (Exception e) {  }
  }
}
