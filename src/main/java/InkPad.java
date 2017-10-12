import enums.Colors ;

public class InkPad {

    private Colors color;

    public InkPad() {
        color = Colors.white;
    }

    public void changeColor(String newColor) {
        try {
            color = Colors.valueOf(newColor);
        }
        catch(Exception e) {
            System.out.println("Couleur invalide");
        }


    }

    public void displayColor() {
        System.out.println(color.toString());
    }
}
