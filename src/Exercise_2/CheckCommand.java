package Exercise_2;

public class CheckCommand {
     boolean commandValidation(Command command) {
          String row = command.getRow();
          int column = command.getColumn();
          boolean rightRow;

          if (row.equals("A") || row.equals("B") || row.equals("C")){
               rightRow = false;
          } else {
               rightRow = true;
          }

          try {
               if ((column < 1 && column > 4) || rightRow) {
                    return false;
               }
          } catch (Exception e) {
               System.out.println("Lav ches ara normal input tur :)");
          }
          return true;
     }
}
