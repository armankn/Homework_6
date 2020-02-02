package Exercise_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please make your choice \n\n" +
                "      |   1   |     2    |      3     |\n" +
                "   ___|_______|__________|____________|\n" +
                "    A | Pepsi |   Cola   |   Fanta    |\n" +
                "   ---|-------|----------|------------|\n" +
                "    B | Lays  | Doritos  | Hzor Chips |\n" +
                "   ---|-------|----------|------------|\n" +
                "    C | Mars  | Snickers |   Bounty   |\n" +
                "   ___|_______|__________|____________|");

        VendingMachine vendingMachine = new VendingMachine();
        Converter converter = new Converter();
        Input in = new Input();

        vendingMachine.getProducts(converter.convertInputToCommand(in.userInput()));
        vendingMachine.printBoard();

//        System.out.print("Row is: " + converter.getRow() + "\n" +
//                "Column is: " + converter.getColumn());
    }
}
