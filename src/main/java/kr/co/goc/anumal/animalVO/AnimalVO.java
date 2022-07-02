package kr.co.goc.anumal.animalVO;

public class AnimalVO {
	private int userNum;
	private String userName;
	private String phoneNum;
	private String nickname;
	private String password;
	
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getNickName() {
		return nickname;
	}
	public void setNickName(String nickName) {
		this.nickname = nickName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AnimalVO [userNum=" + userNum + ", userName=" + userName + ", phoneNum=" + phoneNum + ", nickName="
				+ nickname + ", password=" + password + "]";
	}
	
	
}
