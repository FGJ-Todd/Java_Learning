package classroom.USB;

public class UsbFan implements USBInterface{
    @Override
    public void service() {
        System.out.println("USB口开始给风扇供电");
    }
}
