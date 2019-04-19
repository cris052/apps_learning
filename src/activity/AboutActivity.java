package activity;


import zxy.learning.app.R;
import android.app.Activity;
//import android.content.Intent;
//import android.net.Uri;
import android.os.Bundle;
//import android.view.View;
//import android.view.View.OnClickListener;
//import android.widget.TextView;

public class AboutActivity extends Activity{
//	private TextView tv_01;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_us);
//		tv_01=(TextView) findViewById(R.id.tv_01);
//		tv_01.setOnClickListener(new OnClickListener() {
//			
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				String phonenumber=tv_01.getText().toString();
//				Intent intent=new Intent();
//				intent.setAction("android.intent.action.CALL");
//				intent.addCategory("android.intent.category.DEFAULT");
//				intent.setData(Uri.parse(phonenumber));
//				startActivity(intent);
//			}
//		});
	}
}
