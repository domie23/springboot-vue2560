package com.dao;

import com.entity.YuyueguahaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YuyueguahaoView;

/**
 * 预约挂号 Dao 接口
 *
 * @author 
 */
public interface YuyueguahaoDao extends BaseMapper<YuyueguahaoEntity> {

   List<YuyueguahaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
