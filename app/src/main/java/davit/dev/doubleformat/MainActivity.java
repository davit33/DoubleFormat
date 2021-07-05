package davit.dev.doubleformat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tvDouble = findViewById(R.id.tv_double);
        String test = new DoubleFormat().getDoubleFormat(tvDouble.toString());
        Toast.makeText(this, test, Toast.LENGTH_SHORT).show();
    }
}