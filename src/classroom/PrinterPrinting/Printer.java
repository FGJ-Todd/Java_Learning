package classroom.PrinterPrinting;

public class Printer {
    InkBox inkBox;
    Paper paper;

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void setInkBox(InkBox inkBox) {
        this.inkBox = inkBox;
    }

    public void print() {
        System.out.println("使用"+inkBox.getColor()+"的墨盒在"+paper.getPaper()+"的纸张上打印");
    }
}
