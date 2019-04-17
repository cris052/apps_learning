package activity;

import zxy.learning.app.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ExamActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	private Button button1;
	private Button button2;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_account);
        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        
    }
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			Intent intent=new Intent();
			intent.setClass(this,ChargeActivity.class);
			startActivity(intent);
			break;
		case R.id.button2:
			Intent intent2=new Intent();
			intent2.setClass(this,BestHeadActivity.class);
			startActivity(intent2);
			break;
		default:
			break;
		}
	}

}