package classroom.door;

public class AntiTheftDoor extends door implements Lock,doorbell{
    @Override
    public void lock() {
        System.out.println("门锁上了");
    }

    @Override
    public void unlock() {
        System.out.println("门解锁了");
    }

    @Override
    void open() {
        System.out.println("门打开了");
    }

    @Override
    void close() {
        System.out.println("门关上了");
    }

    @Override
    public void Bell() {
        System.out.println("门铃响了");
    }
}
