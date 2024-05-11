package classroom.Friend;

public class Test {
    public static void main(String[] args) {
        Friend [] friends = new Friend[2];
        friends[0] = new Chinese("王小强", "练太极拳", "四川菜");
        friends[1] = new Us("约翰", "打橄榄球", "比萨");
        for (Friend friend : friends) {
            if (friend instanceof Us) {
                Friend u = (Us) friend;
                u.invitation();
            }else {
                Friend c = (Chinese) friend;
                c.invitation();
            }
        }
    }
}
