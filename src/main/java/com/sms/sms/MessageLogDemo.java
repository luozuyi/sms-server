package com.sms.sms;



public class MessageLogDemo {
	public static void main(String[] args) {
		AppConfig config = ConfigLoader.load(ConfigLoader.ConfigType.Message);
		MessageLog submail = new MessageLog(config);
		submail.setProject("project","w3nla3");
		submail.addStartDate("start_date",UnixStamp.date2TimeStamp("2017-08-12 00:00:00","yyyy-MM-dd HH:mm:ss"));
		submail.addEndDate("end_date",UnixStamp.date2TimeStamp("2017-08-13 00:00:00","yyyy-MM-dd HH:mm:ss"));
		submail.log();
	}

}
