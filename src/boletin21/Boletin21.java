/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author otorradomiguez
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    private static Scanner sc1 = new Scanner(System.in);
    private static ArrayList lista = new ArrayList();

    public static void main(String[] args) {
        // TODO code application logic here
        lista.add(sc1.next());
        System.out.println(lista);

    }

    public void guardar(String archivo) {
        File fichero;
        PrintWriter p = null;
        try {
            fichero = new File(archivo);
            p = new PrintWriter(fichero);
            for (int i = 0; i < lista.size(); i++) {
                p.println(i + "" + lista.get(i));
            }
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            p.close();
        }
    }

}
