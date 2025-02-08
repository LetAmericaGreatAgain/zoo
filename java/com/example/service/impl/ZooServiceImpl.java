package com.example.service.impl;

import com.example.common.util.DateTimeUtil;
import com.example.domain.Zoo;
import com.example.mapper.ZooMapper;
import com.example.service.IZooService;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;

/**
* Zoo表场景处理具体实现
*
* @since 1.0
* @author ultimate-source
* @date 2025-02-08 10:26:42.475
*/
public class ZooServiceImpl implements IZooService
{
    @Inject
    private ZooMapper zooMapper;

    /**
    * Zoo表根据主键单条查询
    *
    * @param zName Zoo表主键
    * @param location Zoo表主键
    * @return Zoo表
    */
    @Override
    public Zoo selectZooByZNameAndLocation(String zName, String location) {
        return zooMapper.selectZooByZNameAndLocation(zName, location);
    }

    /**
    * Zoo表固定列组合条件查询
    *
    * @param zoo Zoo表查询条件
    * @return Zoo表结果集
    */
    @Override
    public List<Zoo> selectZooList(Zoo zoo) {
        return zooMapper.selectZooList(zoo);
    }

    /**
    * Zoo表固定列组合in查询
    *
    * @param zooList Zoo表
    * @return Zoo表集合
    */
    @Override
    public List<Zoo> zooFixedColumnInQuery(List<Zoo> zooList) {
        return zooMapper.zooFixedColumnInQuery(zooList);
    }

    /**
    * Zoo表多样列组合or查询
    *
    * @param zooList Zoo表
    * @return Zoo表集合
    */
    @Override
    public List<Zoo> zooMultiColumnOrQuery(List<Zoo> zooList) {
        return zooMapper.zooMultiColumnOrQuery(zooList);
    }

    /**
    * Zoo表多样列组合in查询
    *
    * @param zooList Zoo表
    * @return Zoo表集合
    */
    @Override
    public List<Zoo> zooMultiColumnInQuery(List<Zoo> zooList) {
        return zooMapper.zooMultiColumnInQuery(zooList);
    }

    /**
    * Zoo表多样列组合union查询
    *
    * @param zooList Zoo表
    * @return Zoo表集合
    */
    @Override
    public List<Zoo> zooMultiColumnUnionQuery(List<Zoo> zooList) {
        return zooMapper.zooMultiColumnUnionQuery(zooList);
    }

    /**
    * Zoo表多样列组合union all查询
    *
    * @param zooList Zoo表
    * @return Zoo表集合
    */
    @Override
    public List<Zoo> zooMultiColumnUnionAllQuery(List<Zoo> zooList) {
        return zooMapper.zooMultiColumnUnionAllQuery(zooList);
    }

    /**
    * Zoo表单条插入
    *
    * @param zoo Zoo表对应实体
    * @return 影响行数
    */
    @Override
    public int insertZoo(Zoo zoo) {
        zoo.setCreateTime(DateTimeUtil.currentDateTime());
        return zooMapper.insertZoo(zoo);
    }

    /**
    * Zoo表批量插入
    *
    * @param zooList Zoo表对应实体列表
    * @return 影响行数
    */
    @Override
    public int batchInsertZoo(List<Zoo> zooList) {
        return zooMapper.batchInsertZoo(zooList);
    }

    /**
    * Zoo表根据主键修改单行
    *
    * @param zoo Zoo表对应实体
    * @return 影响行数
    */
    @Override
    public int updateZoo(Zoo zoo) {
        zoo.setUpdateTime(DateTimeUtil.currentDateTime());
        return zooMapper.updateZoo(zoo);
    }

    /**
    * Zoo表根据主键批量修改
    *
    * @param zooList Zoo表对应实体列表
    * @return 影响行数
    */
    @Override
    @Transactional
    public int batchUpdateZoo(List<Zoo> zooList) {
        return zooMapper.batchUpdateZoo(zooList);
    }


    /**
    * Zoo表根据主键单条删除
    *
    * @param zName Zoo表主键
    * @param location Zoo表主键
    * @return 影响行数
    */
    @Override
    public int deleteZooByZNameAndLocation(String zName, String location) {
        return zooMapper.deleteZooByZNameAndLocation(zName, location);
    }

    /**
    * Zoo表条件删除
    *
    * @param zoo Zoo表
    *
    * @return Zoo表被删除的记录条数
    */
    @Override
    public int deleteZoo(Zoo zoo){
        return zooMapper.deleteZoo(zoo);
    }

    /**
    * Zoo表批量删除
    *
    * @param zooList 需要删除的数据主键集合
    * @return Zoo表被批量删除的记录条数
    */
    @Override
    public int batchDeleteZoo(List<Zoo> zooList) {
        return zooMapper.batchDeleteZoo(zooList);
    }

    /**
    * Zoo表根据主键批量删除
    *
    * @param zNameArr Zoo表主键数组
    * @param locationArr Zoo表主键数组
    * @return 影响行数
    */
    @Override
    public int deleteZooByZNameArrAndLocationArr(String[] zNameArr, String[] locationArr) {
        return zooMapper.deleteZooByZNameArrAndLocationArr(zNameArr, locationArr);
    }

    /**
    * Zoo表保存，存在则更新，不存在则插入
    *
    * @param zoo Zoo表
    *
    * @return Zoo表受影响行数，更新返回2，插入返回1
    */
    @Override
    public int saveZooByZNameAndLocation(Zoo zoo) {
        return zooMapper.saveZooByZNameAndLocation(zoo);
    }

    /**
    * Zoo表批量保存，存在则更新，不存在则插入
    *
    * @param zooList Zoo表
    *
    * @return Zoo表受影响行数
    */
    @Override
    public int batchSaveZooByZNameAndLocation(List<Zoo> zooList) {
        return zooMapper.batchSaveZooByZNameAndLocation(zooList);
    }
}

