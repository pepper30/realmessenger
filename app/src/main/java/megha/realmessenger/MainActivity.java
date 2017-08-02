package megha.realmessenger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {
public void onSendMessage(View view){
    EditText textView=(EditText) findViewById(R.id.message);
    String textMessage =textView.getText().toString();
    Intent intent =new Intent(Intent.ACTION_SEND);
intent.setType("text/plain");
    intent.putExtra(Intent.EXTRA_TEXT,textMessage);
    String choserTitle=getString(R.string.chooser);
    Intent chose=Intent.createChooser(intent,"send message....");
            startActivity(chose);
}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
}
}
