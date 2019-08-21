package com.sms.mapper;

import com.sms.entity.SendMemberSmsMemberTotal;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luo
 */
@Mapper
@Repository
public interface SendMemberSmsMemberTotalMapper {
    /**
     * 主键删除
     * @param id 主键
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 添加
     * @param record 对象
     * @return
     */
    int insert(SendMemberSmsMemberTotal record);

    /**
     * 添加
     * @param record 对象
     * @return
     */
    int insertSelective(SendMemberSmsMemberTotal record);

    /**
     * 查询
     * @param id 主键id
     * @return
     */
    SendMemberSmsMemberTotal selectByPrimaryKey(Long id);

    /**
     * 修改
     * @param record 对象
     * @return
     */
    int updateByPrimaryKeySelective(SendMemberSmsMemberTotal record);

    /**
     * 修改
     * @param record 对象
     * @return
     */
    int updateByPrimaryKey(SendMemberSmsMemberTotal record);

    /**
     * 手机号查询会员统计发送数据
     * @param mobile 手机号
     * @return
     */
    List<SendMemberSmsMemberTotal> selectByMobile(String mobile);

    /**
     * 查询
     * @return
     */
    Long selectMemberCount();

    /**
     * 查询所有列表
     * @return
     */
    List<SendMemberSmsMemberTotal> selectAll();
}