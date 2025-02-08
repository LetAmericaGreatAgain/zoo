package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.domain.Animal;


/**
* Animal表ExtMapper接口
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 10:26:42.473
*/
public interface AnimalExtMapper
{
    /**
    * Animal表自定义查询方法
    *
    * @return Animal表集合
    */
    public List<Animal> customMethod();
}

