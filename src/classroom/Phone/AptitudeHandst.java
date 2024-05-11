package classroom.Phone;

public class AptitudeHandst extends Handset implements TheakePictures,Network{
    /**
     * 发送信息。
     * 无参数。
     * 无返回值。
     */
    @Override
    void sendInfo() {
        System.out.println("发送信息中...");
        System.out.println("发送信息成功");
    }

    /**
     * 拨打电话。
     * 无参数。
     * 无返回值。
     */
    @Override
    void call() {
        System.out.println("正在拨通电话");
    }

    /**
     * 接收信息。
     * 无参数。
     * 无返回值。
     */
    @Override
    void info() {
        System.out.println("接收到信息");
    }

    /**
     * 连接到网络。
     * 无参数。
     * 无返回值。
     */
    @Override
    public void networkConn() {
        System.out.println("连接到网络");
    }

    /**
     * 拍照。
     * 无参数。
     * 无返回值。
     */
    @Override
    public void takePictare() {
        System.out.println("拍照");
    }

}
