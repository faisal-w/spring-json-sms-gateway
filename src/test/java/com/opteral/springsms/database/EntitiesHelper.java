package com.opteral.springsms.database;

import com.opteral.springsms.model.SMS;

import java.sql.Timestamp;

public class EntitiesHelper {
    public static final long SMS_ID = 1;
    public static final int USER_ID = 1;
    public static final String USER_NAME = "amalio";
    public static final String SENDER = "sender";
    public static final String MSISDN = "34656987415";
    public static final String TEXT = "The text of message with an ñ";
    public static final String SUBID = "subid1";
    public static final String ACKURL = "http://www.anurl.com/ack";
    public static final Timestamp DATETIME_SCHEDULED_2015 = new Timestamp(1451208600000L);
    public static final Timestamp DATETIME_SCHEDULED_2014 = new Timestamp(1419672600000L);


    private EntitiesHelper() {
        throw new UnsupportedOperationException("this class is a helper");
    }


    public static SMS newSMS() {

        SMS sms = new SMS();

        sms.setId(SMS_ID);
        sms.setUser_id(USER_ID);
        sms.setSender(SENDER);
        sms.setMsisdn(MSISDN);
        sms.setText(TEXT);
        sms.setSms_status(SMS.SMS_Status.SCHEDULED);
        sms.setSubid(SUBID);
        sms.setAckurl(ACKURL);
        sms.setDatetimeScheduled(DATETIME_SCHEDULED_2015);
        sms.setDatetimeLastModified(DATETIME_SCHEDULED_2014);
        sms.setTest(false);

        return sms;
    }

}
