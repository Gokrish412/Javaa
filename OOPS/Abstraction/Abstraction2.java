package OOPS.Abstraction;

abstract class Colours {
    public abstract void paint();
}

class Red extends Colours {
    public void paint() {
        System.out.println("Painting red colour");
    }
}

class Blue extends Colours {
    public void paint() {
        System.out.println("Painting blue colour");
    }
}

public class Abstraction2 {
    public static void main(String[] args) {
        Red red = new Red();
        Blue blue = new Blue();
        red.paint();
        blue.paint();
    }
}

