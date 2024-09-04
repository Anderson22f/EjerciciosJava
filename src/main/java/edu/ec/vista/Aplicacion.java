/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ec.vista;

/**
 *
 * @author ANDERSON
 */
public class Aplicacion {
    public class Aplicacion {
    public class Aplicacion {
    public static void main (String[]args){
        int [] arreglo = new int [5];
        for (int i = 0; i < arreglo.length; i++ ) {
            arreglo [i] = i * 2; 
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento " + i + ": " + arreglo [i]);
        }
    }
    
}

public class SumaNumeros{
    public static void main (String[] args) {
        int num1 = Integer.parseINT(JOptionPane.showInputDialog("Ingrese el primer numero:"));
        int num2 = Integer.parseINT(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
        System.out.println("La suma es: " +suma);
    }
    
  
}

public class Metodo{
    public static void main (String[] arg){
        saludar ("Juan");
    }
    public static void saludar (String nombre ){
        System.out.println("Bienvenido, " + nombre + "!");
    }
}

public class Persona {
    private String nombre;
    private final int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void saludar () {
        System.out.println("Bienvenido, mi nombre es " + nombre + " y tengo " + edad + " años. ");
    }
    
    public static void main (String[] arg) {
        Persona persona = new Persona ("Juan", 25);
        persona.saludar();
    } 
}

public class BucleWhile {
    public static void main (String[] args){
        int i=1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }
}

public class BucleForEach {
    public static void main (String [] args) {
        String[] arreglo = { "Juan", "Pedro", "Luis", "Carlos", "Ana"};
        for (String elemento : arreglo) {
            System.out.println(elemento);
        }
        
    }
}


public class Exepcion {
    public static void main (String[] args) {
        try {
            int resultado = 10/0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: no se puede dividir entre ceros");
        }
    }
}

public class AdivinaElNumero {
    public static void main (String[] args) {
        //Genera un numero aleatorio entre 1 y 100 
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        
        //Crea un objeto Scaner para leer la entrada del usuario 
        Scaner scaner = new Scaner (System.in);
        
        //Variable para almacenar el numero de intentos 
        int intentos = 0;
        
        //Bucle para pedirle al usuario que adivine el numero 
        while (true) {
            System.out.println("Adivina el numero(entre 1 a 100): ");
            int numeroUsuario = scanner.nexInt();
            
            //Incrementa el numero de intentos 
            intentos++;
            
            //Comparar el numero del usuario con el numero secreto 
            if (numeroUsuario = numeroSecreto) {
                System.out.println("¡Felicidades! has adivinado el numero en " + intentos + "intento.");
                breack;
            } else if (numeroUsuario < numeroSecreto) {
                System.out.println("El numero que has introducido es demasidado bajo. Prueba denuevo.");
            } else {
                System.out.println("El numero que has introducido es demaciado alto. Prueba denuevo. ");
        
               
            }
        }
    }
    
    }

   

public class main {
        public static void main (String [] args) {
            double a,r; //area y radio 
            
            System.out.println("Introduce el radio de un circulo: ");
            r=Entrada.real();
            
            a=Math.PI*(r*r); // para elevar al cuadrado otra opcion es: Math.pow (r, 2)
            
            System.out.println("El area de una circuferencia de radio " + r+ " es: " + a);
        }
}


public class Main {
    public static void main(String[] args) {
        int n1,n2;

        System.out.print("Introduce un número: ");
        n1=Entrada.entero();
        System.out.print("Introduce otro número: ");
        n2=Entrada.entero();

        if(n1==n2)
            System.out.println("Son iguales");
        else
            System.out.println("No son iguales");

    }
}


public class Main {
    public static void main(String[] args) {
        int num;
        
        System.out.print("Introduce un número: ");
        num=Entrada.entero();

        if( num < 0)
            System.out.println("Negativo");
        else
            // suponemos que el 0 es positivo.
            System.out.println("Positivo");
    }

}


public class Main {
    public static void main(String[] args) {
        int n1,n2;
        
        System.out.print("Introduce un número: ");
        n1=Entrada.entero();
        
        System.out.print("Introduce otro número: ");
        n2=Entrada.entero();
        
        if(n1%n2==0)
            System.out.println("Son múltiplos");
        else
            System.out.println("No son múltiplos");
    }
}


public class Main {
    public static void main(String[] args) {
        int n1,n2;
        
        System.out.print("Introduce un número: ");
        n1=Entrada.entero();
        System.out.print("Introduce otro número: ");
        n2=Entrada.entero();
        
        // si ambos números son iguales diría que n2 es mayor que n1
        if(n1>n2)
            System.out.println(n1 + " es mayor que " + n2);
        else
            System.out.println(n2 + " es mayor que " + n1);
    }
}


public class Main {
    public static void main(String[] args) {
        int a,b,c;
        System.out.print("Introduzca primer número: ");
        a=Entrada.entero();
        System.out.print("Introduzca segundo número: ");
        b=Entrada.entero();
        System.out.print("Introduzca tercer número: ");
        c=Entrada.entero();
        
        if(a>b && b>c)
            System.out.println( a+", "+b+", "+c);
        else
            if(a>c && c>b)
                System.out.println(a+", "+c+", "+b);
            else{
                if(b>a && a>c)
                    System.out.println(b+", "+a+", "+c);
                else{
                    if(b>c && c>a)
                        System.out.println(b+", "+c+", "+a);
                    else { 
                        if(c>a && a>b)
                            System.out.println(c+", "+a+", "+b);
                        else {
                            if(c>b && b>a)
                                System.out.println(c+", "+b+", "+a);
                        }

                    }
                }
            } 

            
    }
}


public class Main {
    public static void main(String[] args) {
        int num;
        int dm, um, c, d, u;
        
        // 9 9 . 9 9 9 a cada guarismo lo llamaremos:
        //dm um c d u: dm (decenas de millar), um:(unidades de millar)
        //             c: (centenas), d: (decenas), u: (unidades)
        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num=Entrada.entero();
        
        // unidad
        u = num % 10;
        num = num / 10;
        
        // decenas
        d = num % 10;
        num = num / 10;
        
        // centenas
        c = num % 10;
        num = num / 10;
        
        // unidades de millar
        um = num % 10;
        num = num / 10;
        
        // decenas de millar
        dm = num;
        
        // lo imprimimos al revés:
        System.out.println (u + " " + d + " " + c + " " + um + " " + dm);
        
        // otra forma de hacerlo es
        num = 10000*u + 1000*d + 100*c + 10*um + dm;
        System.out.println (num);
    }

}


public class Main {
    public static void main(String[] args) {
        int nota;

        System.out.print("Introduzca una nota: ");
        nota=Entrada.entero();
        
        // tanto los if's como los else's encierran a una sola instrucción
        // y no es necesario utilizar llaves { }
        
        if(nota>=0 && nota<5)
            System.out.println("INSUFICIENTE");
        else
            if(nota==5)
                System.out.println("SUFICIENTE");
            else 
                if(nota==6)
                    System.out.println("BIEN");
                else
                    if(nota==7 || nota==8)
                        System.out.println("NOTABLE");
                    else
                        if(nota==9 || nota==10 )
                            System.out.println("SOBRESALIENTE");
       
    }
}


public class Main {
    
