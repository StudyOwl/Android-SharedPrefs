package in.studyowl.android_sharedprefs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final EditText editText = (EditText) findViewById(R.id.editText);
    Button decrBtn = (Button) findViewById(R.id.decrement);
    Button incrBtn = (Button) findViewById(R.id.increment);
    Button storeBtn = (Button) findViewById(R.id.storeBtn);
    View.OnClickListener listener = new View.OnClickListener() {
      @Override public void onClick(View v) {
        // get the text from edittext
        String value = editText.getText().toString();
        // convert it to integer
        int counter = Integer.parseInt(value);
        if (v.getId() == R.id.decrement) {
          // if decrement is clicked
          counter--;
        } else if (v.getId() == R.id.increment) {
          // if increment is clicked
          counter++;
        } else if (v.getId() == R.id.storeBtn) {
          // if store button is clicked
          Toast.makeText(MainActivity.this, "asd", Toast.LENGTH_SHORT).show();
        }
        // finally set it back to the editText
        editText.setText(String.valueOf(counter));
      }
    };

    decrBtn.setOnClickListener(listener);
    incrBtn.setOnClickListener(listener);
    storeBtn.setOnClickListener(listener);
  }
}
