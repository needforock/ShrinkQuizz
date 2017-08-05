package ve.needforock.shrinkquizz;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class LuckyFragment extends Fragment {


    public LuckyFragment() {
        // Required empty public constructor
    }

    public static LuckyFragment newInstance() {
        return new LuckyFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lucky, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CheckBox happy = (CheckBox) view.findViewById(R.id.happyCb);
        final CheckBox mood = (CheckBox) view.findViewById(R.id.moodCb);
        Button luckyBtn = (Button) view.findViewById(R.id.luckyBtn);

        happy.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                mood.setChecked(isChecked);
            }
        });

        luckyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean answer = mood.isChecked();
                dialog(answer);

            }
        });
    }

    public void dialog (boolean answer){

        AlertDialog.Builder alertDialogLucky= new AlertDialog.Builder(getActivity());
        alertDialogLucky.setTitle("Tu estado de animo");
        alertDialogLucky.setMessage(new LuckyResult(answer).luckyScore());
        alertDialogLucky.setPositiveButton("yeah", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialogLucky.show();

    }
}
