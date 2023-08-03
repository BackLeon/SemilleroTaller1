import java.security.SecureRandom;
import java.util.*;

public class Metodos {
    
    //1.	Realiza un programa que solicite al usuario dos
    // números enteros y muestre su suma, resta, multiplicación y división.

    public void ejercicio1(){

        Scanner numero1 = new Scanner(System.in);

        System.out.println("Se haran las siguientes operaciones con los numeros que ingresara; suma, resta, multiplicacion y division.");
        System.out.println("porfavor ingrese el primer numero entero: ");
          
        int num1 = Integer.parseInt(numero1.nextLine());
        
        System.out.println("porfavor ingrese el segundo numero entero: ");
          
        int num2 = Integer.parseInt(numero1.nextLine());

        Map<String, Integer> operaciones = new HashMap<>();
        operaciones.put("suma", num1+num2 );
        operaciones.put("resta", num1-num2);
        operaciones.put("multiplicacion", num1*num2);
        operaciones.put("division", num1/num2);

        for (Map.Entry<String, Integer> entry: operaciones.entrySet()) {

            System.out.println("El valor de la " + entry.getKey() + " es " + entry.getValue());

        }
    }

    // 2.	Escribe un programa que pida al usuario un número entero y determine si es par o impar.
    public void ejercicio2(){

        Scanner numero1 = new Scanner(System.in);
        System.out.println("porfavor ingrese un entero y te dire si es par o impar: ");      
        int num1 = Integer.parseInt(numero1.nextLine());

        if(num1 % 2 == 0){

            System.out.println("El numero " + num1 + " es par");
        }else{
            System.out.println("El numero " + num1 + " es impar");
        }
    }

    //3.	Crea un programa que calcule y muestre el área
    // y el perímetro de un círculo. El usuario debe proporcionar el radio del círculo.

    public void ejercicio3(){

        Scanner numero1 = new Scanner(System.in);
        System.out.println("Calcularemos el area y pemitro de un circulo, para eso, debes darme el valor del radio de circulo: ");
        int num1 = Integer.parseInt(numero1.nextLine());

        double pi = Math.round(Math.PI * 10000.0) / 10000.0;
        int cuadrado = num1 * num1;
        double area = pi * cuadrado;    
        double perimetro = 2 * pi * num1;
        System.out.println("El area del cuadrado es " + area + "cm2 y su perimetro es " + perimetro + "cm");
    }

    //4.	Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.
    public void ejercicio4(){

        Scanner numero1 = new Scanner(System.in);
        System.out.println("Porfavor ingresa tu edad: ");
        int num1 = Integer.parseInt(numero1.nextLine());

        if(num1 >= 18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }

    }
    //5.	Realiza un programa que solicite al usuario 
    //dos números enteros y determine cuál es el mayor de ellos.
    public void ejercicio5(){

        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingresa dos numeros enteros y determinare cual es el mayor de ellos");
        System.out.println("Ingresa el primer numero: ");
        int num1 = Integer.parseInt(numero1.nextLine());

        System.out.println("Ingresa el segundo numero: ");
        int num2 = Integer.parseInt(numero1.nextLine());
    
        System.out.println("El numero mayor es " + Math.max(num1, num2));
    }

    //6.	Escribe un programa que pida al usuario
    // un número y verifique si es positivo, negativo o cero.

    public void ejercicio6(){

        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingresa un numero y verificare si es positivo, negativo o cero");
        System.out.println("Ingresa el numero: ");
        int num1 = Integer.parseInt(numero1.nextLine());

        if(num1 < 0){

            System.out.println("Tu numero " + num1 + " es negativo");
        }else if(num1 > 0){
            System.out.println("Tu numero " + num1 + " es positivo");
        }else{
            System.out.println("Tu numero " + num1 + " es cero");
        }

    }
    //7.	Crea un programa que pida al usuario
    // un número entero positivo y muestre su tabla de multiplicar hasta el 10.

