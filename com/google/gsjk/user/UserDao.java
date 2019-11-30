package com.google.gsjk.user;

/**
 * @program: user
 * @Description: to get user information from data source
 * @author: chun
 * @date: 2019/11/25 下午
 */
public interface UserDao {
    /**
     * @Description: to find user by user name
     * @Param: [username]
     * @return: com.google.gsjk.user.UserInfo
     * @Author: chun
     * @Date: 2019/11/25 下午
     */
    public UserInfo findUserInfoByName(String username);
    /**
     * @Description: to register user in data source
     * @Param: [userInfo]
     * @return: int
     * @Author: chun
     * @Date: 2019/11/25 下午
     */
    public boolean saveUser(UserInfo userInfo);
}
