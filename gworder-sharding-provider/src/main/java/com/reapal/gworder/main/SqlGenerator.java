package com.reapal.gworder.main;

/**
 * Created by jack-cooper on 2017/2/13.
 */
public class SqlGenerator {
    public static void main(String[] args) {
        String sql = "drop database if exists gworders;\n" +
                "CREATE database gworders DEFAULT CHARACTER SET utf8;";
        String tableSql = "CREATE TABLE gworders.`GW_ORDERS` (\n" +
                "  `order_id` bigint(64) NOT NULL,\n" +
                "  `service` varchar(64) NOT NULL,\n" +
                "  `merchant_order_no` varchar(128) NOT NULL,\n" +
                "  `merchant_id` varchar(22) NOT NULL,\n" +
                "  `seller_name` varchar(100) NOT NULL,\n" +
                "  `seller_id` varchar(22) NOT NULL,\n" +
                "  `buyer_name` varchar(100) DEFAULT NULL,\n" +
                "  `buyer_id` varchar(22) DEFAULT NULL,\n" +
                "  `seller_remarks` varchar(512) DEFAULT NULL,\n" +
                "  `buyer_remarks` varchar(512) DEFAULT NULL,\n" +
                "  `buyer_realname` varchar(32) DEFAULT NULL,\n" +
                "  `buyer_contact` varchar(64) DEFAULT NULL,\n" +
                "  `price` decimal(10,0) NOT NULL,\n" +
                "  `query_key` varchar(64) DEFAULT NULL,\n" +
                "  `quantity` decimal(10,0) NOT NULL,\n" +
                "  `sign_type` varchar(10) NOT NULL,\n" +
                "  `charsets` varchar(10) NOT NULL,\n" +
                "  `currency` varchar(4) NOT NULL,\n" +
                "  `order_date` varchar(14) NOT NULL,\n" +
                "  `exp_dates` varchar(5) NOT NULL,\n" +
                "  `ips` varchar(20) NOT NULL,\n" +
                "  `ordersts` varchar(64) NOT NULL,\n" +
                "  `return_url` varchar(512) DEFAULT NULL,\n" +
                "  `notify_url` varchar(512) DEFAULT NULL,\n" +
                "  `subject` varchar(256) NOT NULL,\n" +
                "  `bodys` varchar(512) NOT NULL,\n" +
                "  `amount` decimal(10,0) NOT NULL,\n" +
                "  `price_changed` decimal(1,0) DEFAULT NULL,\n" +
                "  `api_version` varchar(20) DEFAULT NULL,\n" +
                "  `locale` varchar(10) NOT NULL,\n" +
                "  `preference` varchar(25) DEFAULT NULL,\n" +
                "  `refund_amount` decimal(19,0) DEFAULT NULL,\n" +
                "  `refund_sts` varchar(10) DEFAULT NULL,\n" +
                "  `order_type` varchar(3) NOT NULL,\n" +
                "  `pay_method` varchar(10) DEFAULT NULL,\n" +
                "  `service_fee` decimal(10,0) DEFAULT NULL,\n" +
                "  `agentid` varchar(22) DEFAULT NULL,\n" +
                "  `close_date_time` datetime DEFAULT NULL,\n" +
                "  `show_url` varchar(512) DEFAULT NULL,\n" +
                "  `token_id` varchar(100) DEFAULT NULL,\n" +
                "  `member_ip` varchar(30) DEFAULT NULL,\n" +
                "  `terminal_info` varchar(100) DEFAULT NULL,\n" +
                "  `terminal_type` varchar(64) DEFAULT NULL,\n" +
                "  `business_id` varchar(6) DEFAULT NULL,\n" +
                "  `product_type` varchar(100) DEFAULT NULL,\n" +
                "  `result_code` varchar(6) DEFAULT NULL,\n" +
                "  `result_msg` varchar(64) DEFAULT NULL,\n" +
                "  `modify_date_time` datetime DEFAULT NULL,\n" +
                "  `modify_user_id` varchar(20) DEFAULT NULL,\n" +
                "  `delete_flag` varchar(1) DEFAULT NULL,\n" +
                "  `create_date_time` datetime NOT NULL,\n" +
                "  `create_user_id` varchar(20) DEFAULT NULL,\n" +
                "  `product_category_id` varchar(20) DEFAULT NULL,\n" +
                "  `product_id` varchar(20) DEFAULT NULL,\n" +
                "  `api_type` varchar(20) DEFAULT NULL,\n" +
                "  `member_id` varchar(50) DEFAULT NULL,\n" +
                "  `refund_amount_sure` decimal(10,0) DEFAULT NULL,\n" +
                "  `protocol_no` varchar(50) DEFAULT NULL,\n" +
                "  `bind_id` varchar(50) DEFAULT NULL,\n" +
                "  `card_type` varchar(2) DEFAULT NULL,\n" +
                "  `identify_flag` varchar(2) DEFAULT NULL,\n" +
                "  `charge_purpose` varchar(1) DEFAULT NULL,\n" +
                "  `sms_check` varchar(1) DEFAULT NULL,\n" +
                "  `device_id` varchar(50) DEFAULT NULL,\n" +
                "  `discount_amount` decimal(10,0) DEFAULT NULL,\n" +
                "  `real_amount` decimal(10,0) DEFAULT NULL,\n" +
                "  PRIMARY KEY (`order_id`),\n" +
                "  KEY `idx_order_id` (`order_id`),\n" +
                "  KEY `idx_service` (`service`),\n" +
                "  KEY `idx_merchantorderno` (`merchant_order_no`),\n" +
                "  KEY `idx_merchantid` (`merchant_id`),\n" +
                "  KEY `idx_buyername` (`buyer_name`)\n" +
                ") ENGINE=InnoDB DEFAULT CHARSET=utf8;";
        generateDDLSql(sql,tableSql,4,8,"gworders","GW_ORDERS");
    }

    public static void generateDDLSql(String sql,String tableSql,int dbNum,int tableNum,String dbKeyWord,String tableKyeWord){
        for(int i = 0 ; i < dbNum ; i++) { //数据库
            String tempSql = sql.replaceAll(dbKeyWord,dbKeyWord + (i<10?"0"+i:i));
            System.out.println("-- ====================database"+i+"====================== --");
            System.out.println(tempSql);
            for(int j = 0 ; j < tableNum ; j++){
                String tempTabelSql = tableSql
                        .replaceAll(dbKeyWord,dbKeyWord + (i<10?"0"+i:i))
                        .replaceAll(tableKyeWord,tableKyeWord+"_"+j);
                System.out.println(tempTabelSql);
            }
            System.out.println("\n\n\n");
        }
    }
}
