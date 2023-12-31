package com.soft2242.shop.mapper;

import com.soft2242.shop.entity.UserShoppingCart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft2242.shop.vo.CartGoodsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author liushuang1515
 * @since 2023-11-14
 */
public interface UserShoppingCartMapper extends BaseMapper<UserShoppingCart> {
    /**
     * 获取购物车信息
     *
     * @param id
     * @return list
     */
    List<CartGoodsVO> getCartGoodsInfo(@Param("id") Integer id);
}
