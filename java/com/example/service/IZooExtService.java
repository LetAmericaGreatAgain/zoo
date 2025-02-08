package com.example.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.domain.Zoo;


/**
* Zoo表ExtService接口
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 10:26:42.475
*/
public interface IZooExtService
{
    /**
    * Zoo表自定义查询
    *
    * @return Zoo表集合
    */
    public List<Zoo> customMethod();


}

