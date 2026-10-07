package faciles;

import java.util.Scanner;

class consecutivo {

    Scanner sc = new Scanner(System.in);

    public String numerosConsecutivos(double numero) {

        String mensaje = "";
        if (numero > 0 && numero % 1 == 0) {
            mensaje += "Los numeros desde el 1 hasta el " + (int) numero + " son:\n";
            for (int i = 0; i < numero; i++) {
                mensaje += (i + 1) + ", ";
            }
        } else if (numero < 0 || numero % 1 != 0) {
            return "El numero ingresado no es valido";
        }
        int pos = mensaje.lastIndexOf(",");
        mensaje = mensaje.substring(0, pos);
        return mensaje;
    }

    public String numerosPares(double numero) {
        String mensaje = "";
        if (numero > 1 && numero % 1 == 0) {
            mensaje += "Los numeros pares entre 1 y " + (int) numero + " son:\n";
            for (int i = 0; i < numero; i++) {
                if ((i + 2) % 2 == 0 && (i + 2) <= numero) {
                    mensaje += (i + 2) + ", ";
                }

            }
            int pos = mensaje.lastIndexOf(",");
            mensaje = mensaje.substring(0, pos);
        } else if (numero < 2 || numero % 1 != 0) {
            mensaje = "El numero ingresado no es valido";
        }

        return mensaje;
    }

    public String sumaConsecutiva(double numero) {
        String mensaje = "";
        int suma = 0;
        String sumaStr = "";
        if (numero >= 1 && numero % 1 == 0) {
            for (int i = 0; i <= numero; i++) {
                suma += i;
            }
            sumaStr = String.valueOf(suma);
        } else {
            return "El numero ingresado no es valido";
        }
        return "La suma consecutiva de los numeros desde 1 hasta " + (int) numero + " es: " + sumaStr;
    }

    public String tablaDeMultiplicar(double numero) {
        String mensaje = "";
        if (numero > 0 && numero % 1 == 0) {
            mensaje += "La tabla del " + (int) numero + " del 1 al 10 es :\n";
            for (int i = 0; i < 10; i++) {
                mensaje += (int) numero + " x " + (i + 1) + " = " + ((int) numero * (i + 1)) + "\n";
            }
        } else {
            mensaje = "El numero ingresado no es valido";
        }
        return mensaje;
    }

