package demo;

public class beer_song {
    public static void main(String[] args) {
        int beerNum= 99;
        String word ="beer";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word="bottle";

                System.out.println(beerNum + "" + word + "of beer on the wall");
                System.out.println(beerNum + " " + word + "of beer");
                System.out.println("Take one down.");
                System.out.println("Pass it around.");
                beerNum = beerNum - 1;

                if (beerNum > 0) {
                    System.out.println(beerNum + "" + word + "of beer");
                } else {
                    System.out.println("No more beer on the wall");
                }
            }
        }
    }
}
