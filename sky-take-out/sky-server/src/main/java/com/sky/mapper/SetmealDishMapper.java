package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 陈文杰
 * @project takeout
 * @description
 */
@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品id查询套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    @Select("select * from sky_take_out.setmeal_dish where dish_id=#{dishId}")
    List<SetmealDish> getByDishId(Long dishId);

    void insertBatch(List<SetmealDish> setmealDishes);
}
