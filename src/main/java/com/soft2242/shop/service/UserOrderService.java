package com.soft2242.shop.service;

import com.soft2242.shop.entity.UserOrder;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.entity.UserOrderGoods;
import com.soft2242.shop.vo.OrderDetailVO;
import com.soft2242.shop.vo.UserOrderVO;
import com.soft2242.shop.vo.SubmitOrderVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liushuang1515
 * @since 2023-11-09
 */
public interface UserOrderService extends IService<UserOrder> {
    /**
     * 新增订单
     *
     * @param orderVO
     * @return Integer
     */
    Integer addGoodsOrder(UserOrderVO orderVO);

    /**
     * 获取订单详情
     *
     * @param id
     * @return OrderDetailVO
     */
    OrderDetailVO getOrderDetail(Integer id);


    /**
     * 填写订单-获取预付订单
     *
     * @param userId
     * @return SubmitOrderVO
     */
    SubmitOrderVO getPreOrderDetail(Integer userId);
}
