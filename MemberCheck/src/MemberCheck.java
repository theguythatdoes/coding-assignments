import java.util.*;
public class MemberCheck {
    public String[] whosDishonest(String[] club1,
                                  String[] club2,
                                  String[] club3){
        TreeSet<String>ret=new TreeSet<>();
        Set<String>dishonest1=helper(club1,club3);
        Set<String>dishonest2=helper(club1,club2);
        Set<String>dishonest3=helper(club2,club3);


        ret.addAll(dishonest1);
        ret.addAll(dishonest2);
        ret.addAll(dishonest3);
        return ret.toArray(new String[0]);

       /* String[] fakePPL=new String[nClub1.size()];
        nClub1.toArray(fakePPL);
        return fakePPL;*/



    }
    public Set<String> helper(String[]newclub1,String[]newclub2){
        HashSet<String>nc1=new HashSet<String>(Arrays.asList(newclub1));
        HashSet<String>nc2=new HashSet<String>(Arrays.asList(newclub2));
        nc1.retainAll(nc2);
        return nc1;


    }

}
