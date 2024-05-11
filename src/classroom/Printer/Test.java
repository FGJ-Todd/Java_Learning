package classroom.Printer;

public class Test {
    public static void main(String[] args) {
        Printer [] printers = new Printer[3];
        printers[0] = new DotMatrixPrinter();
        printers[1] = new InketPrinter();
        printers[2] = new LaserPrinter();
        for (Printer printer : printers){
            printer.print();
        }
    }
}
