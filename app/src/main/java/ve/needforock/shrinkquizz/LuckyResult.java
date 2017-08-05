package ve.needforock.shrinkquizz;

/**
 * Created by Soporte on 05-Aug-17.
 */

public class LuckyResult extends LuckyAnswer {

    public LuckyResult(boolean choice) {
        super(choice);
    }

    public String luckyScore() {
        return processingChoice() + processingDay();
    }

    private String processingChoice() {
        boolean choice = getChoice();
        if (choice) {
            return "Esa es la Actitud";
        } else {
            return "Animate";
        }

    }

    private String processingDay() {
        boolean luckyDay = getLuckyDay();
        if (luckyDay) {
            return " y es tu dia de suerte!";
        } else {
            return " vendran mejores tiempos :)";
        }
    }
}
