package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.SetmealVO;

import java.util.List;

/**
 * @author 陈文杰
 * @project takeout
 * @description
 */
public interface SetmealService {
    SetmealVO getById(Long id);

    void save(SetmealDTO setmealDTO);


    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    void delete(List<Long> ids);

    void updateWithDish(SetmealDTO setmealDTO);

    void startOrStop(Integer status, Long id);
}
