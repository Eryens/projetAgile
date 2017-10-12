import enums.Colors;

import java.util.Iterator;
import java.util.Scanner;

public class ChoixCouleur {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Inout utilisateur

        String chosenColor ;
        InkPad myInkPad = new InkPad();
        // Création variable

        System.out.println("Choisissez une couleur parmis les suivantes : ");

        for ( int i = 0 ; i < Colors.values().length ; i++) {
            System.out.println(Colors.values()[i]);
        }
        // Affiche les couleurs

        System.out.println("Couleur choisie : ");
        chosenColor = scanner.nextLine() ;
        // Get input utilisateur

        System.out.println(chosenColor);

        myInkPad.changeColor(chosenColor);

        System.out.println("La couleur du tampon encreur est : ");
        myInkPad.displayColor();
        

    }

}
