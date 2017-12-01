package com.lanou.dao;

import com.lanou.entity.Category;

/**
 * Created by lanou on 2017/12/1.
 */
public interface CategoryMapper {

    public Category selectByPrimaryKey(Integer cId);

}
