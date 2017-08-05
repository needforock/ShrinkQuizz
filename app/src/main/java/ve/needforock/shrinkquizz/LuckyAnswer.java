package ve.needforock.shrinkquizz;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Soporte on 05-Aug-17.
 */

public class LuckyAnswer {
    private boolean choice;
    private boolean luckyDay = new LuckyDate().randomBooleanDate();

    public LuckyAnswer(boolean choice) {
        this.choice = choice;
    }

    public boolean getChoice() {
        return choice;
    }

    public boolean getLuckyDay() {
        return luckyDay;
    }

    private class LuckyDate{

        private boolean randomBooleanDate() {

            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd");
            int day = Integer.parseInt(simpleDateFormat.format(date));

            if (day%5 == 0){
                return true;
            }else
                return false;

        }
    }
}
