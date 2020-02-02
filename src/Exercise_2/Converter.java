package Exercise_2;

public class Converter {
   public Command convertInputToCommand(String input){

       String[] split = input.split(":");
       String row = split[0];
       String columnInString = split[1];
       Integer column = Integer.valueOf(columnInString);

       Command command = new Command(row, column);
       return command;
   }
}
