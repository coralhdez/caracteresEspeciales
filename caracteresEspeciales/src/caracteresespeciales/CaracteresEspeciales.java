/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caracteresespeciales;

/**
 *
 * @author Alumno Mañana
 */
public class CaracteresEspeciales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var alumno = "Lucia";
        var titulo = "informatico";

        var concat = titulo + " " + alumno;

        System.out.println("concat = " + concat);

        System.out.println("Tabulador \t" + alumno);
        System.out.println("Retroceso \b" + alumno);
        System.out.printf("Salto de línea \n" + alumno);

    }

}
