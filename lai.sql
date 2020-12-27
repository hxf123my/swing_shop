/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50717
Source Host           : 127.0.0.1:3306
Source Database       : lai

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-12-26 17:01:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `shop`
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Sname` varchar(255) NOT NULL,
  `kind` varchar(255) NOT NULL,
  `price` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shop
-- ----------------------------
INSERT INTO `shop` VALUES ('1', '可乐', '饮料', '3');
INSERT INTO `shop` VALUES ('2', 'AD钙', '饮料', '2');
INSERT INTO `shop` VALUES ('3', '巧克力', '糖', '5');
INSERT INTO `shop` VALUES ('4', '棒棒糖', '糖', '1');
INSERT INTO `shop` VALUES ('5', '薯片', '膨化食品', '4');
INSERT INTO `shop` VALUES ('6', '虾条', '膨化食品', '3.5');
INSERT INTO `shop` VALUES ('7', '士大夫', '阿凡达', '11');
INSERT INTO `shop` VALUES ('8', '阿斯蒂', '大声', '1.2');
INSERT INTO `shop` VALUES ('9', '阿道', '撒', '1');
INSERT INTO `shop` VALUES ('12', '额', '阿凡达', '1');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('123', 'aa');
