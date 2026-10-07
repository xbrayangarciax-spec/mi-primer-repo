package faciles;

import java.util.Scanner;

public class Faciles {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        consecutivo co = new consecutivo();
        int respuesta = 0;
        System.out.println("BIENVENIDO AL PROGRAMA MULTIPROPOSITOS\n--------------------------------------");
        while (true) {
            System.out.println("""
                               \nIngrese el numero del programa que desea ejecutar, si desea terminar el programa escriba 0
                               1. Numeros consecutivos
                               2. Numeros pares
                               3. Suma consecutiva
                               4. Tabla de multiplicar
                               5. Promedio de notas
                               6. Contar numeros positivos
                               7. Mayor de varios numeros
                               8. Compras de un cliente
                               9. Numero de aprobados y reprobados
                               10. Ventas de una tienda""");
            System.out.print("Opcion: ");
            String entrada = sc.nextLine().trim();
            try {
                respuesta = Integer.parseInt(entrada);

            } catch (NumberFormatException e) {
                System.out.println("\nOPCION INVALIDA");
                continue;
            }

            if (respuesta < 0) {
                System.out.println("\nOPCION INVALIDA");
                continue;
            }

            if (respuesta == 0) {
                System.out.println("Hasta la proxima");
                break;
            }

            switch (respuesta) {
                case 1:
                    System.out.print("\nUsted ha seleccionado el programa Numeros consecutivos, ingrese un numero entero positivo: ");
                    try {
                        double numero = Double.parseDouble(sc.nextLine());
                        String resultado = co.numerosConsecutivos(numero);
                        System.out.println(resultado);
                    } catch (NumberFormatException e) {
                        System.out.println("El dato ingresado es invalido");
                    }
                    break;

                case 2:
                    System.out.print("\nUsted ha seleccionado el programa Numeros pares, ingrese un numero entero positivo: ");
                    try {
                        double numero = Double.parseDouble(sc.nextLine().trim());
                        String resultado = co.numerosPares(numero);
                        System.out.println(resultado);
                    } catch (NumberFormatException e) {
                        System.out.println("El dato ingresado es invalido");
                    }
                    break;

                case 3:
                    System.out.print("\nUsted ha seleccionado el programa Suma consecutiva, ingrese un numero entero positivo: ");
                    try {
                        double numero = Double.parseDouble(sc.nextLine().trim());
                        String resultado = co.sumaConsecutiva(numero);
                        System.out.println(resultado);
                    } catch (NumberFormatException e) {
                        System.out.println("El dato ingresado es invalido");
                    }
                    break;

                case 4:
                    System.out.print("\nUsted ha seleccionado el programa Tabla de multiplicar, ingrese un numero entero positivo: ");
                    try {
                        double numero = Double.parseDouble(sc.nextLine().trim());
                        String resultado = co.tablaDeMultiplicar(numero);
                        System.out.println(resultado);
                    } catch (NumberFormatException e) {
                        System.out.println("El dato ingresado es invalido");
                    }
                    break;

                case 5:
                    System.out.print("\nUsted ha seleccionado el programa Promedio de notas, ingrese el numero de estudiantes para calcular promedio: ");
                    try {
                        double numero = Double.parseDouble(sc.nextLine().trim());
                        co.promedioDeNotas(numero);

                    } catch (NumberFormatException e) {
                        System.out.println("El dato ingresado es invalido");
                    }
                    break;

                case 6:
                    System.out.print("\nUsted ha seleccionado el programa Contar numeros positivos, ingrese la cantidad de numeros a analizar: ");
                    try {
                        double numero = Double.parseDouble(sc.nextLine().trim());
                        co.contarNumerosPositivos(numero);

                    } catch (NumberFormatException e) {
                        System.out.println("El dato ingresado es invalido");
                    }
                    break;

                case 7:
                    System.out.print("\nUsted ha seleccionado el programa Mayor de varios numeros, ingrese la cantidad de numeros a analizar: ");
                    try {
                        double numero = Double.parseDouble(sc.nextLine().trim());
                        co.mayorDeVariosNumeros(numero);

                    } catch (NumberFormatException e) {
                        System.out.println("El dato ingresado es invalido");
                    }
                    break;

                case 8:
                    System.out.print("\nUsted ha seleccionado el programa Compras de un cliente, Se le sumara el valor de sus compras, cuantos productos compro?: ");
                    try {
                        double numero = Double.parseDouble(sc.nextLine().trim());
                        co.comprasDeUnCliente(numero);

                    } catch (NumberFormatException e) {
                        System.out.println("El dato ingresado es invalido");
                    }
                    break;

                case 9:
                    System.out.print("\nUsted ha seleccionado el programa Nummero de aprobados y reprobados, ingrese los siguientes datos: ");
                    try {
                        System.out.print("\nCuantos estudiantes son: ");
                        double numero = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Nota maxima del examen (a su criterio): ");
                        double maxima = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Nota minima del examen (a su criterio): ");
                        double minima = Double.parseDouble(sc.nextLine().trim());
                        System.out.print("Nota minima para pasar (a su criterio): ");
                        double limbo = Double.parseDouble(sc.nextLine().trim());
                        if (maxima > minima && limbo > minima && limbo < maxima) {
                            co.numeroDeAprobadosYReprobados(minima, maxima, limbo, numero);
                        } else {
                            System.out.println("\nLa logica de las notas es invalida");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("El dato ingresado es invalido");
                    }

                case 10:
                    System.out.print("\nUsted ha seleccionado el programa Ventas de una tienda, ingrese los siguientes datos: ");
                    try {
                        System.out.print("\nCantidad de dias a analizar: ");
                        double numero = Double.parseDouble(sc.nextLine().trim());
                        co.ventasDeUnaTienda(numero);
                    } catch (NumberFormatException e) {
                        System.out.println("El dato ingresado es invalido");
                    }
                    break;

                default:
                    System.out.println("\nOPCION NO ENCONTRADA");
                    break;
            }
        }

    }
}
