public class MethodOverloadingTest {

    public static void main(String[] args) {

        // Creating calculator object of Calculator class
        MethodOverloading mol = new MethodOverloading();

        mol.sum(10, 20); // Integer with 2 argument

        System.out.println("***********************");
        mol.sum(10, 20, 30); // Integer with 3 argument

        System.out.println("***********************");

        mol.sum(22.05, 34.56); // Double with 2 argument

        System.out.println("***********************");

        mol.sum(99.99, 88.88, 77.77); // Double with 3 argument

        System.out.println("***********************");
    }
}
