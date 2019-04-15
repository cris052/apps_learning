package zxy.learning.app;

import activity.AboutActivity;
import activity.BaseActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Apps_zxy_learningActivity extends Activity {
    /** Called when the activity is first created. */
	private Button button1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent=new Intent();
				intent.setClass(Apps_zxy_learningActivity.this, AboutActivity.class);
				startActivity(intent); //´ò¿ªactivity
				
			}
		});
       
    }

}