package activity;


import zxy.learning.app.Apps_zxy_learningActivity;
import zxy.learning.app.R;
import android.app.Activity;
import android.content.Intent;
//import android.content.Intent;
//import android.net.Uri;
import android.os.Bundle;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutActivity extends Activity implements OnClickListener{
//	private TextView tv_01;
	private ImageView iv_title;
	private TextView tv_intr;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_us);
		iv_title=(ImageView) findViewById(R.id.iv_title);
        iv_title.setOnClickListener(this);
        tv_intr=(TextView) findViewById(R.id.tv_intr);
        tv_intr.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.iv_title:
			Intent intent1=new Intent();
			intent1.setClass(this,Apps_zxy_learningActivity.class);
			startActivity(intent1);
			break;
		case R.id.tv_intr:
			Intent intent2=new Intent();
			intent2.setClass(this,FindPwdActivity.class);
			startActivity(intent2);
			break;
		default:
			break;
		}
	}
}
