package pck;

import java.util.Scanner;

/**
 * Author: Andre marroqui, Gabriel Paz, Andy Fuentes
 * ht3 - 2023
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sorts ordenamientos = new Sorts(new EnterosComparador());
        ControladoraArchivos txt = new ControladoraArchivos();
        Integer[] listadenteros = txt.VerificarExistencia();
        /**
         * @param args Menu de opciones
         */

        System.out.println("------Bienvenido al programa de ordenamiento------");
        Boolean salir = false;
        Boolean menu = true;
        int opcion = 0;

        do {
            do {
                opcion = 0;
                try {


                    System.out.println("1. Ordenar por GnomeSort");
                    System.out.println("2. Ordenar por MergeSort");
                    System.out.println("3. Ordenar por QuickSort");
                    System.out.println("4. Ordenar por RadixSort");
                    System.out.println("5. Ordenar por BubbleSort");
                    System.out.println("6. Salir");
                    System.out.println("Ingrese una opcion: ");
                    opcion = sc.nextInt();
                    salir = false;
                } catch (Exception e) {
                    System.out.println("Error intente de nuevo.\n");
                    menu = true;

                }finally {
                    sc.nextLine();
                }
            } while (salir);
                switch (opcion) {
                    /**
                     * @param args Ordena por GnomeSort
                     */
                    case 1:
                        System.out.println("Ordenando por GnomeSort");
                        for (int i = 10; i<= 3000; i+=299){
                            Integer[] listadenteros2 = new Integer[i];
                            for (int j=0; j<i;j++){
                                listadenteros2[j]=listadenteros[j];
                            }
                            System.out.println("SE ESTA ORDENANDO CON: "+i+" NUMEROS");
                            ordenamientos.gnomeSort(listadenteros2);
                            for (int z: listadenteros2){
                                System.out.println(z);
                            }
                            System.out.println("Presione 1 luego enter para continuar el ordenamiento de " + i + " mas " + 299 + " numeros");
                            sc.nextInt();
                        }

                        System.out.println("GNOMESORT TERMINADO");
                        break;
                    case 2:
                        /**
                         * @param args Ordena por MergeSort
                         */
                        System.out.println("Ordenando por MergeSort");
                        for (int i = 10; i<= 3000; i+=299){
                            Integer[] listadenteros2 = new Integer[i];
                            for (int j=0; j<i;j++){
                                listadenteros2[j]=listadenteros[j];
                            }
                            System.out.println("SE ESTA ORDENANDO CON: "+i+" NUMEROS");
                            ordenamientos.mergeSort(listadenteros2,0, listadenteros2.length-1);
                            for (int z: listadenteros2){
                                System.out.println(z);
                            }
                            System.out.println("Presione 1 luego enter para continuar el ordenamiento de " + i + " mas " + 299 + " numeros");
                            sc.nextInt();
                        }
                        System.out.println("MERGESORT TERMINADO");
                        break;
                    case 3:
                        /**
                         * @param args Ordena por QuickSort
                         */
                        System.out.println("Ordenando por QuickSort");
                        for (int i = 10; i<= 3000; i+=299){
                            Integer[] listadenteros2 = new Integer[i];
                            for (int j=0; j<i;j++){
                                listadenteros2[j]=listadenteros[j];
                            }
                            System.out.println("SE ESTA ORDENANDO CON: "+i+" NUMEROS");
                            ordenamientos.quickSort(listadenteros2,0, listadenteros2.length-1);
                            for (int z: listadenteros2){
                                System.out.println(z);
                            }
                            System.out.println("Presione 1 luego enter para continuar el ordenamiento de " + i + " mas " + 299 + " numeros");
                            sc.nextInt();
                        }

                        System.out.println("QUICKSORT TERMINADO");
                        break;
                    case 4:
                        /**
                         * @param args Ordena por RadixSort
                         */
                        System.out.println("Ordenando por RadixSort");
                        for (int i = 10; i<= 3000; i+=299){
                            Integer[] listadenteros2 = new Integer[i];
                            for (int j=0; j<i;j++){
                                listadenteros2[j]=listadenteros[j];
                            }
                            System.out.println("SE ESTA ORDENANDO CON: "+i+" NUMEROS");
                            ordenamientos.radixSort(listadenteros2);
                            for (int z: listadenteros2){
                                System.out.println(z);
                            }
                            System.out.println("Presione 1 luego enter para continuar el ordenamiento de " + i + " mas " + 299 + " numeros");
                            sc.nextInt();
                        }

                        System.out.println("RADIXSORT TERMINADO");
                        break;
                    case 5:
                        /**
                         * @param args Ordena por BubbleSort
                         */
                        System.out.println("Ordenando por BubbleSort");
                        for (int i = 10; i<= 3000; i+=299){
                            Integer[] listadenteros2 = new Integer[i];
                            for (int j=0; j<i;j++){
                                listadenteros2[j]=listadenteros[j];
                            }
                            System.out.println("SE ESTA ORDENANDO CON: "+i+" NUMEROS");
                            ordenamientos.BubbleSort(listadenteros2);
                            for (int z: listadenteros2){
                                System.out.println(z);
                            }
                            System.out.println("Presione 1 luego enter para continuar el ordenamiento de " + i + " mas " + 299 + " numeros");
                            sc.nextInt();
                        }
                        break;

                    case 6:
                        /**
                         * @param args Ordena por InsertionSort
                         */
                        ordenamientos.quickSort(listadenteros,0, listadenteros.length-1);
                        txt.ACtualizarArchivo(listadenteros);
                        System.out.println("Archivo actualizado, saliedno del programa...");
                        menu = false;
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        break;
                }


            }
        while(menu);
        }

    }






