package log.dto;

public class LoginDTO {
 private String memId;
 private String memPw;
 private String memName;
 private String memNick;
 private String memProfile;
 private String memPhone;
public String getMemId() {
	return memId;
}
public void setMemId(String memId) {
	this.memId = memId;
}
public String getMemPw() {
	return memPw;
}
public void setMemPw(String memPw) {
	this.memPw = memPw;
}
public String getMemName() {
	return memName;
}
public void setMemName(String memName) {
	this.memName = memName;
}
public String getMemNick() {
	return memNick;
}
public void setMemNick(String memNick) {
	this.memNick = memNick;
}
public String getMemProfile() {
	return memProfile;
}
public void setMemProfile(String memProfile) {
	this.memProfile = memProfile;
}
public String getMemPhone() {
	return memPhone;
}
public void setMemPhone(String memPhone) {
	this.memPhone = memPhone;
}
 
public String toString() {
	return "LoginDTO [memId=" + memId + ",memPw=" +memPw +",memName="+memName+",memNick="+memNick+"memProfile="+memProfile+"memPhone="+memPhone+"]";
}
}
