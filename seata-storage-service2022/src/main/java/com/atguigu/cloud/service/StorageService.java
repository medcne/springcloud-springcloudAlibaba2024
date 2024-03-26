package com.atguigu.cloud.service;

/**
 * @auther zzyy
 * @create 2023-12-01 18:08
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}


