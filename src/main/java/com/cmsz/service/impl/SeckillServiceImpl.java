package com.cmsz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cmsz.bean.Seckill;
import com.cmsz.dao.SeckillDao;
import com.cmsz.service.SeckillService;

@Service
public class SeckillServiceImpl implements SeckillService
{
	//注入Service依赖
    @Autowired //@Resource
    private SeckillDao seckillDao;

    public Seckill getById(long seckillId) {
        return seckillDao.queryById(seckillId);
    }
}
