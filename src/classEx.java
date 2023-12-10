class Cellphone {
    public void Ringing() {
        System.out.println("Ringing...");
    }

    public void Vibrating() {
        System.out.println("Vibrating...");
    }

    public void Callfriend() {
        System.out.println("Calling Shashank...");
    }
}

class Square {
    int side;

    public int area() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

public class classEx {
    public static void main(String[] args) {
        /*
         * Cellphone Vivo = new Cellphone();
         * Vivo.Callfriend();
         * Vivo.Ringing();
         * Vivo.Vibrating();
         */

        Square sq = new Square();
        sq.side = 6;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}