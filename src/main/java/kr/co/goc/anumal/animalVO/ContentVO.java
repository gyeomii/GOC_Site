package kr.co.goc.anumal.animalVO;

public class ContentVO {
	private String agreement;
	private String post;
	
	public String getAgreement() {
		return agreement;
	}
	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	
	@Override
	public String toString() {
		return "ContentVO [agreement=" + agreement + ", post=" + post + "]";
	}
}
