package com.sms.sms;

public class MessageTemplateDemo {
	public static void main(String[] args) {
		//get方法
		AppConfig config = ConfigLoader.load(ConfigLoader.ConfigType.Message);
		MessageTemplate submail = new MessageTemplate(config);
//		submail.getTemplateId("w3nya3");
//		submail.getTemplate();

		//post方法
//		submail.postSmsTitle("张三");
//		submail.postSmsSignature("【测试短信】");
//		submail.postSmsContent("您好你的验证码是@var(code),请在1分钟之内完成输入");
//		submail.postTemplate();
		
		//put
		submail.putTemplateId("w3nya3");
		submail.putSmsTitle("张三");
		submail.putSmsSignature("【测试短信2】");
		submail.putSmsContent("您好你的验证码是@var(code),请在@var(minue)分钟之内完成输入");
		submail.putTemplate();
		
		//del
//		submail.delTemplateId("384hA1");
//		submail.delTemplate();
	

	}

}
