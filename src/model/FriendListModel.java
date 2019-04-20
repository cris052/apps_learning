package model;

public class FriendListModel {
		// 头像的资源ID
		private int avatar;
		// 昵称
		private String nickname;
		// 个性签名（描述）
		private String description;
		//右照片
		private int img;
		private String time;
		public int getAvatar() {
			return avatar;
		}

		public void setAvatar(int avatar) {
			this.avatar = avatar;
		}

		public String getNickname() {
			return nickname;
		}

		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public int getImg() {
			return img;
		}

		public void setImg(int img) {
			this.img = img;
		}
}
