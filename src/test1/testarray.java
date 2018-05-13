package test1;

public class testarray {


    //6D3B671F4E00672C901A 	活期一本通
    public static final byte[] ITEM_CURRENTONEPASSBOOK={(byte)0x6D,(byte)0x3B,(byte)0x67,(byte)0x1F,(byte)0x4E,(byte)0x00,(byte)0x67,(byte)0x2C,(byte)0x90,(byte)0x1A};
    //5B9A671F4E00672C901A 定期一本通
    public static final byte[] ITEM_FIXEDONEPASSBOOK={(byte)0x5B,(byte)0x9A,(byte)0x67,(byte)0x1F,(byte)0x4E,(byte)0x00,(byte)0x67,(byte)0x2C,(byte)0x90,(byte)0x1A};
    //5B9A671F5B586298 	定期存折
    public static final byte[] ITEM_FIXEDPASSBOOK ={(byte)0x5B,(byte)0x9A,(byte)0x67,(byte)0x1F,(byte)0x5B,(byte)0x58,(byte)0x62,(byte)0x98};
    //5B585355 存单
    public static final byte[] ITEM_DEPOSITBILL={(byte)0x5B,(byte)0x58,(byte)0x53,(byte)0x55};
    //56FD503A 	国债
    public static final byte[] ITEM_NATIONALDEBT={(byte)0x56,(byte)0xFD,(byte)0x50,(byte)0x3A};
    //59167CFB7EDF5E1053F7 外系统帐号
    public static final byte[] ITEM_OUTSYSTEMACCOUNT={(byte)0x59,(byte)0x16,(byte)0x7C,(byte)0xFB,(byte)0x7E,(byte)0xDF,(byte)0x5E,(byte)0x10,(byte)0x53,(byte)0xF7};
    //6D3B671F5B586298 	活期存折
    public static final byte[] ITEM_CURRENTPASSBOOK={(byte)0x6D,(byte)0x3B,(byte)0x67,(byte)0x1F,(byte)0x5B,(byte)0x58,(byte)0x62,(byte)0x98};
    //518590E85E10002F886859165E10 内部帐/表外帐
    public static final byte[] ITEM_INTERNALEXTERNAL={(byte)0x51,(byte)0x85,(byte)0x90,(byte)0xE8,(byte)0x5E,(byte)0x10,(byte)0x00,(byte)0x2F,(byte)0x88,(byte)0x68,(byte)0x59,(byte)0x16,(byte)0x5E,(byte)0x10};
    //5BF979C1518590E85E1053F7 	对私内部帐号
    public static final byte[] ITEM_INTERNALACCOUNT={(byte)0x5B,(byte)0xF9,(byte)0x79,(byte)0xC1,(byte)0x51,(byte)0x85,(byte)0x90,(byte)0xE8,(byte)0x5E,(byte)0x10,(byte)0x53,(byte)0xF7};
    //4FDD4ED8901A 保付通
    public static final byte[] ITEM_BAOFUTONG={(byte)0x4F,(byte)0xDD,(byte)0x4E,(byte)0xD8,(byte)0x90,(byte)0x1A};
    //4FE175285361 	信用卡
    public static final byte[] ITEM_CREDITCARD={(byte)0x4F,(byte)0xE1,(byte)0x75,(byte)0x28,(byte)0x53,(byte)0x61};
    //全部516890E8
    public static final byte[] ITEM_ALL={(byte)0x51,(byte)0x68,(byte)0x90,(byte)0xE8};
    //人民币4EBA6C115E01
    public static final byte[] ITEM_RMB={(byte)0x4E,(byte)0xBA,(byte)0x6C,(byte)0x11,(byte)0x5E,(byte)0x01};
    //英镑82F19551
    public static final byte[] ITEM_POUND={(byte)0x82,(byte)0xF1,(byte)0x95,(byte)0x51};
    //港币6E2F5E01
    public static final byte[] ITEM_HKD={(byte)0x6E,(byte)0x2F,(byte)0x5E,(byte)0x01};
    //美元7F8E5143
    public static final byte[] ITEM_DOLLAR={(byte)0x7F,(byte)0x8E,(byte)0x51,(byte)0x43};
    //瑞士法郎745E58EB6CD590CE
    public static final byte[] ITEM_SWISSFRANC={(byte)0x74,(byte)0x5E,(byte)0x58,(byte)0xEB,(byte)0x6C,(byte)0xD5,(byte)0x90,(byte)0xCE};
    //新加坡元65B052A057615143
    public static final byte[] ITEM_SGD={(byte)0x65,(byte)0xB0,(byte)0x52,(byte)0xA0,(byte)0x57,(byte)0x61,(byte)0x51,(byte)0x43};
    //日元65E55143
    public static final byte[] ITEM_YEN={(byte)0x65,(byte)0xE5,(byte)0x51,(byte)0x43};
    //加拿大元52A062FF59275143
    public static final byte[] ITEM_CAD={(byte)0x52,(byte)0xA0,(byte)0x62,(byte)0xFF,(byte)0x59,(byte)0x27,(byte)0x51,(byte)0x43};
    //澳元6FB35143
    public static final byte[] ITEM_AUD={(byte)0x6F,(byte)0xB3,(byte)0x51,(byte)0x43};
    //欧元6B275143
    public static final byte[] ITEM_EUR={(byte)0x6B,(byte)0x27,(byte)0x51,(byte)0x43};
    //年5E74
    public static final byte[] ITEM_YEAR={(byte)0x5E,(byte)0x74};
    //月6708
    public static final byte[] ITEM_MONTH={(byte)0x67,(byte)0x08};
    //日65E5
    public static final byte[] ITEM_DATE={(byte)0x65,(byte)0xE5};
    //钞949E
    public static final byte[] ITEM_CASH={(byte)0x94,(byte)0x9E};
    //汇6C47
    public static final byte[] ITEM_EXCHANGE={(byte)0x6C,(byte)0x47};
	public static byte[][] itemArray = {ITEM_ALL,ITEM_AUD,ITEM_BAOFUTONG,ITEM_CAD,ITEM_CASH};
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	byte[] tray = itemArray[1];
    	for(byte i = 0;i< 4;i++)
    	System.out.print((byte)tray[i]);
  
		
	}
}
