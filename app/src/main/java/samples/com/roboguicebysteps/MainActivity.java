package samples.com.roboguicebysteps;

import android.os.Bundle;
import android.widget.TextView;

import roboguice.activity.RoboActionBarActivity;
import roboguice.inject.InjectView;

public class MainActivity extends RoboActionBarActivity {

    @InjectView(R.id.atext_id)
    public TextView atextId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        atextId.setText("Injected with Roboguice");
    }
}
