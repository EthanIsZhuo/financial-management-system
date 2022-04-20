package com.ljj.finance.service.impl;

import com.ljj.finance.entity.News;
import com.ljj.finance.mapper.NewsMapper;
import com.ljj.finance.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewsServiceImpl implements NewsService {

    @Autowired(required = false)
    NewsMapper newsMapper;

    @Override
    public List<News> selectAllNews() {
        List<News> list = newsMapper.selectByExample(null);
        return list;
    }
}
