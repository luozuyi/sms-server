package com.sms.controller;

import com.alibaba.fastjson.JSONObject;
import com.sms.service.SalesMemberService;
import com.sms.service.TestService;
import com.sms.utils.HttpClientResult;
import com.sms.utils.HttpClientUtils;
import com.sms.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author luo
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @Autowired
    private SalesMemberService salesMemberService;
    /**
     * 发短信
     * @param telephone
     * @return
     */
    @GetMapping(value = "v1/telephone")
    public Result getTelePhone(String telephone){
        return testService.getTelephone(telephone);
    }

    /**
     * 查询销售列表
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    @GetMapping(value = "v1/sales-members")
    public Result getSalesMemberList(Date startTime, Date endTime){
        return salesMemberService.selectSalesMemberMobileList(startTime,endTime);
    }

    /**
     * 分页查询销售
     * @param pageNum 当前页
     * @param pageSize 一页显示多少条
     * @param startTime 开始时间
     * @param endTime 结束时间
     * @return
     */
    @GetMapping(value = "v1/sales-members/pagination")
    public Result selectSalesMemberMobilePage(Integer pageNum,Integer pageSize,Date startTime,Date endTime){
        return salesMemberService.selectSalesMemberMobilePage(pageNum,pageSize,startTime,endTime);
    }

    public static void main(String[] args) throws Exception {
        String url = "https://api.mysubmail.com/message/xsend.json";
        Map<String,String> params = new HashMap<>(16);
        params.put("appid","25595");
        params.put("to","13164138097");
        params.put("project","CWdtX2");
        params.put("signature","17decdd8c978ba754b4c5eb9b47d7bd4");

        JSONObject vars = new JSONObject();
        vars.put("code","123456");
        vars.put("time","30");
        params.put("vars",vars.toJSONString());
        HttpClientResult result = HttpClientUtils.doPost(url,params);
        System.out.println(result.getContent());
        JSONObject jsonObject = JSONObject.parseObject(result.getContent());
        System.out.println(jsonObject.get("status"));
    }
}
