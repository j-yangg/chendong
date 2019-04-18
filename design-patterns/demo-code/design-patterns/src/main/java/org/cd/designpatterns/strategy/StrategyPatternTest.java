package org.cd.designpatterns.strategy;

/**
 * @classname: StrategyPatternTest
 * @description:
 * @author: Danny Chen
 * @create: 2019-04-18 23:54
 */
public class StrategyPatternTest {
    public static void main(String[] args) {
        //可以选择动态确定seed
        /*if (args.length != 2) {
            System.out.println("Usage: java Main randomseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);*/
        int seed1 = 314;
        int seed2 = 15;
        Player player1 = new Player("WinningStrategyPlayer", new WinningStrategy(seed1));
        Player player2 = new Player("ProbStrategyPlayer", new ProbStrategy(seed2));
        for (int i = 0; i < 1000 ; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            }else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner: " + nextHand2);
                player1.lose();
                player2.win();
            }else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total Result: ");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
