public class InvitePeople {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(ways(n));
    }
    public static int ways(int n) {
        if(n <= 1)
            return 1;
        int single = ways(n-1);
        int pair = (n-1) * ways(n-2);
        return single + pair;
    }
}
