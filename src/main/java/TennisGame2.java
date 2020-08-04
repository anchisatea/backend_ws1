public class TennisGame2 {

    public int player1Point;
    public int player2Point;
    private final String player1Name;
    private final String player2Name;


    public TennisGame2(String player1Name, String player2Name) {

        this.player1Name = player1Name;
        this.player2Name = player2Name;

    }

    public String getPoint(int point){
        switch(point){
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
        }
        return "Forty";
    }

    public String getScore(){
        String player1Result = "";
        String player2Result = "";
        String score = "";

        if (player1Point == player2Point && player1Point < 4) {
            score = getPoint(player1Point);
            score += "-All";

        }

        if (player1Point == player2Point && player1Point >=3)
            score = "Deuce";

        if (player1Point > 0 && player2Point ==0) {

            player1Result = getPoint(player1Point);
            player2Result = "Love";
            score = player1Result + "-" + player2Result;

        }

        if (player2Point > 0 && player1Point ==0)
        {
            player2Result = getPoint(player2Point);
            player1Result = "Love";
            score = player1Result + "-" + player2Result;

        }

        if (player1Point > player2Point && player1Point < 4)
        {
            player1Result = getPoint(player1Point);
            player2Result = getPoint(player2Point);
            score = player1Result + "-" + player2Result;

        }

        if (player2Point > player1Point && player2Point < 4)
        {

            player2Result = getPoint(player2Point);
            player1Result = getPoint(player1Point);
            score = player1Result + "-" + player2Result;

        }

        if (player1Point > player2Point && player2Point >= 3)
        {
            score = "Advantage " + player1Name;
        }

        if (player2Point > player1Point && player1Point >= 3)
        {
            score = "Advantage " + player2Name;
        }

        if (player1Point >=4 && player2Point >=0 && (player1Point - player2Point)>=2)
        {
            score = "Win for " + player1Name;
        }

        if (player2Point >=4 && player1Point >=0 && (player2Point - player1Point)>=2)
        {
            score = "Win for "+ player2Name;
        }

        return score;

    }

/*    public void SetP1Score(int number){

        for (int i = 0; i < number; i++)
        {
            P1Score();
        }

    }


    public void SetP2Score(int number){

        for (int i = 0; i < number; i++)
        {
            P2Score();
        }
    }
*/

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