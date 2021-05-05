public class Main{
    public static void main(String[] args) {
        System.out.println("user logged in");
        
        Calculator calculator = new Calculator();

        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(calculator.EXIT_ON_CLOSE);

    }
}