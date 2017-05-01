package zhenya.workshop_9;

public class Player {

    private String name;
    private boolean[] scoreTable;

    public Player(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void initScoreTable(int roundsAmount) {
        scoreTable = new boolean[roundsAmount];
    }

    public void fillInScoreTable(int roundNumber, boolean isWinner) {
        scoreTable[roundNumber] = isWinner;
    }

    public int getWinsAmountFromScoreTable() {
        int winsAmount = 0;

        for (int i = 0; i < scoreTable.length; i++) {
            if (scoreTable[i]) {
                winsAmount = winsAmount + 1;
            }
        }
        return winsAmount;
    }
}
