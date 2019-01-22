package member.model2;

public class Member2 {
	// 한명의 회원정보를 저장하는 클래스
	private String id;
	private String pwd;
	private String name;
	private String tel;
	private String addr;
	private String birth;
	private String job;
	private String gender;
	private String email;
	private String intro;
	
	
	public Member2(String id, String pwd, String name, String tel, String addr, String birth, String job,
			String gender, String email, String intro) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		this.birth = birth;
		this.job = job;
		this.gender = gender;
		this.email = email;
		this.intro = intro;
	}
	public Member2() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", tel=" + tel + ", addr=" + addr
				+ ", birth=" + birth + ", job=" + job + ", gender=" + gender + ", email=" + email + ", intro=" + intro
				+ "]";
	}
	

}
