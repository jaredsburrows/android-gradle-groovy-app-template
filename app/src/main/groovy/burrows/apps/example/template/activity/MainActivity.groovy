package burrows.apps.example.template.activity

import android.app.Activity
import android.os.Bundle
import burrows.apps.example.template.R

//import burrows.apps.example.template.fragment.PlaceholderFragment;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 * @since 0.0.1
 */
//public class MainActivity extends AppCompatActivity {
public class MainActivity extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
//        if (savedInstanceState == null) {
//            this.getSupportFragmentManager().beginTransaction()
//                    .add(R.id.container, new PlaceholderFragment())
//                    .commit();
//        }
    }
}