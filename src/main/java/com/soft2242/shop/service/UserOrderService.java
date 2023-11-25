package com.soft2242.shop.service;

import com.soft2242.shop.common.result.PageResult;
import com.soft2242.shop.entity.UserOrder;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.entity.UserOrderGoods;
import com.soft2242.shop.query.CancelGoodsQuery;
import com.soft2242.shop.query.OrderPreQuery;
import com.soft2242.shop.query.OrderQuery;
import com.soft2242.shop.vo.OrderDetailVO;
import com.soft2242.shop.vo.OrderLogisticVO;
import com.soft2242.shop.vo.SubmitOrderVO;
import com.soft2242.shop.vo.UserOrderVO;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author liushuang
 * @since 2023-11-25
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

    /**
     * 填写订单-立即支付
     *
     * @param orderPreQuery
     * @return SubmitOrderVO
     */
    SubmitOrderVO getPreNowOrderDetail(OrderPreQuery orderPreQuery);

    /**
     * 填写订单-再次购买
     *
     * @param id
     * @return SubmitOrderVO
     */
    SubmitOrderVO getRepurchaseOrderDetail(Integer id);

    /**
     * 订单列表
     *
     * @param query
     * @return PageResult
     */
    PageResult<OrderDetailVO> getOrderList(OrderQuery query);

    /**
     * 取消订单
     *
     * @param query
     * @return OrderDetailVO
     */
    OrderDetailVO cancelOrder(CancelGoodsQuery query);

    /**
     * 删除订单
     *
     * @param ids
     */
    void deleteOrder(List<Integer> ids, Integer userId);

    /**
     * 模拟发货
     *
     * @param id
     */
    void consignOrder(Integer id);

    /**
     * 订单支付
     *
     * @param id
     */
    void payOrder(Integer id);

    /**
     * 确认收货
     *
     * @param id
     * @return OrderDetailVO
     */
    OrderDetailVO receiptOrder(Integer id);

    /**
     * 物流订单信息
     *
     * @param id
     * @return OrderLogisticVO
     */
    OrderLogisticVO getOrderLogistics(Integer id);
}