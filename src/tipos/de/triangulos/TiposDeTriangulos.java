/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tipos.de.triangulos;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class TiposDeTriangulos {

   //Método Scanner 
    private Scanner teclado;
    //Variables de tipo entero
    private int lado1, lado2, lado3;
    
    //Método que muestra los mensajes y obtiene los datos ingresados
    public void Inicializar(){
       teclado = new Scanner(System.in); 
       System.out.println("Medida del lado 1");
       lado1 = teclado.nextInt();
       System.out.println("Medida del lado 2");
       lado2 = teclado.nextInt();
       System.out.println("Medida del lado 3");
       lado3 = teclado.nextInt();
    }
    //Método que busca el lado mayor del triangulo
    public void LadoMayor(){
        System.out.println("Lado mayor");
        if (lado1>lado2 && lado1>lado3) {
            System.out.println(lado1);
        }else{
            if (lado2>lado3) {
                System.out.println(lado2);
            }else{
                System.out.println(lado3);
            }
        }
    }
    //Método que determina qué tipo de triangulo es 
    public void TipoTriangulo(){
        //Condiciones que determinan que tipos de triangulo es de acuerdo  a sus lados
        if (lado1==lado2 && lado1==lado3)
            System.out.println("El Triangulo es equilatero");
        if ((lado1==lado2 && lado1!=lado3)||(lado2==lado3 && lado2!=lado1)||(lado3==lado1 && lado3!=lado2)) 
            System.out.println("El Triangulo es isosceles");
        if(lado1!=lado2&&lado1!=lado3&&lado2!=lado3)
            System.out.println("El Triangulo es escaleno");
    }
    public static void main(String[] args) {
        //Mandamos a llamar a la clase Tipos de Triángulos
        TiposDeTriangulos triangulo = new TiposDeTriangulos();
        triangulo.Inicializar();
        triangulo.LadoMayor();
        triangulo.TipoTriangulo();
    }
    
}
