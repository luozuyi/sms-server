package com.sms.mapper;

import com.sms.entity.SendMemberSmsBatchTotal;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luo
 */
@Mapper
@Repository
public interface SendMemberSmsBatchTotalMapper {
    /**
     * 删除
     * @param id 主键id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 添加
     * @param record 对象
     * @return
     */
    int insert(SendMemberSmsBatchTotal record);

    /**
     * 添加
     * @param record 对象
     * @return
     */
    int insertSelective(SendMemberSmsBatchTotal record);

    /**
     * 查询
     * @param id 主键
     * @return
     */
    SendMemberSmsBatchTotal selectByPrimaryKey(Long id);

    /**
     * 修改
     * @param record 对象
     * @return
     */
    int updateByPrimaryKeySelective(SendMemberSmsBatchTotal record);

    /**
     * 修改
     * @param record 对象
     * @return
     */
    int updateByPrimaryKey(SendMemberSmsBatchTotal record);

    /**
     * 批次id查询批次统计表
     * @param batchId 批次id
     * @return
     */
    SendMemberSmsBatchTotal selectByBatchId(String batchId);

    /**
     * 查询所有批次统计表
     * @return
     */
    List<SendMemberSmsBatchTotal> selectAll();

    /**
     * 发送短信总数
     * @return
     */
    Long selectSumTotalSendCount();

    /**
     * 发送成功的总数
     * @return
     */
    Long selectSumSuccessCount();

    /**
     * 发送失败的总数
     * @return
     */
    Long selectSumFailedCount();

    /**
     * 隔日登录总数
     * @return
     */
    Long selectSumOneDayCount();

    /**
     * 隔周登录总数
     * @return
     */
    Long selectSumOneWeekCount();

    /**
     * 隔半月登录总数
     * @return
     */
    Long selectSumFifteenthCount();
}