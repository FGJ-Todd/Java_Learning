package examination1.topic6;

public class Test implements Math1 {
    @Override
    public long fact(int m) {
        int sum = 1;
        for (int i = 1; i <= m; i++) {
            sum = sum * i;
        }
        return sum;
    }

    @Override
    public long intPower(int m, int n) {
        for (int i = 0; i < n; i++)
            m = m * m;
        return m;
    }

    @Override
    public boolean findFactor(int m, int n) {
        return m + n > 100;
    }
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.fact(3));
        System.out.println(t.intPower(3,2));
        System.out.println(t.findFactor(50,51));
    }
}
