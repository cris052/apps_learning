package zxy.learning.app;

import activity.AboutActivity;
import activity.BaseActivity;
import activity.BestHeadActivity;
import activity.ExamActivity;
import activity.FamousBookActivity;
import activity.FindPwdActivity;
import activity.LoginActivity;
import activity.MyDownloadActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Apps_zxy_learningActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button3=(Button) findViewById(R.id.button3);
        button4=(Button) findViewById(R.id.button4);
        button5=(Button) findViewById(R.id.button5);
        button6=(Button) findViewById(R.id.button6);
        button7=(Button) findViewById(R.id.button7);
        button8=(Button) findViewById(R.id.button8);
        button9=(Button) findViewById(R.id.button9);
//        button1.setOnClickListener(new OnClickListener() {
//			
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Intent intent=new Intent();
//				intent.setClass(Apps_zxy_learningActivity.this, AboutActivity.class);
//				startActivity(intent); //´ò¿ªactivity
//				
//			}
//		});
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);   
    }
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			Intent intent=new Intent();
			intent.setClass(this,AboutActivity.class);
			startActivity(intent);
			break;
		case R.id.button2:
			Intent intent2=new Intent();
			intent2.setClass(this,BestHeadActivity.class);
			startActivity(intent2);
			break;
		case R.id.button3:
			Intent intent3=new Intent();
			intent3.setClass(this,BaseActivity.class);
			startActivity(intent3);
			break;
		case R.id.button4:
			Intent intent4=new Intent();
			intent4.setClass(this,ExamActivity.class);
			startActivity(intent4);
			break;
		case R.id.button5:
			Intent intent5=new Intent();
			intent5.setClass(this,FamousBookActivity.class);
			startActivity(intent5);
			break;
		case R.id.button6:
			Intent intent6=new Intent();
			intent6.setClass(this,FindPwdActivity.class);
			startActivity(intent6);
			break;
		case R.id.button7:
			Intent intent7=new Intent();
			intent7.setClass(this,BaseActivity.class);
			startActivity(intent7);
			break;
		case R.id.button8:
			Intent intent8=new Intent();
			intent8.setClass(this,LoginActivity.class);
			startActivity(intent8);
			break;
		case R.id.button9:
			Intent intent9=new Intent();
			intent9.setClass(this,MyDownloadActivity.class);
			startActivity(intent9);
			break;
		default:
			break;
		}
	}

}