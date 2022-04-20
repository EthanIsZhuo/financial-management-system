package com.ljj.finance.service.impl;

import com.ljj.finance.entity.FlowOfFunds;
import com.ljj.finance.entity.FlowOfFundsExample;
import com.ljj.finance.mapper.FlowOfFundsMapper;
import com.ljj.finance.service.FlowOfFundsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class FlowOfFundsServiceImpl implements FlowOfFundsService {

    @Autowired
    FlowOfFundsMapper flowOfFundsMapper;
    @Override
    @Transactional
    public Integer insertFlowOfFunds(FlowOfFunds flowOfFunds) {
        return flowOfFundsMapper.insertSelective(flowOfFunds);
    }

    @Override
    public List<FlowOfFunds> selectFlowOfFundsByUserId(Integer userId) {
        FlowOfFundsExample fofe = new FlowOfFundsExample();
        fofe.createCriteria().andUseridEqualTo(userId);
        fofe.setOrderByClause("id desc");
        return flowOfFundsMapper.selectByExample(fofe);
    }
}
