package OOPS.Encapsulation;

class Addition {
    void sum(int a, int b) {
        int c = a + b;
        System.out.println("Addition of two numbers :" + c);
    }

    void sum(int a, int b, int e) {
        int c = a + b + e;
        System.out.println("Addition of three numbers :" + c);
    }

    class Encapsulation2 {
        public static void main(String[] args) {
            Addition obj = new Addition();
            obj.sum(30, 90);
            obj.sum(45, 80, 22);
}
}
}
