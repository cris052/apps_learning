package activity;

import zxy.learning.app.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class PaymentActivity extends Activity implements OnClickListener{
	private TextView TextView10;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_three);
		TextView10.setOnClickListener(this);
		TextView10=(Button) findViewById(R.id.TextView10);
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.TextView10:
			Intent intent1=new Intent();
			intent1.setClass(this,ThreeActivity.class);
			startActivity(intent1);
			break;
		default:
			break;
		}
	}
}