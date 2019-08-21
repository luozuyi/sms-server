package com.sms.utils;


import com.alibaba.fastjson.JSONObject;
import com.sms.sms.AppConfig;
import com.sms.sms.ConfigLoader;
import com.sms.sms.MESSAGEXsend;
import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author luo
 */
public class SmsSendUtil {
    public static void send(String phone, String code, String time) {
        if (StringUtils.isBlank(phone) || StringUtils.isBlank(code) || StringUtils.isBlank(time)) {
            return;
        }

        AppConfig config = ConfigLoader.load(ConfigLoader.ConfigType.Message);
        MESSAGEXsend submail = new MESSAGEXsend(config);
        submail.addTo(phone);
        submail.setProject("CWdtX2");
        submail.addVar("code", code);
        submail.addVar("time", time);
        submail.xsend();
    }

    public static String sendSmsApi(String mobile) throws Exception {
        String url = "https://api.mysubmail.com/message/xsend.json";
        Map<String,String> params = new HashMap<>(16);
        params.put("appid","25595");
        params.put("to",mobile);
        params.put("project","CWdtX2");
        params.put("signature","17decdd8c978ba754b4c5eb9b47d7bd4");

        JSONObject vars = new JSONObject();
        vars.put("code","123456");
        vars.put("time","30");
        params.put("vars",vars.toJSONString());
        HttpClientResult result = HttpClientUtils.doPost(url,params);
        JSONObject jsonObject = JSONObject.parseObject(result.getContent());
        Object res = jsonObject.get("status");
        if(res != null){
            return jsonObject.get("status").toString();
        }
        return null;
    }
    public static void main(String[] args) {
        send("13164138097", "123456", "30");
    }
}
