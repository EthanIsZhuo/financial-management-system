package com.ljj.finance.mapper;

import com.ljj.finance.entity.UserTermFinancial;
import com.ljj.finance.entity.UserTermFinancialExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTermFinancialMapper {
    long countByExample(UserTermFinancialExample example);

    int deleteByExample(UserTermFinancialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTermFinancial record);

    int insertSelective(UserTermFinancial record);

    List<UserTermFinancial> selectByExample(UserTermFinancialExample example);

    UserTermFinancial selectByPrimaryKey(Integer id);

    List<UserTermFinancial> selectByExampleWithUserAndTermFinancial(UserTermFinancialExample example);

    UserTermFinancial selectByPrimaryKeyWithUserAndTermFinancial(Integer id);

    int updateByExampleSelective(@Param("record") UserTermFinancial record, @Param("example") UserTermFinancialExample example);

    int updateByExample(@Param("record") UserTermFinancial record, @Param("example") UserTermFinancialExample example);

    int updateByPrimaryKeySelective(UserTermFinancial record);

    int updateByPrimaryKey(UserTermFinancial record);
}