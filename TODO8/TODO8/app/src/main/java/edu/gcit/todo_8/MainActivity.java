package edu.gcit.todo_8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText meditText, neditText, oeditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        meditText = findViewById(R.id.editText1);
        neditText = findViewById(R.id.editText2);
        oeditText = findViewById(R.id.editText3);
    }

    public void brower(View view) {
        String txt = meditText.getText().toString();
        Uri url = Uri.parse(txt);
        Intent obj =new Intent(Intent.ACTION_VIEW, url);
        if (obj.resolveActivity(getPackageManager()) != null){
            startActivity(obj);
        }
        else {
            Log.d("ImplicitIntent","ERROR");
        }
    }

    public void location(View view) {
        String text = neditText.getText().toString();
        Uri url = Uri.parse("geo:0,0?q="+text);
        Intent obj =new Intent(Intent.ACTION_VIEW, url);
        if (obj.resolveActivity(getPackageManager()) != null){
            startActivity(obj);
        }
        else {
            Log.d("ImplicitIntent","ERROR");
        }
    }

    public void share(View view) {
        String text = oeditText.getText().toString();
        String mimeType = "text/plain";
        ShareCompat.IntentBuilder
                .from(this)
                .setType(mimeType)
                .setChooserTitle("Share this text with")
                .setText(text)
                .startChooser();
    }
}