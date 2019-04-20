package activity;

import java.util.ArrayList;
import java.util.List;

import model.FriendListModel;

import zxy.learning.app.R;
import Adapter.FriendsAdapter;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class FriendsListActivity extends Activity{
	private ListView lv_list;
	private FriendsAdapter mAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view_list);
		lv_list = (ListView) findViewById(R.id.lv_list);
		mAdapter=new FriendsAdapter(this,getData());
		lv_list.setAdapter(mAdapter);
	}
	private List<FriendListModel> getData() {
		// TODO Auto-generated method stub
		List<FriendListModel> list=new ArrayList<FriendListModel>();
		FriendListModel friend1=new FriendListModel();
		friend1.setAvatar(R.drawable.image_user);
		friend1.setNickname("小花");
		friend1.setDescription("好的");
		friend1.setTime("11:30");
		friend1.setImg(R.drawable.a09);
		
		FriendListModel friend2=new FriendListModel();
		friend2.setAvatar(R.drawable.image_user);
		friend2.setNickname("小草");
		friend2.setDescription("马上就给你寄过去。");
		friend2.setTime("13:45");
		friend2.setImg(R.drawable.a09);
		
		list.add(friend1);
		list.add(friend2);
		return list;
	}
}
