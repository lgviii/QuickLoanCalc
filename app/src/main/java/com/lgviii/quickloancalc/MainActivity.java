package com.lgviii.quickloancalc;

import android.app.Dialog;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    EditText loanInterestRate;
    EditText loanAmount;
    EditText loanDuration;
    TextView result;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loanInterestRate = (EditText) findViewById(R.id.edit_loanInterestRateYear);
        loanInterestRate.setText("0");
        loanAmount = (EditText) findViewById(R.id.edit_loanAmount);
        loanAmount.setText("0");
        loanDuration = (EditText) findViewById(R.id.edit_loanDurationMonths);
        loanDuration.setText("0");


        /*final Dialog dialog = new Dialog(this); // Context, this, etc.
        dialog.setTitle(R.string.app_name);
        dialog.show();*/



        loanDuration.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("Calculate Button", "loanInterestRate: " + loanInterestRate.getText().toString() + ",loanAmount: " + loanAmount.getText().toString() + ",loanDuration: " + loanDuration.getText().toString());

                Float amount = new Float(1);
                Float interestRate = new Float(1);
                Float durationInMonths = new Float(1);

                String loanInterestRateString = loanInterestRate.getText().toString();
                if (loanInterestRateString != null && loanInterestRateString.length() != 0) {
                    amount = Float.parseFloat(loanInterestRate.getText().toString());
                }
                String loanAmountString = loanAmount.getText().toString();
                if (loanAmountString != null && loanAmountString.length() != 0) {
                    interestRate = Float.parseFloat(loanAmount.getText().toString());
                }
                String loanDurationString = loanDuration.getText().toString();
                if (loanDurationString != null && loanDurationString.length() != 0) {
                    durationInMonths = Float.parseFloat(loanDuration.getText().toString());
                }
                Float calculation = amount * interestRate * durationInMonths; // just a test calculation
                result = (EditText) findViewById(R.id.monthlyPayment);
                String resultString = calculation.toString();
                result.setText(resultString);
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });

        loanInterestRate.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d("Calculate Button", "loanInterestRate: " + loanInterestRate.getText().toString() + ",loanAmount: " + loanAmount.getText().toString() + ",loanDuration: " + loanDuration.getText().toString());

                Float amount = new Float(1);
                Float interestRate = new Float(1);
                Float durationInMonths = new Float(1);

                String loanInterestRateString = loanInterestRate.getText().toString();
                if (loanInterestRateString != null && loanInterestRateString.length() != 0) {
                    amount = Float.parseFloat(loanInterestRate.getText().toString());
                }
                String loanAmountString = loanAmount.getText().toString();
                if (loanAmountString != null && loanAmountString.length() != 0) {
                    interestRate = Float.parseFloat(loanAmount.getText().toString());
                }
                String loanDurationString = loanDuration.getText().toString();
                if (loanDurationString != null && loanDurationString.length() != 0) {
                    durationInMonths = Float.parseFloat(loanDuration.getText().toString());
                }
                Float calculation = amount * interestRate * durationInMonths; // just a test calculation
                result = (EditText) findViewById(R.id.monthlyPayment);
                String resultString = calculation.toString();
                result.setText(resultString);
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.lgviii.quickloancalc/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.lgviii.quickloancalc/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
