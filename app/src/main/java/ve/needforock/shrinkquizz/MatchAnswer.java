package ve.needforock.shrinkquizz;

/**
 * Created by Soporte on 05-Aug-17.
 */

public class MatchAnswer {
    int userAge;
    int loverAge;

    public MatchAnswer(int userAge, int loverAge) {
        this.userAge = userAge;
        this.loverAge = loverAge;
    }

    public int getUserAge() {
        return userAge;
    }

    public int getLoverAge() {
        return loverAge;
    }
}
