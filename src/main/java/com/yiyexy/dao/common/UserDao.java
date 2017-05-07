package com.yiyexy.dao.common;

import com.yiyexy.model.common.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>Created on 2017/5/7.</p>
 *
 * @author stormma
 *
 * @description: <p>用户 dao 层接口</p>
 */
@Mapper
public interface UserDao {


    /**
     * <p>根据手机号和密码查询用户</p>
     * @param user
     * @return
     */
    User getUser(@Param("user") User user);

    /**
     * <p>插入新用户</p>
     * @param user
     */
    void insertUser(@Param("user") User user);

    /**
     * <p>判断用户名是否存在</p>
     * @param userName
     * @return
     */
    int isExistUserName(@Param("userName") String userName);

    /**
     * <p>判断手机号码是否存在</p>
     * @param mobile
     * @return
     */
    int isExistMobile(@Param("mobile") String mobile);

    /**
     * <p>根据手机号码修改用户名</p>
     * @param user
     */
    void updateUserName(@Param("user") User user);

    /**
     * <p>根据手机号码修改用户密码</p>
     * @param user
     */
    void updatePassword(@Param("user") User user);

    /**
     * <p>根据手机号码修改用户qq信息</p>
     * @param user
     */
    void updateQQ(@Param("user") User user);

    /**
     * <p>根据用户的手机号码查询用户的修改密码次数</p>
     * @param mobile
     * @return
     */
    Integer getUpdatePwdCount(@Param("mobile") String mobile);
}
