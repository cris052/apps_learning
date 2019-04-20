package Adapter;

import java.util.List;

import model.FriendListModel;

import zxy.learning.app.R;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FriendsAdapter extends BaseAdapter{
	private List<FriendListModel> mData;
	private Context mContext;
	public FriendsAdapter(Context context, List data) {
		this.mContext = context;
		this.mData = data;
	}
	//决定item显示个数
	public int getCount() {
		// TODO Auto-generated method stub
		return mData.size();
	}
	// 根据position获取对应item的数据
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mData.get(position);
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View view=View.inflate(mContext, R.layout.item_friends, null);
		FriendListModel friend=mData.get(position);
		ImageView iv_avatar=(ImageView) view.findViewById(R.id.iv_avatar);
		ImageView iv_img=(ImageView) view.findViewById(R.id.iv_img);
		TextView txt_nickname=(TextView) view.findViewById(R.id.txt_nickname);
		TextView txt_description=(TextView) view.findViewById(R.id.txt_description);
		TextView txt_time=(TextView) view.findViewById(R.id.txt_time);
		
		//绑定数据到view
		iv_avatar.setImageResource(friend.getAvatar());
		iv_img.setImageResource(friend.getImg());
		txt_nickname.setText(friend.getNickname());
		txt_description.setText(friend.getDescription());
		txt_time.setText(friend.getTime());
		return view;
	}

}
