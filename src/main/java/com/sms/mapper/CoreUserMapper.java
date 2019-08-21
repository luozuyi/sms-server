package com.sms.mapper;

import com.sms.entity.CoreUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luo
 */
@Mapper
@Repository
public interface CoreUserMapper {
    /**
     * 删除
     * @param userId 用户id
     * @return
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * 添加
     * @param record 对象
     * @return
     */
    int insert(CoreUser record);

    /**
     * 添加
     * @param record 对象
     * @return
     */
    int insertSelective(CoreUser record);

    /**
     * 查询
     * @param userId 主键
     * @return
     */
    CoreUser selectByPrimaryKey(Long userId);

    /**
     * 修改
     * @param record 对象
     * @return
     */
    int updateByPrimaryKeySelective(CoreUser record);

    /**
     * 修改
     * @param record 对象
     * @return
     */
    int updateByPrimaryKey(CoreUser record);

    /**
     * 用户名查询
     * @param username 用户名
     * @return
     */
    List<CoreUser> selectByUsername(String username);
}