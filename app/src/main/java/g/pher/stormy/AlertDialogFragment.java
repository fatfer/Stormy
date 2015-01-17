package g.pher.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by Fer on 1/17/2015.
 */
public class AlertDialogFragment extends DialogFragment{

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle("Sorry!")
                .setMessage("There was an error. Please try again.")
                .setPositiveButton("Ok", null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
