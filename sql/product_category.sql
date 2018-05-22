/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : order_product

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-22 20:02:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `product_category`
-- ----------------------------
DROP TABLE IF EXISTS `product_category`;
CREATE TABLE `product_category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(64) DEFAULT NULL COMMENT '类目名称',
  `category_type` int(11) DEFAULT NULL COMMENT '类目编号',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_category
-- ----------------------------
INSERT INTO `product_category` VALUES ('1', '热榜', '11', '2018-05-19 19:39:24', '2018-05-19 19:39:24');
INSERT INTO `product_category` VALUES ('2', '好吃的', '22', '2018-05-19 19:39:26', '2018-05-19 19:39:26');

-- ----------------------------
-- Table structure for `product_info`
-- ----------------------------
DROP TABLE IF EXISTS `product_info`;
CREATE TABLE `product_info` (
  `product_id` varchar(32) NOT NULL,
  `product_name` varchar(64) DEFAULT NULL COMMENT '商品名称',
  `product_price` decimal(8,2) DEFAULT NULL COMMENT '单价',
  `product_stock` int(11) DEFAULT NULL COMMENT '库存',
  `product_description` varchar(64) DEFAULT NULL COMMENT '描述',
  `product_icon` varchar(1000) DEFAULT NULL COMMENT '图标',
  `product_status` tinyint(3) DEFAULT NULL COMMENT '商品状态 0 正常  1 下架',
  `category_type` int(11) DEFAULT NULL COMMENT '类目编号',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_info
-- ----------------------------
INSERT INTO `product_info` VALUES ('a7763b095b5011e8995de0d55e1acef9', '皮蛋粥', '0.01', '39', '好吃的皮蛋粥', 'https://gss0.bdstatic.com/94o3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike80%2C5%2C5%2C80%2C26/sign=5cbe53d851b5c9ea76fe0bb1b450dd65/71cf3bc79f3df8dcb925ea42c711728b461028cc.jpg', '0', '11', '2018-05-20 18:28:31', '2018-05-20 18:28:31');
INSERT INTO `product_info` VALUES ('ac06ed985b5011e8995de0d55e1acef9', '慕斯蛋糕', '10.90', '90', '美味爽口', 'https://f10.baidu.com/it/u=2868277513,3697311836&fm=72', '1', '11', '2018-05-20 18:28:32', '2018-05-20 18:28:32');
INSERT INTO `product_info` VALUES ('af4020115b5011e8995de0d55e1acef9', '蜜汁鸡翅', '0.02', '982', '好吃', 'https://f10.baidu.com/it/u=3542157779,4219880271&fm=72', '0', '11', '2018-05-20 18:28:33', '2018-05-20 18:28:33');
