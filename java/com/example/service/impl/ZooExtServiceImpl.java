package com.example.service.impl;

import com.example.domain.Zoo;
import com.example.mapper.ZooExtMapper;
import com.example.service.IZooExtService;

import jakarta.inject.Inject;
import java.util.List;

/**
* Zoo表具体实现
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 10:26:42.475
*/
public class ZooExtServiceImpl implements IZooExtService
{
    @Inject
    private ZooExtMapper zooExtMapper;


    /**
    * Zoo表自定义查询
    *
    * @return Zoo表结果集
    */
    @Override
    public List<Zoo> customMethod() {
        return zooExtMapper.customMethod();
    }


}

