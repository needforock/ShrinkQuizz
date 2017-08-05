package ve.needforock.shrinkquizz;

/**
 * Created by Soporte on 05-Aug-17.
 */

public class MatchResult extends MatchAnswer {

    public MatchResult(int user, int lover) {
        super(user, lover);
    }

    public String score(){
    return processing();
    }

    private String processing(){
        int userAge = getUserAge();
        int loverAge = getLoverAge();

        if (userAge>loverAge){
            return "Te Gustan mas Jovenes";
        }else if (userAge<loverAge){
            return "Te gustan mayores";
        }else {
            return "Pareja Perfecta";
        }
    }
}
