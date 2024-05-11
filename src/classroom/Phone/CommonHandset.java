package classroom.Phone;

public class CommonHandset extends Handset implements PlayWiring{
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
     * 播放音乐。
     * @param inconter 音乐名称或标识。
     * 无返回值。
     */
    @Override
    public void play(String inconter) {
        System.out.println("播放音乐");
    }
}
