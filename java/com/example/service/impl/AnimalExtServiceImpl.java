package com.example.service.impl;

import com.example.domain.Animal;
import com.example.mapper.AnimalExtMapper;
import com.example.service.IAnimalExtService;

import jakarta.inject.Inject;
import java.util.List;

/**
* Animal表具体实现
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 10:26:42.473
*/
public class AnimalExtServiceImpl implements IAnimalExtService
{
    @Inject
    private AnimalExtMapper animalExtMapper;


    /**
    * Animal表自定义查询
    *
    * @return Animal表结果集
    */
    @Override
    public List<Animal> customMethod() {
        return animalExtMapper.customMethod();
    }


}

