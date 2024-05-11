package classroom.USB;

public class UDisk implements USBInterface {
    @Override
    public void service() {
        System.out.println("USB口开始传输数据");
    }
}
