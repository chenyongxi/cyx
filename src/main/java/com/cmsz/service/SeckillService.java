package com.cmsz.service;


import com.cmsz.bean.Seckill;

public interface SeckillService {
	/**
     *查询单个记录
     * @param seckillId
     * @return
     */
    Seckill getById(long seckillId);
}


