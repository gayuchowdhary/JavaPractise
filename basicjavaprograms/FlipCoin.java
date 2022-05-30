public class FlipCoin {
    public static void main(String[] args) {
        int coin=(int)((Math.random()*10)%2)+1;
        if(coin==1)
            System.out.println("tails");
        else
            System.out.println("heads");
    }
}
