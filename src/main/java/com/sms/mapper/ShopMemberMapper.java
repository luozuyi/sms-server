package com.sms.mapper;

import com.sms.entity.ShopMember;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author luo
 */
@Mapper
@Repository
public interface ShopMemberMapper {
    /**
     * 删除
     * @param memberId 会员id
     * @return
     */
    int deleteByPrimaryKey(Long memberId);

    /**
     * 添加
     * @param record 对象
     * @return
     */
    int insert(ShopMember record);

    /**
     * 添加
     * @param record 对象
     * @return
     */
    int insertSelective(ShopMember record);

    /**
     * 查询
     * @param memberId 主键
     * @return
     */
    ShopMember selectByPrimaryKey(Long memberId);

    /**
     * 修改
     * @param record 对象
     * @return
     */
    int updateByPrimaryKeySelective(ShopMember record);

    /**
     * 修改
     * @param record 对象
     * @return
     */
    int updateByPrimaryKey(ShopMember record);

    /**
     * 手机号查询memberId
     * @param mobile
     * @return
     */
    List<Long> selectMemberIdByMobile(String mobile);
}