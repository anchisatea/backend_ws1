public class TennisGame2 {

    public int player1Point;
    public int player2Point;
    private final String player1Name;
    private final String player2Name;


    public TennisGame2(String player1Name, String player2Name) {

        this.player1Name = player1Name;
        this.player2Name = player2Name;

    }

    public String getScore() {
        String[] textScores = {"Love", "Fifteen", "Thirty", "Forty"};
        String player1Result = "";
        String player2Result = "";

        String score = "";


        // เสมอกัน
        boolean drawScore = player1Point == player2Point && player1Point < 3;
        if (drawScore) {
           // score = textScores[player1Point];
            // score += "-All";
            return textScores[player1Point] + "-All";
        }

        //Deuce
        boolean deuceScore = player1Point == player2Point && player1Point >= 3;
        if (deuceScore) {
            return "Deuce";
        }

        //winner
        boolean player1Win = player1Point >= 4 && player2Point >= 0 && (player1Point - player2Point) >= 2;
        if (player1Win) {
            return "Win for " + player1Name;
        }

        boolean player2Win = player2Point >= 4 && player1Point >= 0 && (player2Point - player1Point) >= 2;
        if (player2Win) {
            return "Win for " + player2Name;
        }

        //Advantage
        boolean player1Advantage = player1Point > player2Point && player2Point >= 3;
        if (player1Advantage) {
            return "Advantage " + player1Name;
        }

        boolean player2Advantage = player2Point > player1Point && player1Point >= 3;
        if (player2Advantage) {
            return "Advantage " + player2Name;
        }

       return textScores[player1Point] + "-" + textScores[player2Point];
    }

    public void p1Score(){
        player1Point++;
    }

    public void p2Score(){
        player2Point++;

    }

    public void wonPoint(String player) {
        if ("player1".equals(player)) {
            p1Score();
        }
        else {
            p2Score();
        }
    }
}