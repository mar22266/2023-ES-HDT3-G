package pck;

import java.io.*;
import java.util.Random;

/**
 * Author: Andre marroqui, Gabriel Paz, Andy Fuentes
 * ht3 - 2023
 */
public class ControladoraArchivos {

    Random random = new Random();

    public void crearArchivo(){
        Integer[] listadenteros = new Integer[3000];
        for (int i = 0; i < listadenteros.length; i++) {
            listadenteros[i] = random.nextInt();
        }

        try {
            File archivo = new File("Numeros.txt");
            archivo.createNewFile();

            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            String DATA = "";
            for (int entero : listadenteros) {
                DATA += String.valueOf(entero) + "\n";
            }

            bw.write(DATA);
            bw.close();
        }catch (Exception e) {
            System.out.println("Hubo un ERROR");
            e.printStackTrace();
        }

    }

    public Integer[] leerarchivo(){
        Integer[] listadenteros = new Integer[3000];

        File archivo = null;
        FileReader reader = null;
        BufferedReader br = null;

        try {
            archivo = new File("Numeros.txt");
            reader = new FileReader(archivo);
            br = new BufferedReader(reader);

            String row;

            int i = 0;
            while ((row = br.readLine()) != null) {
                listadenteros[i] = Integer.parseInt(row);
                i++;
            }
            return listadenteros;
        }catch (Exception e) {
            System.out.println("Hubo un ERROR esaneando el archivo");
            e.printStackTrace();

        }finally {
            try {
                if (null != reader) {
                    reader.close();
                }
            }catch (Exception e2) {
                System.out.println("Hubo un ERROR cerrando el archivo");
                e2.printStackTrace();
            }
        }
        return null;

    }

    public Integer[] VerificarExistencia(){
        File archivo = new File("Numeros.txt");

        if (archivo.exists()) {
            return leerarchivo();
        }else{
            crearArchivo();
            return leerarchivo();
        }
    }

    public void ACtualizarArchivo(Integer[] numeros){

        try{
            File archivo = new File("Numeros.txt");
            FileWriter reader = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(reader);

            String DATA = "";
            for (int entero : numeros) {
                DATA += String.valueOf(entero) + "\n";
            }

            bw.write(DATA);
            bw.close();
    }catch (Exception e) {
            System.out.println("Hubo un ERROR actualizando el archivo");
            e.printStackTrace();
        }
    }










}
