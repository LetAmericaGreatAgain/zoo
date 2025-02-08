package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.domain.Zoo;


/**
* Zoo表Mapper接口
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 10:26:42.475
*/
public interface ZooMapper
{
    /**
    * Zoo表根据主键查询
    *
    * @param zName Zoo表主键
    * @param location Zoo表主键
    * @return Zoo表
    */
    public Zoo selectZooByZNameAndLocation(@Param("zName")String zName,@Param("location")String location);

    /**
    * Zoo表固定列组合条件查询
    *
    * @param zoo Zoo表
    * @return Zoo表集合
    */
    public List<Zoo> selectZooList(Zoo zoo);

    /**
    * Zoo表固定列组合in查询
    *
    * @param zooList Zoo表
    * @return Zoo表集合
    */
    public List<Zoo> zooFixedColumnInQuery(List<Zoo> zooList);

    /**
    * Zoo表多样列组合or查询
    *
    * @param zooList Zoo表
    * @return Zoo表集合
    */
    public List<Zoo> zooMultiColumnOrQuery(List<Zoo> zooList);

    /**
    * Zoo表多样列组合in查询
    *
    * @param zooList Zoo表
    * @return Zoo表集合
    */
    public List<Zoo> zooMultiColumnInQuery(List<Zoo> zooList);

    /**
    * Zoo表多样列组合union查询
    *
    * @param zooList Zoo表
    * @return Zoo表集合
    */
    public List<Zoo> zooMultiColumnUnionQuery(List<Zoo> zooList);

    /**
    * Zoo表多样列组合union all查询
    *
    * @param zooList Zoo表
    * @return Zoo表集合
    */
    public List<Zoo> zooMultiColumnUnionAllQuery(List<Zoo> zooList);

    /**
    * Zoo表单条插入
    *
    * @param zoo Zoo表
    * @return 影响行数
    */
    public int insertZoo(Zoo zoo);

    /**
    * Zoo表批量插入
    *
    * @param zooList Zoo表
    * @return 影响行数
    */
    public int batchInsertZoo(List<Zoo> zooList);

    /**
    * Zoo表根据主键修改单条记录
    *
    * @param zoo Zoo表
    * @return Zoo表被修改的记录条数
    */
    public int updateZoo(Zoo zoo);

    /**
    * Zoo表根据主键批量修改
    *
    * @param zooList Zoo表
    * @return Zoo表被修改的记录条数
    */
    public int batchUpdateZoo(List<Zoo> zooList);

    /**
    * Zoo表单条删除
    *
    * @param zName Zoo表主键
    * @param location Zoo表主键
    * @return Zoo表被删除的记录条数
    */
    public int deleteZooByZNameAndLocation(@Param("zName")String zName, @Param("location")String location);

    /**
    * Zoo表条件删除
    *
    * @param zoo Zoo表
    *
    * @return Zoo表被删除的记录条数
    */
    public int deleteZoo(Zoo zoo);


    /**
    * Zoo表批量删除
    *
    * @param zooList 需要删除的数据主键集合
    * @return Zoo表被批量删除的记录条数
    */
    public int batchDeleteZoo(List<Zoo> zooList);

    /**
    * Zoo表批量删除
    *
    * @param zNameArr Zoo表主键集合
    * @param locationArr Zoo表主键集合
    * @return Zoo表被批量删除的记录条数
    */
    public int deleteZooByZNameArrAndLocationArr(@Param("zNameArr")String[] zNameArr, @Param("locationArr")String[] locationArr);

    /**
    * Zoo表保存，存在则更新，不存在则插入
    *
    * @param zoo Zoo表
    *
    * @return Zoo表受影响行数，更新返回2，插入返回1
    */
    public int saveZooByZNameAndLocation(Zoo zoo);

    /**
    * Zoo表批量保存，存在则更新，不存在则插入
    *
    * @param zooList Zoo表
    *
    * @return Zoo表受影响行数
    */
    public int batchSaveZooByZNameAndLocation(List<Zoo> zooList);

}

