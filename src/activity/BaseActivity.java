package activity;

import zxy.learning.app.R;
import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_manager);
    }
    
}