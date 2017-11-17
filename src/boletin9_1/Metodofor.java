
package boletin9_1;

import java.util.Scanner;


public class Metodofor {
    public void calcularNum(){
   int num,positivo,negativo,cero,cant,i;
    positivo=0;
    negativo=0;
    cero=0;
    Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca Cantidad de Numeros a Evaluar:");
    cant=sc.nextInt();
    for(i=1; i<=cant;i++)
    {
        System.out.println("Introduzca un Numero Entero:");
        num=sc.nextInt();
        if (num>0)
        {
            positivo++;
        }
        else
        if(num<0)
        {
            negativo++;
        }
        else
        cero++;
    }
 
        System.out.println("La Cantidad de Positivos Son: "+positivo);
        System.out.println("La Cantidad de Negativos Son: "+negativo);
        System.out.println("La Cantidad de Ceros Son: "+cero);
}
    
}

