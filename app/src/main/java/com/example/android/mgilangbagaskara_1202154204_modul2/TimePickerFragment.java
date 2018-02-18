package com.example.android.mgilangbagaskara_1202154204_modul2;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.format.DateFormat;

import java.util.Calendar;

/**
 * Created by ROG on 18/02/2018.
 */

public class TimePickerFragment extends android.support.v4.app.DialogFragment
        implements TimePickerDialog.OnTimeSetListener  {
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Melakukan waktu default
        final Calendar c = Calendar.getInstance();
        int jam = c.get(Calendar.HOUR_OF_DAY);
        int menit = c.get(Calendar.MINUTE);

        // Membuat Time PickerDialog
        return new TimePickerDialog(getActivity(), this, jam, menit,
                DateFormat.is24HourFormat(getActivity()));
    }

    @Override
    public void onTimeSet(android.widget.TimePicker timePicker, int i, int i1) {

        // Melakukan set pada Take Away
        TakeAway activity = (TakeAway) getActivity();
        // Invoke Main Activity's processTimePickerResult() method.
        activity.processTimePickerResult(i, i1);
    }
}

