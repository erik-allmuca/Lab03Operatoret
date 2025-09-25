public class ArithmeticDemo {
    public static void main(String[] args) {
        int a = 17, b = 5, c = 2;


        System.out.println("a+b = " + (a + b));
        System.out.println("a-b = " + (a - b));
        System.out.println("a*b = " + (a * b));
        System.out.println("a/b = " + (a / b) + " // ndarje e plotë");
        System.out.println("a%b = " + (a % b));


        System.out.println();
        System.out.println("Vlera fillestare e b = " + b);
        System.out.println("Pas para-inkrementimit ++b : " + (++b)); 
        System.out.println("Pas pas-inkrementimit b++ : " + (b++)); 
        System.out.println("Vlera e b pas b++ : " + b);

       
        b = 5; 
        int r = b++ * c;
        System.out.println();
        System.out.println("Shprehja: int r = b++ * c;");
        System.out.println("para: b=" + 5 + ", r=" + r);
        System.out.println("pas: b=" + b);
    }
}
