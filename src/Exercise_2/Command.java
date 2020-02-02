package Exercise_2;

public class Command {
    //region Properties
    private String row;
    private int column;
    //end Properties

    //region Constructors
    public Command(String row, int column) {
        this.row = row;
        this.column = column;
    }
    //end Constructors

    //region getter and setter
    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    //end getter and setter

    //region toString
    @Override
    public String toString() {
        return "Command{" +
                "row='" + row + '\'' +
                ", column=" + column +
                '}';
    }
    //end to String
}
