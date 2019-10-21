/*
Navicat MySQL Data Transfer

Source Server         : aliyun-root
Source Server Version : 80013
Source Host           : 39.105.3.245:3306
Source Database       : login_modular

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2019-10-21 15:09:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键递增',
  `name` varchar(128) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '书名',
  `author` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '作者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('1', '三国演义', '罗贯中');
INSERT INTO `book` VALUES ('2', '水浒传', '施耐庵');
