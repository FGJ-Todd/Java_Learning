package classroom.door;

public class AntiTheftDoor extends door implements Lock,doorbell{
    @Override
    public void lock() {
        System.out.println("��������");
    }

    @Override
    public void unlock() {
        System.out.println("�Ž�����");
    }

    @Override
    void open() {
        System.out.println("�Ŵ���");
    }

    @Override
    void close() {
        System.out.println("�Ź�����");
    }

    @Override
    public void Bell() {
        System.out.println("��������");
    }
}
