
package numerosimpares;
import java.util.Scanner;

public class Numerosimpares {

    
    public static void main(String[] args) 
    {
     Scanner leer = new Scanner(System.in);
      int validar;
      
      do
      {
          try{
              validar = 0;
      int rango;
      long suma=0;
      
      System.out.println("Ingrese hasta que número desea analizar: ");
      rango = leer.nextInt();
      
      for(int i=1 ; i<=rango;i++)
      {
      if(i%2!=0)
      {
      suma = i +suma;
      }
      else
      {
      }
      }
      
      System.out.println("El resultado de la suma es: ");
      System.out.println(+suma);
          }catch (Exception e){System.out.println("El caracter ingresado no es valido "); validar = 1; leer.nextLine();}
      }while(validar !=0);
    }
    
}
