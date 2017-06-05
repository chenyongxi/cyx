package com.cmsz.dao;


import org.springframework.stereotype.Repository;

import com.cmsz.bean.Seckill;


@Repository
public interface SeckillDao
{

    Seckill queryById(long seckillId);
}
