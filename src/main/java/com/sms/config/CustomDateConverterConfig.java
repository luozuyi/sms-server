package com.sms.config;

import com.sms.utils.Constants;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author luo
 */
@Configuration
public class CustomDateConverterConfig implements Converter<String,Date> {
    private static Logger logger = LoggerFactory.getLogger(CustomDateConverterConfig.class);
    @Override
    public Date convert(String source) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(StringUtils.isBlank(source)){
            return null;
        }else if (source.length() == Constants.TEN_INT) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        } else {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
        try {
            return simpleDateFormat.parse(source);
        } catch (Exception e) {
            logger.error(""+e);
        }
        return null;
    }
}
