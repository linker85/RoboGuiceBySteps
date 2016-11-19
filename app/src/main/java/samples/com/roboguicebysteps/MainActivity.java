package samples.com.roboguicebysteps;

import android.os.Bundle;
import android.widget.TextView;

import roboguice.activity.RoboActionBarActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.activity_main)
public class MainActivity extends RoboActionBarActivity {

    @InjectView(R.id.atext_id)
    public TextView atextId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        atextId.setText("Injected with Roboguice");
    }
}
