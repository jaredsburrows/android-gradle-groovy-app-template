package burrows.apps.example.template.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import burrows.apps.example.template.R

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main)
    }
}
