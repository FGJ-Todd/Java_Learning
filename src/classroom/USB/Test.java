package classroom.USB;

public class Test {
    public static void main(String[] args) {
        USBInterface udisk = new UDisk();
        USBInterface ufan = new UsbFan();
        udisk.service();
        ufan.service();
    }
}
