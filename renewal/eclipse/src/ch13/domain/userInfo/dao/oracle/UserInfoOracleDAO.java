package ch13.domain.userInfo.dao.oracle;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDAO;

public class UserInfoOracleDAO implements UserInfoDAO{

	@Override
	public void insert(UserInfo userInfo) {
		System.out.println("Insert into ORACLE DB userID - " + userInfo.getUserID());
		
	}

	@Override
	public void delete(UserInfo userInfo) {
		System.out.println("Delete into ORACLE DB userID - " + userInfo.getUserID());
		
	}

	@Override
	public void update(UserInfo userInfo) {
		System.out.println("Update into ORACLE DB userID - " + userInfo.getUserID());
		
	}

}
