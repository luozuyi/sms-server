package com.sms.mapper;

import com.sms.entity.SalesMember;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author luo
 */
@Mapper
@Repository
public interface SalesMemberMapper {
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
    int insert(SalesMember record);

    /**
     * 添加
     * @param record 选择性添加
     * @return
     */
    int insertSelective(SalesMember record);

    /**
     * 查询
     * @param id 主键id
     * @return
     */
    SalesMember selectByPrimaryKey(Long id);

    /**
     * 修改
     * @param record 对象
     * @return
     */
    int updateByPrimaryKeySelective(SalesMember record);

    /**
     * 修改
     * @param record 对象
     * @return
     */
    int updateByPrimaryKey(SalesMember record);

    /**
     * 最近登陆时间区间查询
     * @param params 参数
     * @return
     */
    List<SalesMember> selectByCurrentLoginTime(Map<String,Object> params);

    /**
     * 手机号查询
     * @param mobile 手机号
     * @return
     */
    List<SalesMember> selectByMobile(String mobile);
}