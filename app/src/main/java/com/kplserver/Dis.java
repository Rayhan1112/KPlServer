package com.kplserver;

public class Dis {
    private String player1;
    private String player2;
    private String total;
    private String bowler;
    private String matchname;

    public Dis() {
    }

    public Dis(String player1, String player2, String total, String bowler, String matchname) {
        this.player1 = player1;
        this.player2 = player2;
        this.total = total;
        this.bowler = bowler;
        this.matchname = matchname;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getBowler() {
        return bowler;
    }

    public void setBowler(String bowler) {
        this.bowler = bowler;
    }

    public String getMatchname() {
        return matchname;
    }

    public void setMatchname(String matchname) {
        this.matchname = matchname;
    }
}
