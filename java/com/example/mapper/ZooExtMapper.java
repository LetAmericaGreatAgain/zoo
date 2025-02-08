package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.domain.Zoo;


/**
* Zoo表ExtMapper接口
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 10:26:42.475
*/
public interface ZooExtMapper
{
    /**
    * Zoo表自定义查询方法
    *
    * @return Zoo表集合
    */
    public List<Zoo> customMethod();
}

