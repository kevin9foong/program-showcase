package game2;

public class Main {
    public static void main(String[] args) {
        Character kev = new Character("Kev", 20);
        Character lee = new Character("Lee", 20);

        kev.attack(lee, 3);
        kev.attack(lee, 3);
    }
}
