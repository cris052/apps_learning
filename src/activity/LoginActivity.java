package activity;

import zxy.learning.app.Apps_zxy_learningActivity;
import zxy.learning.app.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	private TextView tv_register;
	private Button btn_home;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv_register=(TextView) findViewById(R.id.tv_register);
        btn_home=(Button) findViewById(R.id.btn_home);
        tv_register.setOnClickListener(this);
        btn_home.setOnClickListener(this);
    }
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.tv_register:
			Intent intent=new Intent();
			intent.setClass(this,SettingActivity.class);
			startActivity(intent);
			break;
		case R.id.btn_home:
			Intent intent2=new Intent();
			intent2.setClass(this,Apps_zxy_learningActivity.class);
			startActivity(intent2);
			break;
		default:
			break;
		}
	}

}