    public void ejercicio7(){

        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingresa un numero y veras su tabla de multiplicar hasta el 10");
        System.out.println("Ingresa el numero: ");
        int num1 = Integer.parseInt(numero1.nextLine());
        System.out.println("La tabla de multiplicar de " + num1 + " es: ");
        for(int iterador = 1; iterador < 11; iterador++){

            System.out.println(num1 + " * " + iterador + " = " + num1*iterador);

        }
    }
    //8.	Realiza un programa que simule un juego de adivinar un número.
    // El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo.
    // El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar.
    public void ejercicio8(){

        Random numero = new Random();
        int numeroRandom = numero.nextInt(101);
        System.out.println("He pensado en un numero random entre el 1 y el 100, debes de adivinarlo, no tienes limite de intentos, buena suerte");
        Scanner numero1 = new Scanner(System.in);

        boolean continuar = true;
        while(continuar){
            System.out.println("Escribe tu numero: ");
            int tuNumero = Integer.parseInt(numero1.nextLine());
            if(numeroRandom == 0){

                numeroRandom++;
                if(tuNumero > numeroRandom){

                    System.out.println("Tu numero es mayor al que he pensado, intenta de nuevo");

                }else if(tuNumero < numeroRandom){
                    System.out.println("Tu numero es menor al que he pensado, intentalo de nuevo");
                }else{
                    System.out.println("Felicidades, adivinaste el numero " + numeroRandom);
                    continuar = false;
                }
            }else{
                if(tuNumero > numeroRandom){

                    System.out.println("Tu numero es mayor al que he pensado, intenta de nuevo");

                }else if(tuNumero < numeroRandom){
                    System.out.println("Tu numero es menor al que he pensado, intentalo de nuevo");
                }else{
                    System.out.println("Felicidades, adivinaste el numero " + numeroRandom);
                    continuar = false;
                }
            }

        }
    }

    //9.	Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.
    public void ejercicio9(){

        Scanner numero1 = new Scanner(System.in);
        System.out.println("A continuacion digite un numero entero positivo para calcular su factorial: ");
        int num1 = Integer.parseInt(numero1.nextLine());
        int factorial = 1;
        
        if(num1 != 0){
            for(int iterador = 1; iterador < num1+1; iterador++){

                factorial = factorial * iterador;

            }
        }
        System.out.println("El factorial de " + num1 + " es " + factorial);
    }

    //10.	    Crea un programa que muestre los primeros 20 números de la serie Fibonacci.
    // La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente número:
    // 0, 1, 1, 2, 3, 5, 8, 13, …

    public void ejercicio10(){

        int numero1 = 20, numero2 = 0, numero3 = 1;

        System.out.println("Los numeros de la serie Fibonacci hasta el 20 son: ");

        for(int iterador = 1; iterador <= numero1; ++iterador){

            System.out.println("igual a : " + numero2);

            int total = numero2 + numero3;
            numero2 = numero3;
            numero3 = total;

        }


    }

    //11.	Escribe un programa que calcule el área de un triángulo utilizando la fórmula de Herón.
    // El usuario debe ingresar las longitudes de los tres lados.
    public void ejercicio11(){

        Scanner numero1 = new Scanner(System.in);
        System.out.println("Para calcular el area de un triangulo deberas ingresar las 3 longitudes de los tres lados y luego hare el calculo.");

        System.out.println("ingresa la longitud del primer lado: ");
        double num1 = numero1.nextDouble();

        System.out.println("ingresa la longitud del segundo lado: ");
        double num2 = numero1.nextDouble();
        
        System.out.println("ingresa la longitud del tercer lado: ");
        double num3 = numero1.nextDouble();

        double op1 = (num1 + num2 + num3) / 2;
        double calculoArea = Math.sqrt(op1 * (op1 - num1) * (op1 - num2) * (op1 - num3));

        System.out.println("El area del triangulo es: " + Math.round(calculoArea * 100.0) / 100.0);

    }


    //12.	Realiza un programa que pida al usuario un número entero y determine si es un número primo o no

    public void ejercicio12(){

        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingresa un numero entero positivo para saber si es primo: ");

        int num1 = numero1.nextInt();
        boolean primo = true;

        for(int iterador = 2; iterador <= num1 / 2; ++iterador){

            if(num1 % iterador == 0){
                primo = false;
                break;
            }
        }
        if(primo){
            System.out.println("El numero " + num1 + " es primo");
        }else{
            System.out.println("El numero " + num1 + " no es primo");
        }
    }

    //13.	Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales 

    public void ejercicio13(){

        Scanner numero1 = new Scanner(System.in);
        System.out.println("Escribe un numero decimal y lo redondeare segun los decimales que pidas");

        System.out.println("Escribe el numero a redondear: ");

        double num1 = numero1.nextDouble();
        System.out.println("Ahora cuando decimales quieres mostrar?: ");

        double num2 = numero1.nextDouble();
        double total = Math.round(num1 * Math.pow(10, num2)) / Math.pow(10, num2);

        System.out.println("El numero final es: " + total);
       
    }

