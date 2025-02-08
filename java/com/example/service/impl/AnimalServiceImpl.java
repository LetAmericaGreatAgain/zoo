package com.example.service.impl;

import com.example.common.util.DateTimeUtil;
import com.example.domain.Animal;
import com.example.mapper.AnimalMapper;
import com.example.service.IAnimalService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;

/**
* Animal表场景处理具体实现
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 10:26:42.473
*/
public class AnimalServiceImpl implements IAnimalService
{
    @Inject
    private AnimalMapper animalMapper;

    /**
    * Animal表根据主键单条查询
    *
    * @param id Animal表主键
    * @return Animal表
    */
    @Override
    public Animal selectAnimalById(Integer id) {
        return animalMapper.selectAnimalById(id);
    }

    /**
    * Animal表固定列组合条件查询
    *
    * @param animal Animal表查询条件
    * @return Animal表结果集
    */
    @Override
    public List<Animal> selectAnimalList(Animal animal) {
        return animalMapper.selectAnimalList(animal);
    }

    /**
    * Animal表固定列组合in查询
    *
    * @param animalList Animal表
    * @return Animal表集合
    */
    @Override
    public List<Animal> animalFixedColumnInQuery(List<Animal> animalList) {
        return animalMapper.animalFixedColumnInQuery(animalList);
    }

    /**
    * Animal表多样列组合or查询
    *
    * @param animalList Animal表
    * @return Animal表集合
    */
    @Override
    public List<Animal> animalMultiColumnOrQuery(List<Animal> animalList) {
        return animalMapper.animalMultiColumnOrQuery(animalList);
    }

    /**
    * Animal表多样列组合in查询
    *
    * @param animalList Animal表
    * @return Animal表集合
    */
    @Override
    public List<Animal> animalMultiColumnInQuery(List<Animal> animalList) {
        return animalMapper.animalMultiColumnInQuery(animalList);
    }

    /**
    * Animal表多样列组合union查询
    *
    * @param animalList Animal表
    * @return Animal表集合
    */
    @Override
    public List<Animal> animalMultiColumnUnionQuery(List<Animal> animalList) {
        return animalMapper.animalMultiColumnUnionQuery(animalList);
    }

    /**
    * Animal表多样列组合union all查询
    *
    * @param animalList Animal表
    * @return Animal表集合
    */
    @Override
    public List<Animal> animalMultiColumnUnionAllQuery(List<Animal> animalList) {
        return animalMapper.animalMultiColumnUnionAllQuery(animalList);
    }

    /**
    * Animal表单条插入
    *
    * @param animal Animal表对应实体
    * @return 影响行数
    */
    @Override
    public int insertAnimal(Animal animal) {
        animal.setCreateTime(DateTimeUtil.currentDateTime());
        return animalMapper.insertAnimal(animal);
    }

    /**
    * Animal表批量插入
    *
    * @param animalList Animal表对应实体列表
    * @return 影响行数
    */
    @Override
    public int batchInsertAnimal(List<Animal> animalList) {
        return animalMapper.batchInsertAnimal(animalList);
    }

    /**
    * Animal表根据主键修改单行
    *
    * @param animal Animal表对应实体
    * @return 影响行数
    */
    @Override
    public int updateAnimal(Animal animal) {
        animal.setUpdateTime(DateTimeUtil.currentDateTime());
        return animalMapper.updateAnimal(animal);
    }

    /**
    * Animal表根据主键批量修改
    *
    * @param animalList Animal表对应实体列表
    * @return 影响行数
    */
    @Override
    @Transactional
    public int batchUpdateAnimal(List<Animal> animalList) {
        return animalMapper.batchUpdateAnimal(animalList);
    }


    /**
    * Animal表根据主键单条删除
    *
    * @param id Animal表主键
    * @return 影响行数
    */
    @Override
    public int deleteAnimalById(Integer id) {
        return animalMapper.deleteAnimalById(id);
    }

    /**
    * Animal表条件删除
    *
    * @param animal Animal表
    *
    * @return Animal表被删除的记录条数
    */
    @Override
    public int deleteAnimal(Animal animal){
        return animalMapper.deleteAnimal(animal);
    }

    /**
    * Animal表批量删除
    *
    * @param animalList 需要删除的数据主键集合
    * @return Animal表被批量删除的记录条数
    */
    @Override
    public int batchDeleteAnimal(List<Animal> animalList) {
        return animalMapper.batchDeleteAnimal(animalList);
    }

    /**
    * Animal表根据主键批量删除
    *
    * @param idArr Animal表主键数组
    * @return 影响行数
    */
    @Override
    public int deleteAnimalByIdArr(Integer[] idArr) {
        return animalMapper.deleteAnimalByIdArr(idArr);
    }

    /**
    * Animal表保存，存在则更新，不存在则插入
    *
    * @param animal Animal表
    *
    * @return Animal表受影响行数，更新返回2，插入返回1
    */
    @Override
    public int saveAnimalById(Animal animal) {
        return animalMapper.saveAnimalById(animal);
    }

    /**
    * Animal表批量保存，存在则更新，不存在则插入
    *
    * @param animalList Animal表
    *
    * @return Animal表受影响行数
    */
    @Override
    public int batchSaveAnimalById(List<Animal> animalList) {
        return animalMapper.batchSaveAnimalById(animalList);
    }
}

