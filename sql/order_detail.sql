/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : order

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-22 20:03:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `order_detail`
-- ----------------------------
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE `order_detail` (
  `detail_id` varchar(255) NOT NULL,
  `order_id` varchar(255) DEFAULT NULL,
  `product_id` varchar(255) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `product_price` decimal(8,2) DEFAULT NULL COMMENT '当前价格',
  `product_quantity` int(11) DEFAULT NULL,
  `product_icon` varchar(255) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_detail
-- ----------------------------
INSERT INTO `order_detail` VALUES ('1', '1', 'a7763b095b5011e8995de0d55e1acef9', '皮蛋粥', '0.01', '2', 'https://gss0.bdstatic.com/94o3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=5cbe53d851b5c9ea76fe0bb1b450dd65/71cf3bc79f3df8dcb925ea42c711728b461028cc.jpg', '2018-05-20 20:14:03', '2018-05-20 20:14:03');

-- ----------------------------
-- Table structure for `order_master`
-- ----------------------------
DROP TABLE IF EXISTS `order_master`;
CREATE TABLE `order_master` (
  `order_id` varchar(32) NOT NULL,
  `buyer_name` varchar(255) DEFAULT NULL,
  `buyer_phone` varchar(255) DEFAULT NULL,
  `buyer_address` varchar(255) DEFAULT NULL,
  `buyer_openid` varchar(255) DEFAULT NULL,
  `order_amount` decimal(8,2) DEFAULT NULL COMMENT '订单总金额',
  `order_status` tinyint(3) DEFAULT NULL COMMENT '订单Id',
  `pay_status` tinyint(3) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_master
-- ----------------------------
INSERT INTO `order_master` VALUES ('1', '冯二龙', '18215576765', '成都旸谷', 'weixinopenId', '2.50', '0', '0', '2018-05-20 20:10:26', '2018-05-20 20:10:26');
INSERT INTO `order_master` VALUES ('1526823217690242249', '张三', '18215576765', '成都旸谷', '2464614313', '1.00', '0', '0', '2018-05-20 21:33:37', '2018-05-20 21:33:37');
