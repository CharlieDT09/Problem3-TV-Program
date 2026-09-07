import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main
{
    public static void main(String[] args)
    {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        try
        {
            System.out.print("Ingrese la cantidad de dias: ");
            int dias = Integer.parseInt(br.readLine());
            System.out.print("Ingrese la cantidad de episodios: ");
            int episodios = Integer.parseInt(br.readLine());
            int resultado = episodios / dias;
            System.out.println("Episodios por día: " + resultado);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre cero.");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: debe ingresar números enteros.");
        }
        catch (Exception e) {
            System.out.println("Error general.");
        }
    }
}