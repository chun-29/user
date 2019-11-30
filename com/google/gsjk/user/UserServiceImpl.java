package com.google.gsjk.user;

import com.google.gsjk.result.Result;

/**
 * @program: user
 * @Description: implement user service
 * @author: chun
 * @date: 2019/11/25 下午
 */
public class UserServiceImpl implements UserService {
    /**
     * @param: userInfo
     * @Description: to login the system
     * @Param: [userinfo]
     * @return: com.google.gsjk.result.Result
     * @Author: chun
     * @Date: 2019/11/25 下午
     */
    public Result login(UserInfo userLogin) {
        UserDaoImpl userDao = new UserDaoImpl();
        UserInfo userInfo = userDao.findUserInfoByName(userLogin.getUsername());
        Result result = new Result(402,"incorrect pwd");
        if(userInfo.getUsername().equals(userLogin.getUsername()) &&
                userInfo.getPassword().equals(userLogin.getPassword())){
            result.setResultcode(201);
            result.setResultmessage("welcome " + userInfo.getUsername());
        }
        return result;
    }

    /**
     * @param: userInfo
     * @Description: to register the new user
     * @Param: [userInfo]
     * @return: com.google.gsjk.result.Result
     * @Author: chun
     * @Date: 2019/11/25 下午
     */
    @Override
    public Result Register(UserInfo userInfo) {
        UserDaoImpl userDao = new UserDaoImpl();
        boolean register = userDao.saveUser(userInfo);
        Result result = new Result(404,"can not save");
        if(register){
            result.setResultcode(200);
            result.setResultmessage("saved");
        }
        return result;
    }
}
