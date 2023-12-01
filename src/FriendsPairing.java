public class FriendsPairing {
    static int friendPairing(int n){
        if (n==1 || n==2){
            return n;
        }
        // choice
        // single
        int friendsParing1 = friendPairing(n-1);

        // pair
        int friendsParing2 = friendPairing(n-2);
        int pairWays = (n-1) * friendsParing2;

        // total ways
        return friendsParing1 + pairWays;

    }
    public static void main(String[] args) {
        System.out.println(friendPairing(3));
    }

}
