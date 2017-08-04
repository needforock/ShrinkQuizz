package ve.needforock.shrinkquizz;

/**
 * Created by Soporte on 03-Aug-17.
 */

public class PartyResult extends PartyAnswer {

    public PartyResult(String answer) {
        super(answer);
    }

    public String score(){
        return processing();
    }

    private String processing(){
        String answer = getAnswer();
        if (answer.contains("Cinco")){
        return "eres un nino";

        } else if (answer.contains("Diez")){

        return "buena";
        } else {
            return "busca ayuda";

        }
    }
}
