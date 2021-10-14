package rifat;
/*

Name:Moksudul Islam Rifat
Id: 2012020280
section: F
Email:cse_2012020280@lus.ac.bd
Date:12/09/2021

 */
public class Cricket extends Sports{
    String matchType;
    int over;
    Player player;

    public Cricket(String matchType, int over, Player player){
        this.matchType = matchType;
        this.over = over;
        this.player = player;

    }

    void display(){
        System.out.println("Match Type: "+ this.matchType);
        System.out.println("Over: "+ this.over);
        System.out.println("Player Name: "+ this.player.playerName);
        System.out.println("Player Jersey: "+ this.player.jerseyNumber);
    }


}
