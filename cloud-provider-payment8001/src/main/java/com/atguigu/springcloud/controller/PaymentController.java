package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.service.PaymentService;
import com.atguigu.springcloud.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 作者:灰爪哇
 * 时间:2023-02-28
 */
@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    //新增
    @PostMapping("/save")
    public R save(@RequestBody Payment payment){
        paymentService.save(payment);
         return R.success();
    }
    //单个查询
    @GetMapping("/getById/{id}")
    public R getById(@PathVariable("id")Long id){
        log.info("pass");
        Payment payment = paymentService.getById(id);
        return R.success(payment);
    }
}