    public static void main(String[] args) {
        int dia,mes,año;
        
        // para que una fecha sea correcta se tiene que cumplir
        // día en el rango 1..30
        // mes en el rango 1..12
        // año cualquiera distinto del 0

        System.out.print("Introduzca día: ");
        dia=Entrada.entero();
        System.out.print("Introduzca mes: ");
        mes=Entrada.entero();
        System.out.print("Introduzca año: ");
        año=Entrada.entero();
        
        if (dia >= 1 && dia <=30)
            if (mes >= 1 && mes <= 12)
                if (año != 0)
                    System.out.println ("Fecha correcta");
                else 
                    System.out.println ("Año incorrecto");
            else
                System.out.println("Mes incorrecto");
        else
            System.out.println("Día incorrecto");
       
    }
}

public class Main {
    public static void main(String[] args) {
        int dia1,mes1,año1;
        int dia2,mes2,año2;
        int total_dias;
        
        System.out.println ("Fecha 1:");
        System.out.print("Introduzca día: ");
        dia1=Entrada.entero();
        System.out.print("Introduzca mes: ");
        mes1=Entrada.entero();
        System.out.print("Introduzca año: ");
        año1=Entrada.entero();

        System.out.println ("Fecha 2:");
        System.out.print("Introduzca día: ");
        dia2=Entrada.entero();
        System.out.print("Introduzca mes: ");
        mes2=Entrada.entero();
        System.out.print("Introduzca año: ");
        año2=Entrada.entero();
        
        // suponemos que las fecha introducidas son correctas
        
        // convertimos las dos fechas a días y calculamos la diferencia
        total_dias = dia2-dia1 + 30*(mes2-mes1)+365*(año2-año1);

        System.out.println ("Días de diferencia: " + total_dias);
    }
}


public class Main {
    
    public static void main(String[] args) {
        int num,cuadrado;
        // num guardará el número que leamos
        // y cuadrado guardará el cuadrado de num
        
        System.out.print("Introduzca número: ");
        num=Entrada.entero();
        
        while(num>=0){ // repetimos el proceso mientras el número leído no sea negativo
            cuadrado=num*num;
            System.out.println(num+ "² es igual a "+ cuadrado);
            System.out.print("Introduzca otro número: ");
            num=Entrada.entero(); // volvemos a leer num

        }
    }
}


public class Main {
    public static void main(String[] args) {
        int num;
        System.out.print("Introduzca un número: ");
        num=Entrada.entero();
        
        while(num!=0) // mientras num sea distinto de 0
        {
            if(num>0)
                // mayor que cero: positivo
                System.out.println("Positivo");
            else
                // si no es positivo: es negativo
                System.out.println("Negativo");
            
            // repetimos el proceso y volvemos a leer num
            System.out.print("Introduzca otro número: ");
            num=Entrada.entero();
        }
        // al salir del mientras tenemos la certeza que num es 0

        }    
        
    }


    
}

    
}
