public class MethodOverloading {
    // This class is example for method overloading

    // sum method with 2 integer parameter
    void sum(int x, int y) {
        System.out.println("The sum of 2 integers :" + (x + y));

    }

    // sum method with 3 integer parameter
    void sum(int x, int y, int z) {
        System.out.println("The sum of 3 integers :" + (x + y + z));
    }

    // sum method with 2 double parameter
    void sum(double x, double y) {
        System.out.println("The sum of 2 double :" + (x + y));
    }

    // sum method with 2 double parameter
    void sum(double x, double y, double z) {
        System.out.println("The sum of 3 doubles :" + (x + y + z));
    }

}
