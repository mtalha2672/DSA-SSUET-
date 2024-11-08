class Color {
    int red;
    int green;
    int blue;

    Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }


    public boolean equals(Object obj) {
        Color c = (Color) obj;
        if (this.red == c.red && this.green == c.green && this.blue == c.blue) {
            return true;
        } else {
            return false;
        }
    }
}

public class Q4_HW {
    public static void main(String[] args) {
        Color c1 = new Color(255, 0, 0);
        System.out.println("The color are equal : " +
                c1.equals(new Color(255, 10, 0)));
    }
}


