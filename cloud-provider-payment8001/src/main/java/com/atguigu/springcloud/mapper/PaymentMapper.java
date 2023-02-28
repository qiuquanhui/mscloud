package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.entity.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 邱权辉
* @description 针对表【payment】的数据库操作Mapper
* @createDate 2023-02-28 22:24:17
* @Entity com.atguigu.springcloud.entity.Payment
*/
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

}




