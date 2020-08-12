package com.tom.mapper;

import com.tom.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @File: PaymentMapper
 * @Description:
 * @Author: tom
 * @Create: 2020-08-12 09:56
 **/
@Mapper
public interface PaymentMapper {
    /**
     * 增加支付订单
     * @param payment
     * @return
     */
    public int add(Payment payment);

    /**
     * 根据id获取
     * @param id
     * @return
     */
    public Payment getById(Long id);
}
