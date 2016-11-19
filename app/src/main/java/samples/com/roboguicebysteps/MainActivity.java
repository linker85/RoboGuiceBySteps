package samples.com.roboguicebysteps;

import android.os.Bundle;
import android.widget.TextView;

import com.google.inject.Inject;

import roboguice.activity.RoboActionBarActivity;
import roboguice.inject.ContentView;
import roboguice.inject.InjectView;

@ContentView(R.layout.activity_main)
public class MainActivity extends RoboActionBarActivity {

    @InjectView(R.id.atext_id)
    public TextView atextId;

    @Inject
    public User user; // this will basically call new Foo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        user.setName("Injected with Roboguice");

        atextId.setText(user.getName());
    }
}
