import java.util.*;
public class VoteRigging {
    //we have a guy we want to win an election so  how do we do it?
    public int minimumVotes(int[] votes) {
        // we take a look at the minimum number of votes my candidate needs
        int req = 0;
        //we start it off at zero and we will edit it later
        int winner = getMax(votes);
        // we check to see who has the max # of votes in the int array votes
        // we want the person in position 0 to win
        while (winner != 0) {
            //while  the winner is not equal to the person in position 0 we just steal votes
            // then we add those votes to the person in position 0
            // we can only steal as many votes such that the winner is no longer in first place
            //the amount of votes we stole are added to the requried votes
            // then we check to see who the winner still is
            votes[winner]--;
            votes[0]++;
            req++;
            winner = getMax(votes);
        }
        return req;
        // this is the smallest number of votes needed to win this thing
    }
    public int getMax(int[] vote){
        int max=0;
        int ind=0;
        for(int i=0;i<vote.length;++i){
            if(max<=vote[i]){
                max=vote[i];
                ind=i;
            }


        }
        return ind;

    }

}
