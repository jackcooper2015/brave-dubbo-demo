
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.toolkit.Sequence;
import com.reapal.gworder.entity.GwOrders;
import com.reapal.gworder.service.IGwOrdersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-consumer.xml","classpath:brave-dubbo.xml"})
public class IGwOrdersServiceTest {

    @Autowired
    private IGwOrdersService iGwOrdersService;

    @Test
    public void testInsert() {
        Sequence sequence = new Sequence();
        for(int i =0 ;i < 1; i++) {
            GwOrders gw  = createBean();
            boolean insert = iGwOrdersService.insert(gw);
            System.out.println("************************* = " + insert);
        }
    }



    @Test
    public void testInsertByBatch() {
        List<GwOrders> list = new ArrayList<GwOrders>();
        for(int i =0 ;i < 1; i++) {
            GwOrders gw  = createBean();
            list.add(gw);
        }
        iGwOrdersService.insertBatch(list);
    }

    @Test
    public void testSelect() {
//        GwOrders gw = new GwOrders();
//        gw.setMerchantOrderNo("loadb1535");
//        List<GwOrders> GwOrderss = iGwOrdersService.selectList(new EntityWrapper<GwOrders>(gw));
//        System.out.println("GwOrderss = " + GwOrderss);
        GwOrders gwOrders = iGwOrdersService.selectById(2458);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&& = " + gwOrders);
    }

    @Test
    public void testUpdate(){
        GwOrders u = new GwOrders();
        u.setOrderId(831005644218695680l);
        u.setBodys("5678");
        iGwOrdersService.updateById(u);
    }

    @Test
    public void testSlectByPage(){
        GwOrders gw = new GwOrders();
        gw.setBodys("5678");
        Page<GwOrders> page = new Page<GwOrders>();
        Page<GwOrders> gwOrdersPage = iGwOrdersService.selectPage(page);
        System.out.println("GwOrdersPage = " + gwOrdersPage);
        System.out.println("GwOrdersPage = " + gwOrdersPage.getRecords());
    }


    @Test
    public void testSlectByLike(){
        List<GwOrders> GwOrderss = iGwOrdersService.selectList(
                new EntityWrapper<GwOrders>().like("bodys", "56")
                        .and("service={0}", "online_pay")
                        .orderBy("order_id")
        );
        System.out.println("GwOrderss = " + GwOrderss);
        System.out.println("size = " + GwOrderss.size());
    }

    @Test
    public void testSlectBetween(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        List<GwOrders> GwOrderss = iGwOrdersService.selectList(
                new EntityWrapper<GwOrders>().like("service", "pay")
                        .between("create_date_time", sdf.format(new Date()),sdf.format(new Date()))
                        .orderBy("order_id")
        );
        System.out.println("GwOrderss = " + GwOrderss);
        System.out.println("size = " + GwOrderss.size());
    }

    @Test
    public void testSlectIn(){
        List<GwOrders> GwOrderss = iGwOrdersService.selectList(
                new EntityWrapper<GwOrders>().like("service", "pay")
                        .in("seller_id", new String[]{"100000000000022","11"})
                        .orderBy("order_id")
        );
        System.out.println("GwOrderss = " + GwOrderss);
        System.out.println("size = " + GwOrderss.size());
    }

    @Test
    public void testCount(){
        int i = iGwOrdersService.selectCount(null);
        System.out.println("***************************= " + i);
    }




    public GwOrders createBean(){
        GwOrders gw= new GwOrders();
        gw.setService("online_pay");
        gw.setMerchantOrderNo("100000000000022-1228120328827-2");
        gw.setMerchantId("100000000000022");
        gw.setSellerName("深圳市歌得乐网络科技有限公司3");
        gw.setSellerId("100000000000022");
        gw.setBuyerName("357658655@qq.com");
        gw.setPrice(new BigDecimal(1000));
        gw.setQuantity(new BigDecimal("1"));
        gw.setSignType("MD5");
        gw.setCharsets("UTF-8");
        gw.setCurrency("CNY");
        gw.setOrderDate("20150212");
        gw.setExpDates("15d");
        gw.setIps("10.168.14.176");
        gw.setOrdersts("0");
        gw.setReturnUrl("www.repal.com");
        gw.setNotifyUrl("www.repal.com");
        gw.setSubject("aaa");
        gw.setBodys("asss'");
        gw.setAmount(new BigDecimal(1000));
        gw.setPriceChanged(new BigDecimal(0));
        gw.setApiVersion("4.0");
        gw.setLocale("CN");
        gw.setPreference("CMB");
        gw.setOrderType("1");
        gw.setPayMethod("bankpay");
        gw.setModifyDateTime(new Date());
        gw.setDeleteFlag("1");
        gw.setCreateDateTime(new Date());
        gw.setApiType("RONGPAY-WEB");
        return  gw;
    }
}
