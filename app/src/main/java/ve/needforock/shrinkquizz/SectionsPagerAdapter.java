package ve.needforock.shrinkquizz;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Soporte on 31-Jul-17.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return PartyFragment.newInstance();
            case 1:
                return MatchFragment.newInstance();
            case 2:
                return LuckyFragment.newInstance();
        }
        return PartyFragment.newInstance();
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Party";
            case 1:
                return "Match";
            case 2:
                return "Lucky";
        }
        return null;
    }
}
