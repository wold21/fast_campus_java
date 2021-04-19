package ch13.webUserInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userInfo.UserInfo;
import ch13.domain.userInfo.dao.UserInfoDAO;
import ch13.domain.userInfo.dao.mysql.UserInfoMysqlDAO;
import ch13.domain.userInfo.dao.oracle.UserInfoOracleDAO;

public class UserInfoClient {

	public static void main(String[] args) throws IOException{
			FileInputStream fis = new FileInputStream("db.properties");
			
			Properties prop = new Properties(); // Ű����� �о���� �� �ִ� ���
			prop.load(fis);
			
			String dbType=prop.getProperty("DBTYPE");
			
			UserInfo userInfo = new UserInfo();
			UserInfoDAO userInfoDAO = null;
			userInfo.setUserID("tazo");
			userInfo.setUserName("hyuk");
			userInfo.setPassword("111223");
			
			
			if(dbType.equals("ORACLE")) {
				userInfoDAO = new UserInfoOracleDAO();
			} else if (dbType.equals("MYSQL")) {
				userInfoDAO = new UserInfoMysqlDAO();
			} else {
				System.out.println("db error");
				return;
			}
			
			userInfoDAO.insert(userInfo);
			userInfoDAO.delete(userInfo);
			userInfoDAO.update(userInfo);
	}
}
