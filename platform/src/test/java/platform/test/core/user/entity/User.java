package platform.test.core.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.cn.platform.core.base.entity.BaseEntity;

/** 
* @packageName: platform.test.core.util.entrt
* @ClassName: User 
* @Description: 【测试底层数据的crud操作】
* @author lujc
* @date 2015年7月28日 上午11:34:25 
*  
*/ 
@Entity
public class User extends BaseEntity{
	
	/** 
	* @fieldType: long
	* @Fields: serialVersionUID 
	* @Description:  
	*/ 
	private static final long serialVersionUID = 1916450968384526424L;
	/** 
	* @fieldType: String
	* @Fields: userName 
	* @Description: 用户名 
	*/ 
	private String userName;
	/** 
	* @fieldType: String
	* @Fields: password 
	* @Description: 密码 
	*/ 
	private String password;
	
	@Column(name="user_name",length=60)
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="password",length=80)
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