    //14.	Escribe un programa que solicite al usuario un número entero positivo
    //      y verifique si es un número perfecto.
    //      Un número perfecto es aquel cuya suma de sus divisores propios
    //      (excluyendo al propio número) es igual al número.
    public void ejercicio14(){
        Scanner numero1 = new Scanner(System.in);

        System.out.println("Ingresa un numero positivo para saber si es perfecto: ");
        int num1 = numero1.nextInt();
        int suma = 0;
        for (int iterador = 1; iterador < num1; iterador++) {
          if (num1 % iterador == 0) {
            suma += iterador;
          }
        }
        if (suma == num1) {
          System.out.println("El numero " + num1 + " es perfecto");
        } else {
          System.out.println("El numero " + num1 + " no es perfecto");
        }
    }

    //15.	Crea un programa que pida al usuario un número entero
    // y determine si es un número capicúa.
    //  Un número capicúa es aquel que se lee igual de izquierda a derecha que de derecha a izquierda.
    public void ejercicio15(){

        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingresa un numero y te dire si es capicúa: ");
        int num = numero1.nextInt();
        int numeroso = num;
        int numerosi = 0;
        while (num != 0) {
          int res = num % 10;
          numerosi = numerosi * 10 + res;
          num /= 10;
        }
        if (numeroso == numerosi) {
          System.out.println("El numero " + numeroso + " es capicúa");
        } else {
          System.out.println("El numero " + numeroso + " no es capicúa");
        }
    }

    //16.	Realiza un programa que calcule e imprima la serie de Fibonacci hasta un número dado ingresado por el usuario. 
    public void ejercicio16(){

        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingresa un numero y mostrare la serie de fibonacci hasta el numero que me diste: ");
        int num1= numero1.nextInt();
        int num2 = 0;
        int num3 = 1;
        System.out.print("Esta es la serie de numeros Fibonacci hasta el numero" + num1 + ": ");
        while (num2 <= num1) {
          System.out.print(num2);
          int sumatotal = num2 + num3;
          num2 = num3;
          num3 = sumatotal;
        }
    }

    //17.	Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango.
    public void ejercicio17(){

        Scanner numero1 = new Scanner(System.in);
        System.out.println("Ingresa dos numero entero positivo para mostrar los numeros primos en ese rango: ");

        System.out.println("Primer numero: ");
        int num1 = numero1.nextInt();
        
        System.out.println("Segundo numero");
        int num2 = numero1.nextInt();

        boolean primo = true;

        for (int iterador = num1; iterador <= num2; iterador++) {
            if (esPrimo(iterador)) {
                System.out.println(iterador);
            }
        }     
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int iterador = 2; iterador <= Math.sqrt(numero); iterador++) {
            if (numero % iterador == 0) {
                return false;
            }
        }

