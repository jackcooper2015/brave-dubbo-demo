package com.reapal.gworder.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.reapal.gworder.entity.GwOrders;
import com.reapal.gworder.mapper.GwOrdersMapper;
import com.reapal.gworder.service.IGwOrdersService;

/**
 * <p>
 * #aaa  服务实现类
 * </p>
 *
 * @author jackcooper
 * @since 2017-02-13
 */
@Service
public class GwOrdersServiceImpl extends ServiceImpl<GwOrdersMapper, GwOrders> implements IGwOrdersService {
	
}
