package zxy.learning.app;

import java.util.ArrayList;
import java.util.List;

import Adapter.ViewPagerAdapter;
import activity.AboutActivity;
import activity.BaseActivity;
import activity.BestHeadActivity;
import activity.ExamActivity;
import activity.FamousBookActivity;
import activity.FindPwdActivity;
import activity.FriendsListActivity;
import activity.LoginActivity;
import activity.MyDownloadActivity;
import activity.PaymentActivity;
import activity.SychActivity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Apps_zxy_learningActivity extends Activity implements OnPageChangeListener,OnClickListener {
    /** Called when the activity is first created. */
	private ImageView[] points;
	private LinearLayout ll;
	private int currentPoint;
	private Button button1;
	private Button button2;
	private Button button3;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private ViewPager viewpager;
	private List<View> views;
	private int[] guideImages={R.drawable.a01,R.drawable.a02,
			R.drawable.a03,R.drawable.a04};
	private ViewPagerAdapter adapter;
	
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
        initView();
        initData();
       
//        button1.setOnClickListener(new OnClickListener() {
//			
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Intent intent=new Intent();
//				intent.setClass(Apps_zxy_learningActivity.this, AboutActivity.class);
//				startActivity(intent); //打开activity
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
		case R.id.image1:
			viewpager.setCurrentItem(0);
			break;
		case R.id.image2:
			viewpager.setCurrentItem(1);
			break;
		case R.id.image3:
			viewpager.setCurrentItem(2);
			break;
		case R.id.image4:
			viewpager.setCurrentItem(3);
			break;
		case R.id.button1:
			Intent intent=new Intent();
			intent.setClass(this,SychActivity.class);
			startActivity(intent);
			break;
		case R.id.button2:
			Intent intent2=new Intent();
			intent2.setClass(this,PaymentActivity.class);
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
			intent6.setClass(this,ExamActivity.class);
			startActivity(intent6);
			break;
		case R.id.button7:
			Intent intent7=new Intent();
			intent7.setClass(this,MyDownloadActivity.class);
			startActivity(intent7);
			break;
		case R.id.button8:
			Intent intent8=new Intent();
			intent8.setClass(this,AboutActivity.class);
			startActivity(intent8);
			break;
		case R.id.button9:
			Intent intent9=new Intent();
			intent9.setClass(this,AboutActivity.class);
			startActivity(intent9);
			break;
		default:
			break;
		}
		
	}
	
	private void initView(){
    	ll = (LinearLayout) findViewById(R.id.ll);
    	viewpager=(ViewPager) findViewById(R.id.viewpager);
				// TODO Auto-generated method stub	
    	views=new ArrayList<View>();
    	adapter=new ViewPagerAdapter(views);
    }
	
    private void initData(){
    	LayoutParams layoutParams=new LayoutParams(LayoutParams.MATCH_PARENT,
    			LayoutParams.MATCH_PARENT);
    	for(int i:guideImages){
    		ImageView imageview=new ImageView(this);
    		imageview.setImageResource(i);
    		imageview.setLayoutParams(layoutParams);
    		views.add(imageview);
    	}
    	initPoint();
    	viewpager.setAdapter(adapter);
    	viewpager.setOnPageChangeListener(this);
    }
	/** 初始化圆点 */
	private void initPoint() {
		points = new ImageView[guideImages.length];
		// 全部圆点初始化为未选中状态
		for (int i = 0; i < ll.getChildCount(); i++) {
			points[i] = (ImageView) ll.getChildAt(i);
			points[i].setImageResource(R.drawable.page_indicator_unfocused);
			points[i].setOnClickListener(this);
			
		}
		currentPoint = 0;
		points[currentPoint].setImageResource(R.drawable.page_indicator_focused);
	}
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}
	public void onPageSelected(int position) {
		// TODO Auto-generated method stub
		setCurrentPoint(position);
	}
	private void setCurrentPoint(int position) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ll.getChildCount(); i++) {
			points[i] = (ImageView) ll.getChildAt(i);
			points[i].setImageResource(R.drawable.page_indicator_unfocused);
		}
		points[position].setImageResource(R.drawable.page_indicator_focused);
	}


}