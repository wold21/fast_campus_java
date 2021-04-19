package ch13.domain.userInfo.dao.mysql;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDAO;

public class UserInfoMysqlDAO implements UserInfoDAO{

	@Override
	public void insert(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB userID - " + userInfo.getUserID());
		
	}

	@Override
	public void delete(UserInfo userInfo) {
		System.out.println("Delete into MySQL DB userID - " + userInfo.getUserID());
		
	}

	@Override
	public void update(UserInfo userInfo) {
		System.out.println("Update into MySQL DB userID - " + userInfo.getUserID());
		
	}
	

}
