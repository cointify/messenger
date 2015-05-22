package org.cointify.messenger;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class CreateMessageActivity extends ActionBarActivity {

    public static final String USER_MESSAGE = CreateMessageActivity.class.getCanonicalName() + ".MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_create_message, menu);
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

    public void onClickSendMessage(View view) {
//        Intent intent = new Intent(this, ReceiveMessageActivity.class);
//
//        EditText editText = (EditText) findViewById(R.id.message);
//        String message = String.valueOf(editText.getText());
//
//        intent.putExtra(USER_MESSAGE, message);
//        startActivity(intent);

        Intent intent = new Intent(Intent.ACTION_SEND);

        EditText editText = (EditText) findViewById(R.id.message);
        String message = String.valueOf(editText.getText());

        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, message);

        startActivity(intent);
    }
}
