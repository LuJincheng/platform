package com.cn.platform.core.base.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

/** 
* @packageName: com.cn.platform.core.base.entity
* @ClassName: BaseEntity 
* @Description: 【平台中所有实体的基类】
* @author lujc
* @date 2015年7月28日 上午11:42:14 
*  
*/ 
@MappedSuperclass
public abstract class BaseEntity implements Serializable{
	
	/** 
	* @fieldType: long
	* @Fields: serialVersionUID 
	* @Description: TODO 
	*/ 
	private static final long serialVersionUID = 4905862715848619147L;
	/** 
	* @fieldType: String
	* @Fields: guid 
	* @Description: 实体主键 
	*/ 
	protected String guid;
	
	@Id
	@Column(name = "guid",length = 40, nullable = true, insertable = true, updatable = true)
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid")
	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((guid == null) ? 0 : guid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity other = (BaseEntity) obj;
		if (guid == null) {
			if (other.guid != null)
				return false;
		} else if (!guid.equals(other.guid))
			return false;
		return true;
	}
	
}
