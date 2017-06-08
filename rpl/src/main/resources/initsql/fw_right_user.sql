/*
Navicat MySQL Data Transfer

Source Server         : 28mysql库
Source Server Version : 50611
Source Host           : 172.16.210.28:3306
Source Database       : road

Target Server Type    : MYSQL
Target Server Version : 50611
File Encoding         : 65001

Date: 2017-06-08 18:01:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `fw_right_user`
-- ----------------------------
DROP TABLE IF EXISTS `fw_right_user`;
CREATE TABLE `fw_right_user` (
  `ID` varchar(100) NOT NULL,
  `USER_CODE` varchar(100) DEFAULT NULL,
  `PASSWORD` varchar(300) DEFAULT NULL,
  `USER_TYPE` varchar(100) DEFAULT NULL,
  `EMAIL` varchar(300) DEFAULT NULL,
  `ORG_ID` varchar(300) DEFAULT NULL,
  `USER_NAME` varchar(300) DEFAULT NULL,
  `POST_ID` varchar(300) DEFAULT NULL,
  `IS_ENABLE` varchar(100) DEFAULT NULL,
  `IS_DELETED` varchar(100) DEFAULT NULL,
  `IS_ONLINE` varchar(100) DEFAULT NULL,
  `IS_LOCKED` varchar(100) DEFAULT NULL,
  `LOGIN_TIMES` int(11) DEFAULT NULL,
  `LOGIN_IP` varchar(100) DEFAULT NULL,
  `LAST_LOGIN_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `LOGIN_TIME` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `REG_TIME` date DEFAULT NULL,
  `CREATE_USER_CODE` varchar(100) DEFAULT NULL,
  `CREATE_USER_NAME` varchar(100) DEFAULT NULL,
  `CREATE_TIME` date DEFAULT NULL,
  `UPDATE_USER_CODE` varchar(100) DEFAULT NULL,
  `UPDATE_USER_NAME` varchar(100) DEFAULT NULL,
  `UPDATE_TIME` date DEFAULT NULL,
  `REMARK` varchar(1000) DEFAULT NULL,
  `DEPART_ID` varchar(300) DEFAULT NULL,
  `TELEPHONE` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fw_right_user
-- ----------------------------
INSERT INTO `fw_right_user` VALUES ('1', 'admin', '0192023A7BBD73250516F069DF18B500', 'FW_USER_USERTYPE_ADMIN', '16973066@qq.com', 'N000001', '超级管理员', '', '1', '0', '1', '0', '235', '192.168.1.100', '2017-06-07 10:57:44', '0000-00-00 00:00:00', '0000-00-00', 'admin', 'admin', '0000-00-00', 'admin', '超级管理员', '0000-00-00', 'dd', 'N000465', '13922301658');
INSERT INTO `fw_right_user` VALUES ('2', 'manager', '96E79218965EB72C92A549DD5A330112', 'FW_USER_USERTYPE_COMMON', '123@qq.com', 'N000001', '管理员', '', '1', '0', '1', '0', '130', '172.16.40.50', '2017-06-07 10:57:50', '0000-00-00 00:00:00', null, 'admin', '超级管理员', '0000-00-00', 'manager', '系统管理员', '0000-00-00', '系统操作管理员', '', '13122222222');
INSERT INTO `fw_right_user` VALUES ('3', 'yn', '96E79218965EB72C92A549DD5A330112', 'FW_USER_USERTYPE_COMMON', 'yn@qq.com', 'bd5c6c53-7235-4bc9-ac30-e841a2b12359', '云南省公路局', '', '1', '0', '1', '0', '5', '172.16.85.78', '2017-06-07 10:57:54', '0000-00-00 00:00:00', null, 'manager', '系统管理员', '0000-00-00', 'yn', '云南省公路局', '0000-00-00', '', 'bd5c6c53-7235-4bc9-ac30-e841a2b12359', '11111111');
INSERT INTO `fw_right_user` VALUES ('4', 'sd', '96E79218965EB72C92A549DD5A330112', 'FW_USER_USERTYPE_COMMON', '111@qq.com', '070cedb1-570a-48c5-9768-a118d0edf32d', '山东省公路局', '', '1', '0', '1', '0', '1201', '172.16.40.7', '2017-06-07 10:58:00', '0000-00-00 00:00:00', null, 'manager', '系统管理员', '0000-00-00', 'sd', '吴姿杨', '0000-00-00', '', 'N370000', '13111111111');
