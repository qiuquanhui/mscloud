package com.atguigu.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.service.PaymentService;
import com.atguigu.springcloud.mapper.PaymentMapper;
import org.springframework.stereotype.Service;

/**
* @author 邱权辉
* @description 针对表【payment】的数据库操作Service实现
* @createDate 2023-02-28 22:24:17
*/
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment>
    implements PaymentService{

}




