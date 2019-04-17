package activity;

import zxy.learning.app.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class LoginActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	private TextView tv_register;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv_register=(TextView) findViewById(R.id.tv_register);
        tv_register.setOnClickListener(this);
        
    }
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.tv_register:
			Intent intent=new Intent();
			intent.setClass(this,SettingActivity.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}

}