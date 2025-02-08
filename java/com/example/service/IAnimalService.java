package com.example.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.domain.Animal;


/**
* Animal表Service接口
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 10:26:42.473
*/
public interface IAnimalService
{
    /**
    * Animal表根据主键查询
    *
    * @param id Animal表主键
    * @return Animal表
    */
    public Animal selectAnimalById(Integer id);

    /**
    * Animal表固定列组合条件查询
    *
    * @param animal Animal表
    * @return Animal表集合
    */
    public List<Animal> selectAnimalList(Animal animal);

    /**
    * Animal表固定列组合in查询
    *
    * @param animalList Animal表
    * @return Animal表集合
    */
    public List<Animal> animalFixedColumnInQuery(List<Animal> animalList);

    /**
    * Animal表多样列组合or查询
    *
    * @param animalList Animal表
    * @return Animal表集合
    */
    public List<Animal> animalMultiColumnOrQuery(List<Animal> animalList);

    /**
    * Animal表多样列组合in查询
    *
    * @param animalList Animal表
    * @return Animal表集合
    */
    public List<Animal> animalMultiColumnInQuery(List<Animal> animalList);

    /**
    * Animal表多样列组合union查询
    *
    * @param animalList Animal表
    * @return Animal表集合
    */
    public List<Animal> animalMultiColumnUnionQuery(List<Animal> animalList);

    /**
    * Animal表多样列组合union all查询
    *
    * @param animalList Animal表
    * @return Animal表集合
    */
    public List<Animal> animalMultiColumnUnionAllQuery(List<Animal> animalList);

    /**
    * Animal表单条插入
    *
    * @param animal Animal表
    * @return 影响行数
    */
    public int insertAnimal(Animal animal);

    /**
    * Animal表批量插入
    *
    * @param animalList Animal表
    * @return 影响行数
    */
    public int batchInsertAnimal(List<Animal> animalList);

    /**
    * Animal表根据主键修改单条记录
    *
    * @param animal Animal表
    * @return Animal表被修改的记录条数
    */
    public int updateAnimal(Animal animal);

    /**
    * Animal表根据主键批量修改
    *
    * @param animalList Animal表
    * @return Animal表被修改的记录条数
    */
    public int batchUpdateAnimal(List<Animal> animalList);

    /**
    * Animal表单条删除
    *
    * @param id Animal表主键
    * @return Animal表被删除的记录条数
    */
    public int deleteAnimalById(Integer id);

    /**
    * Animal表条件删除
    *
    * @param animal Animal表
    *
    * @return Animal表被删除的记录条数
    */
    public int deleteAnimal(Animal animal);

    /**
    * Animal表批量删除
    *
    * @param animalList 需要删除的数据主键集合
    * @return Animal表被批量删除的记录条数
    */
    public int batchDeleteAnimal(List<Animal> animalList);

    /**
    * Animal表批量删除
    *
    * @param idArr Animal表主键集合
    * @return Animal表被批量删除的记录条数
    */
    public int deleteAnimalByIdArr(@Param("idArr")Integer[] idArr);

    /**
    * Animal表保存，存在则更新，不存在则插入
    *
    * @param animal Animal表
    *
    * @return Animal表受影响行数，更新返回2，插入返回1
    */
    public int saveAnimalById(Animal animal);

    /**
    * Animal表批量保存，存在则更新，不存在则插入
    *
    * @param animalList Animal表
    *
    * @return Animal表受影响行数
    */
    public int batchSaveAnimalById(List<Animal> animalList);

}

