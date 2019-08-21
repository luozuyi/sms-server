package com.sms.mapper;

import com.sms.entity.SendMemberSmsTotal;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author luo
 */
@Mapper
@Repository
public interface SendMemberSmsTotalMapper {
    /**
     * 删除
     * @param id 主键
     * @return
     */
    int deleteByPrimaryKey(Long id);
    /**
     * 添加
     * @param record 对象
     * @return
     */
    int insert(SendMemberSmsTotal record);
    /**
     * 选择性添加
     * @param record 对象
     * @return
     */
    int insertSelective(SendMemberSmsTotal record);
    /**
     * 查询
     * @param id 主键
     * @return
     */
    SendMemberSmsTotal selectByPrimaryKey(Long id);
    /**
     * 修改
     * @param record 对象
     * @return
     */
    int updateByPrimaryKeySelective(SendMemberSmsTotal record);
    /**
     * 修改
     * @param record 对象
     * @return
     */
    int updateByPrimaryKey(SendMemberSmsTotal record);
}