        return true;
    }

    //18.	Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas,
    // letras minúsculas y dígitos.
    //  Puedes utilizar la clase Math para generar números aleatorios y la clase String para manipular la contraseña.
    public String ejercicio18(){


        String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom randomizador = new SecureRandom();

        StringBuilder contra = new StringBuilder(10);

        for (int iterador = 0; iterador < 10; iterador++) {
            contra.append(CHARACTERS.charAt(randomizador.nextInt(CHARACTERS.length())));
        }
        return contra.toString();
    }

    public void ejercicio19(){

        Scanner tuNombre = new Scanner(System.in);
        System.out.println("Dime tu nombre y lo imprimire primero en mayusculas y luego en minusculas");

        String nombre = tuNombre.nextLine();

        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        
    }

    public void ejercicio20(){

        Scanner invertirlo = new Scanner(System.in);
        System.out.println("Escribe un texto y lo invertire");

        String texto = invertirlo.nextLine();

        StringBuilder tt = new StringBuilder(texto);

        tt.reverse();
        System.out.println(tt);

    }


    public void ejercicio21(String palabra, String letra){

       
        System.out.println("Dime que letra quieres saber cuantas veces aparece: ");
    
        int total = 0;
        
        char le = letra.charAt(0);

        for(int iterador = 0; iterador < palabra.length(); iterador++){

            if(palabra.charAt(iterador) == le){
                total++;
            }
        }

        System.out.println("La letra " + le + " aparece un total de " + total + " veces.");
    }


    //22.  Verificar si es palindromo
    public void ejercicio22(){

        Scanner palabra =  new Scanner(System.in);
        
        System.out.println("Escribe una palabra y te dire si es palindromo");

        String  pal= palabra.nextLine();
        StringBuilder palabraMinuscula = new StringBuilder(pal);
        palabraMinuscula.reverse();
        String minuscula = pal.toLowerCase();
        String palabraInversa = palabraMinuscula.toString();

        if(minuscula.equals(palabraInversa)){

            System.out.println("Es palindromo");

        }else{

            System.out.println("No es palindromo");
        }

    }

    //23. Cuantas palabras tiene una horacion

    public void ejercicio23(){

        Scanner oracion = new Scanner(System.in);
        System.out.println("Escribe una horacion y te dire cuantas palabras tiene");

        String texto = oracion.nextLine();

        String[] arr = texto.split(" ");
        List<String> listaPalabras = Arrays.asList(arr);
        int total = 0;

        for (String string : listaPalabras) {
            total++;
        }

        System.out.println("Tu oracion tiene un total de " + total + " palabras");
    }

    //24. reemplazar todas la letras por una especifica a una cadena de texto

    public void ejercicio24(){

        Scanner palabra = new Scanner(System.in);
        System.out.println("Escribe algo y cambiare sus letras por la que me digas");

        System.out.println("Escribe la palabra: ");
        String palabracast = palabra.nextLine();

        System.out.println("Escribe la letra que quieres cambiar: ");
        String letra = palabra.nextLine();

        System.out.println("Escribe la letra que quieres agregar: ");
        String letracambio = palabra.nextLine();

        String oracionFinal = palabracast.replace(letra, letracambio);

        System.out.println("La oracion quedaria como: " + oracionFinal);

    }

    //25. mostrar palabras separadas de una frase

    public void ejercicio25(){

        Scanner oracion = new Scanner(System.in);

        System.out.println("Escribe la oracion: ");

        String oracionFinal = oracion.nextLine();

        String[] arr = oracionFinal.split(" ");
        List<String> listaFinal = Arrays.asList(arr);

        System.out.println("Las palabras son: ");
        for (String palabra:
              listaFinal) {
            System.out.println(palabra);

        }
    }

    //26. contar cuantas letras tiene un string sin contar los espacios

    public void ejercicio26(){

        Scanner oracion = new Scanner(System.in);

        System.out.println("Escribe la oracion para contar sus letras: ");

        String oracionFinal = oracion.nextLine();
        String meme = oracionFinal.replace(" ", "");
        String fin = meme;
        int total = 0;
        System.out.println(fin);

        for(int iterador = 0; iterador < fin.length(); iterador++){

            total++;
        }
        System.out.println("La oracion tiene un total de " + total + " letras");

    }

    //27. frase ordenada alfabeticamente
    public void ejercicio27(){

        Scanner palabra = new Scanner(System.in);

        System.out.println("Escribe la palabra para ordenarla alfabeticamente: ");

        String frase = palabra.nextLine();

        char[] arr = frase.toCharArray();
        Arrays.sort(arr);
        String ordenado = new String(arr);

        System.out.println(ordenado);

    }

    //28. suma de enteros

    public void ejercicio28(){

        Scanner numeros = new Scanner(System.in);

        System.out.println("Didita dos numeros enteros para su suma: ");
        System.out.println("Numero 1 :");
        int num1 = numeros.nextInt();
        System.out.println("Numero 2 :");
        int num2 = numeros.nextInt();

        System.out.println("La suma de los dos numeros es: " + (num1 + num2));

    }

    //29.  encontrar el numero más grande

    public void ejercicio29(int totalNumeros){

        Scanner num = new Scanner(System.in);
        int[] numeros = new int[totalNumeros];
        System.out.println("Escribiras un total de " + totalNumeros + " y averiguaremos cual es el numero mayor.");
        for(int iterador = 0; iterador < totalNumeros; iterador++){
            int numfin = num.nextInt();
            numeros[iterador] = numfin;

        }
        int numeroMayor = 0;
        for (int numero: numeros
             ) {
            if(numero > numeroMayor){
                numeroMayor = numero;
            }
        }

        System.out.println("El numero mayor de la lista es " + numeroMayor);

    }

    //30. Eliminar duplicador de una lista

    public void ejercicios30(int totalPalabras){

        Scanner palab = new Scanner(System.in);
        System.out.println("La lista tendra un total de " + totalPalabras + " palabras.");

        String[] listaPalabras = new String[totalPalabras];
        List<String> prueba = Arrays.asList(listaPalabras);
        ArrayList<String> listaFinal = new ArrayList<>();


        for(int iterador = 0; iterador < totalPalabras; iterador++){
            String palabraAgregar = palab.nextLine();
           if(prueba.contains(palabraAgregar)){
               continue;

           }else {
               listaPalabras[iterador] = palabraAgregar;
               listaFinal.add(palabraAgregar);

           }
        }

        for (String pal: listaFinal
             ) {
            System.out.println(pal);
        }
    }

    //31. Ordenar elementos de manera ascendente

    public void ejercicio31(int totalAgregar){

        System.out.println("La lista tendra un total de " + totalAgregar + " numeros enteros");
        Scanner numeros = new Scanner(System.in);

        ArrayList<Integer> numerosEnteros = new ArrayList<Integer>();

        for(int iterador = 0; iterador < totalAgregar; iterador++){
            int numeroAgregar = numeros.nextInt();
            numerosEnteros.add(numeroAgregar);
        }

        Collections.sort(numerosEnteros);

        for (Integer numero: numerosEnteros
             ) {
            System.out.println(numero);
        }
    }

    //32. Bucar un numero en una array y muestre su indice

    public void ejercicio32(){


        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(20);
        listaNumeros.add(30);
        listaNumeros.add(25);
        listaNumeros.add(100);
        listaNumeros.add(22);
        listaNumeros.add(88);
        listaNumeros.add(65);

        System.out.println("Esta es la lista de numeros: ");
        for (Integer numeros: listaNumeros
             ) {
            System.out.println(numeros);
        }
        System.out.println("Que numero deseas conocer su indice:");
        Scanner numero = new Scanner(System.in);
        int num = numero.nextInt();

        if(listaNumeros.contains(num)){

            int indice = listaNumeros.indexOf(num);
            System.out.println("EL indice de ese numero es: " + indice);
        }else{
            System.out.println("Ese numero no se encuentra en la lista");

        }
    }

    //33. FRECUENCIA DE ELEMENTOS

    public void ejercicio33(){

        int[] arreglo = {1, 2, 2, 1, 1, 3, 5, 1, 2};

        HashMap<Integer, Integer> frecuencia = new HashMap<Integer, Integer>();

        for (int i = 0; i < arreglo.length; i++) {
            if (frecuencia.containsKey(arreglo[i])) {
                frecuencia.put(arreglo[i], frecuencia.get(arreglo[i]) + 1);
            } else {
                frecuencia.put(arreglo[i], 1);
            }
        }

        System.out.println("Frecuencia de cada elemento:");
        for (int i : frecuencia.keySet()) {
            System.out.println(i + ": " + frecuencia.get(i));
        }

    }

    //34 rotacion de elementos en una lista
    public void ejercicio34(){
        int[] arreglo = {1, 2, 3, 4, 5};
        int rotacion = 2; // número de posiciones a rotar

        System.out.println("Arreglo original:");
        for (int i : arreglo) {
            System.out.print(i + " ");
        }

        // Rotar hacia la izquierda
        for (int i = 0; i < rotacion; i++) {
            int j, primero;
            primero = arreglo[0];

            for (j = 0; j < arreglo.length - 1; j++) {
                arreglo[j] = arreglo[j + 1];
            }

            arreglo[j] = primero;
        }

        System.out.println("\nArreglo rotado hacia la izquierda:");
        for (int i : arreglo) {
            System.out.print(i + " ");
        }

        // Rotar hacia la derecha
        for (int i = 0; i < rotacion; i++) {
            int j, ultimo;
            ultimo = arreglo[arreglo.length - 1];

            for (j = arreglo.length - 1; j > 0; j--) {
                arreglo[j] = arreglo[j - 1];
            }

            arreglo[0] = ultimo;
        }

        System.out.println("\nArreglo rotado hacia la derecha:");
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
    }

    //35. tablas de multiplicar

    public void ejercicio35(){
        List<String> tablas = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            StringBuilder tabla = new StringBuilder();
            tabla.append("Tabla del ").append(i).append(":\n");

            for (int j = 1; j <= 10; j++) {
                tabla.append(i).append(" x ").append(j).append(" = ").append(i * j).append("\n");
            }

            tablas.add(tabla.toString());
        }

        System.out.println(tablas);


    }



}