    public void promedioDeNotas(double numero) {
        double nota = 0;
        double acumulado = 0;
        if (numero > 1 && numero % 1 == 0) {
            System.out.println("REGLA: las notas deben comprender entre 0 y 5 y use . para los decimales, si desea cancelar el programa escriba -1");
            for (int i = 0; i < numero; i++) {
                System.out.print("Nota del estudiante " + (i + 1) + ": ");
                try {
                    nota = Double.parseDouble(sc.nextLine().trim());
                    acumulado += nota;
                    if (nota < 0 || nota > 5) {
                        if (nota == -1) {
                            System.out.println("Programa termiando exitosamente");
                            break;
                        }
                        System.out.println("Nota invalida, vuelva a ingresar la nota");
                        acumulado -= nota;
                        i--;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("El dato ingresado es invalido, intentelo de nuevo");
                    i--;
                }

            }
            if (nota != -1) {
                System.out.printf("\nPromedio del grupo: %.2f", (acumulado / numero));
            }
        } else {
            System.out.println("El numero ingresao no es valido");
        }
    }

    public void contarNumerosPositivos(double numero) {
        int positivos = 0;
        if (numero > 0 && numero % 1 == 0) {
            System.out.println("A continuacion, digite numeros enteros");
            for (int i = 0; i < numero; i++) {
                System.out.print("Numero " + (i + 1) + ": ");
                double num = sc.nextDouble();
                if (num > 0) {
                    positivos++;
                }
            }
        } else {
            System.out.println("El numero ingresao no es valido");
        }
        System.out.println("Cantidad de positivos: " + positivos);
    }

    public void mayorDeVariosNumeros(double numero) {
        double numeroMayor = 0;
        double numeros = 0;
        if (numero > 1 && numero % 1 == 0) {
            System.out.println("A continuacion, digite numeros enteros");
            for (int i = 0; i < numero; i++) {
                System.out.print("Numero " + (i + 1) + ": ");
                try {
                    numeros = Double.parseDouble(sc.nextLine().trim());
                    if (numeros % 1 != 0) {
                        System.out.println("El numero ingresado es invalido");
                        i--;
                    }
                } catch (NumberFormatException e) {

                    System.out.println("El dato ingresado es invalido, vuelva a intentarlo");
                    i--;
                }
                if (numeros > numeroMayor) {
                    numeroMayor = numeros;
                }

            }
            System.out.println("El mayor es: " + (int) numeroMayor);
        } else {
            System.out.println("El numero ingresado no es valido");
        }
    }

    public void comprasDeUnCliente(double numero) {
        double precio = 0;
        double acumulado = 0;
        if (numero > 1 && numero % 1 == 0) {
            System.out.println("A continuacion, digite los precios de los productos que compro para calcular el total,"
                    + " si quiere terminar el programa escriba -1 (recuerde que para decimales use el .)");
            for (int i = 0; i < numero; i++) {
                System.out.print("Precio del producto " + (i + 1) + ": ");
                try {
                    precio = Double.parseDouble(sc.nextLine().trim());
                    acumulado += precio;
                    if (precio < 0) {
                        if (precio == -1) {
                            System.out.println("\nPrograma terminado exitosamente");
                            break;
                        }
                        System.out.println("El numero ingresado es invalido, vuelva a intentarlo");
                        i--;
                    }
                } catch (NumberFormatException e) {

                    System.out.println("El dato ingresado es invalido, vuelva a intentarlo");
                    i--;
                }
            }
            System.out.printf("\nTotal de la compra: %.2f", acumulado);
        } else if (numero == 1) {
            System.out.println("El total es lo mismo que vale tu unico producto, bobo");
        } else {
            System.out.println("El numero ingresado no es valido");
        }
    }

    public void numeroDeAprobadosYReprobados(double minima, double maxima, double limbo, double numero) {
        double nota = 0;
        int aprobados = 0;
        String entrada = "";
        if (numero > 0 && numero % 1 == 0) {
            System.out.println("Si desea cancelar el programa ingrese la letra N");
            for (int i = 0; i < numero; i++) {
                try {
                    System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
                    entrada = sc.nextLine().trim();
                    if (entrada.equalsIgnoreCase("n")) {
                        System.out.println("Programa terminado exitosamente");
                        break;
                    }
                    nota = Double.parseDouble(entrada);
                    if (nota >= minima && nota <= maxima) {
                        if (nota >= limbo) {
                            aprobados++;
                        }
                    } else {
                        System.out.println("La nota no se encuentra en el rango de notas propuesto, vuelva a intentarlo");
                        i--;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("El dato ingresado es invalido, vuelva a intentarlo");
                    i--;
                }
            }
            if (!entrada.equalsIgnoreCase("n")) {
                System.out.println("Aprobados: " + aprobados + "\nReprobados: " + (int) (numero - aprobados));
            }
        } else {
            System.out.println("La cantidad de estudiantes ingresada es invalida");
        }
    }

    public void ventasDeUnaTienda(double numero) {
        double ventas = 0;
        double valor = 0;
        int superior = 0;
        double sumatoria = 0;
        if (numero > 0 && numero % 1 == 0) {
            double[] acumulado = new double[(int) numero];
            System.out.println("Si desea salir del programa, ingrese -1 en cualquier instancia");
            for (int i = 0; i < numero; i++) {
                System.out.print("\nIngrese la cantidad de ventas del dia " + (i + 1) + ": ");
                try {
                    ventas = Double.parseDouble(sc.nextLine());
                    if (ventas == -1) {
                        System.out.println("Programa terminado exitosamente");
                        return;
                    }
                    if (ventas > 0 && ventas % 1 == 0) {
                        for (int j = 0; j < ventas; j++) {
                            System.out.print("Valor de la venta " + (j + 1) + ": ");
                            try {
                                valor = Double.parseDouble(sc.nextLine());
                                if (valor == -1) {
                                    System.out.println("Programa terminado exitosamente");
                                    return;
                                }
                                if (valor >= 0) {
                                    acumulado[i] += valor;
                                } else {
                                    System.out.println("El numero ingresado es invalido, vuelva a intentarlo");
                                    j--;
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("El dato ingresado es invalido, vuelva a intentarlo");
                                j--;
                            }
                        }
                        if (acumulado[i] > 500000) {
                            superior++;
                        }
                        System.out.println("\nTotal ventas del dia " + (i + 1) + ": " + acumulado[i]);
                        System.out.println("Promedio de ventas del dia " + (i + 1) + ": " + (acumulado[i] / ventas + "\n"));
                    } else {
                        System.out.println("El numero ingresado es invalido, vuelva a intentarlo");
                        i--;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("El dato ingresado es invalido, vuelva a intentarlo");
                    i--;
                }
            }
            for (int i = 0; i < numero; i++) {
                sumatoria += acumulado[i];
            }
            System.out.println("La cantidad de dias que superaron la cuota de 500000 fue " + superior);
            System.out.printf("El promedio de ventas por dia en total fue de %.2f", (sumatoria / numero));

        }else{
        System.out.println("El numero ingresado es invalido");
        }
    }
}
