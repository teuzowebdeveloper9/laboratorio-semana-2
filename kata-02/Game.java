public class Game {

    public String winner(String[] deckSteve, String[] deckJosh) {

        String cards = "23456789TJQKA";

        int stevePoints = 0;
        int joshPoints = 0;

        for (int i = 0; i < deckSteve.length; i++) {

            int steveCard = cards.indexOf(deckSteve[i]);
            int joshCard = cards.indexOf(deckJosh[i]);

            if (steveCard > joshCard) {
                stevePoints++;
            } else if (joshCard > steveCard) {
                joshPoints++;
            }

        }

        if (stevePoints > joshPoints) {
            return "Steve wins " + stevePoints + " to " + joshPoints;
        } else if (joshPoints > stevePoints) {
            return "Josh wins " + joshPoints + " to " + stevePoints;
        }

        return "Tie";
    }

    public static void main(String[] args) {
        String steve = args.length == 2 ? args[0] : "A78";
        String josh = args.length == 2 ? args[1] : "K59";

        String result = new Game().winner(steve.split(""), josh.split(""));

        System.out.println("Steve: " + steve + " | Josh: " + josh + " => " + result);
    }
}
