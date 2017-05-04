package zhenya.workshop_9;

public class Game {

    private static final int ROUNDS_AMOUNT = 5;
    private static final int RANGE = 20;

    public static void main(String[] args) {
        Bot bot = new Bot("Bobby");
        RealPerson person = new RealPerson("John");

        bot.initScoreTable(ROUNDS_AMOUNT);
        person.initScoreTable(ROUNDS_AMOUNT);

        playGame(person, bot, ROUNDS_AMOUNT, RANGE);
        defineWinner(person, bot);
    }

    private static void playGame(RealPerson person, Bot bot, int rounds, int range) {

        System.out.println("Game starts now! " + person.getName() + " vs bot " + bot.getName() + "\n");
        System.out.println("Rounds: " + rounds + "\n");

        for (int i = 1; i <= rounds; i++) {
            System.out.println("Round " + i);
            playRound(person, bot, i - 1, range);
        }
    }

    private static void playRound(RealPerson person, Bot bot, int roundNumber, int range) {
        int personInput = person.typeRandomInt(range);
        int botInput = bot.typeRandomInt(range);

        if (personInput > range) {
            person.fillInScoreTable(roundNumber, false);
            bot.fillInScoreTable(roundNumber, true);
            System.out.println("Cheater detected! " + person.getName() + " loses, " + bot.getName() + " wins\n");
        }
        else if (personInput == botInput || Math.abs(personInput - botInput) > 5) {
            person.fillInScoreTable(roundNumber, false);
            bot.fillInScoreTable(roundNumber, false);
            System.out.println("Nobody won. Numbers are equal or difference is more than 5\n");
        }
        else if (personInput > botInput) {
            person.fillInScoreTable(roundNumber, true);
            bot.fillInScoreTable(roundNumber, false);
            System.out.println(person.getName() + " is winner in this round\n");
        }
        else {
            person.fillInScoreTable(roundNumber, false);
            bot.fillInScoreTable(roundNumber, true);
            System.out.println(bot.getName() + " is winner in this round\n");
        }
    }

    private static void defineWinner(RealPerson person, Bot bot) {
        int personWinsAmount = person.getWinsAmountFromScoreTable();
        int botWinsAmount = bot.getWinsAmountFromScoreTable();

        if (personWinsAmount > botWinsAmount) {
            System.out.println("With score " + personWinsAmount + ":" + botWinsAmount + " won " + person.getName());
        }
        else if (botWinsAmount > personWinsAmount) {
            System.out.println("With score " + botWinsAmount + ":" + personWinsAmount + " won " + bot.getName());
        }
        else {
            System.out.println("With score " + personWinsAmount + ":" + botWinsAmount + " nobody won");
        }
    }
}
