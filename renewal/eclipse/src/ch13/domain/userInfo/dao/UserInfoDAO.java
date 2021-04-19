package ch13.domain.userInfo.dao;

import ch13.domain.userInfo.UserInfo;

public interface UserInfoDAO {

	void insert(UserInfo userInfo);
	void delete(UserInfo userInfo);
	void update(UserInfo userInfo);
}
