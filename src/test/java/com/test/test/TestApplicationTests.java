package com.test.test;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class TestApplicationTests {



    @Test
    void contextLoads() {

        PrintDataVO printDataVO = new PrintDataVO();
        printDataVO.setLogo("logo.jpg");
        printDataVO.setTitle("三号馆");
        Colspan c1 = new Colspan(1, "贷款合计");
        Colspan c2 = new Colspan(3, "壹元整");
        Colspan c3 = new Colspan(5, "共1米     0公斤","msg");

        List<Colspan> t1 = Arrays.asList(c1, c2, c3);
        List<Colspan> t2 = Arrays.asList(new Colspan(10,"编码"));
        List<Colspan> t3 = Arrays.asList(new Colspan(10,"备注:散剪订单不支持退/换货，请仔细确认码单内容后签字"));
        printDataVO.setColumnT(Arrays.asList(t1, t2, t3));

        Good good = new Good();
        good.setSpuId("sadasd");
        good.setPrice(BigDecimal.valueOf(231));
        good.setUnit("米");
        good.setColor("jwqe");
        good.setOrderAmount(BigDecimal.valueOf(2321));
        good.setValume(new Volume(19));
        good.setQuantity(Arrays.asList(new Quantity(10.3d),new Quantity(8d)));
        printDataVO.setGoodList(Arrays.asList(good));
        printDataVO.setAccountData(new AccountData("13213312","广州市","sadlasjdl"));

        String s = JSON.toJSONString(printDataVO);
        System.out.println(s);

    }

}
