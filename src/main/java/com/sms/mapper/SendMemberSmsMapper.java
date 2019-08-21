package com.sms.mapper;

import com.sms.entity.SendMemberSms;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luo
 */
@Mapper
@Repository
public interface SendMemberSmsMapper {
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
    int insert(SendMemberSms record);

    /**
     * 选择性添加
     * @param record 对象
     * @return
     */
    int insertSelective(SendMemberSms record);

    /**
     * 查询
     * @param id 主键
     * @return
     */
    SendMemberSms selectByPrimaryKey(Long id);

    /**
     * 修改
     * @param record 对象
     * @return
     */
    int updateByPrimaryKeySelective(SendMemberSms record);

    /**
     * 修改
     * @param record 对象
     * @return
     */
    int updateByPrimaryKey(SendMemberSms record);

    /**
     * 根据手机号查询
     * @param mobile 电话
     * @return
     */
    List<SendMemberSms> selectByMobile(String mobile);
    /**
     * 查询根据是否需要处理的数据
     * @param isNeedDo 是否需要处理
     * @return
     */
    List<SendMemberSms> selectByIsNeedDo(String isNeedDo);

    /**
     * 批次统计日登录数
     * @param batchId 批次id
     * @return
     */
    Long selectOneDayCountByBatchId(String batchId);

    /**
     * 批次统计周登录数
     * @param batchId 批次id
     * @return
     */
    Long selectOneWeekCountByBatchId(String batchId);
    /**
     * 批次统计半月登录数
     * @param batchId 批次id
     * @return
     */
    Long selectFifteenthTimeCountByBatchId(String batchId);
}