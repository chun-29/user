package com.google.gsjk.user;

import com.google.gsjk.result.Result;

/**
 * @program: user
 * @Description: declare user interface
 * @author: chun
 * @date: 2019/11/25 下午
 */
public interface UserService {
    /**
     * @Description: to login the system
     * @Param: [userinfo]
     * @return: com.google.gsjk.result.Result
     * @Author: chun
     * @Date: 2019/11/25 下午
     */
    public Result login(UserInfo userInfo);

    /**
     * @Description: to register the new user
     * @Param: [userInfo]
     * @return: com.google.gsjk.result.Result
     * @Author: chun
     * @Date: 2019/11/25 下午
     */
    public Result Register(UserInfo userInfo);
}
