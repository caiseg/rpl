/*
Navicat MySQL Data Transfer

Source Server         : 28mysql库
Source Server Version : 50611
Source Host           : 172.16.210.28:3306
Source Database       : road

Target Server Type    : MYSQL
Target Server Version : 50611
File Encoding         : 65001

Date: 2017-06-15 18:32:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `base_datathird_dic`
-- ----------------------------
DROP TABLE IF EXISTS `base_datathird_dic`;
CREATE TABLE `base_datathird_dic` (
  `datathird_dic_id` varchar(100) NOT NULL,
  `parent_id` varchar(100) DEFAULT NULL,
  `attribute_item` varchar(100) NOT NULL,
  `attribute_desc` varchar(100) NOT NULL,
  `attribute_code` varchar(100) NOT NULL,
  `attribute_value` varchar(120) NOT NULL,
  `attribute_active` int(11) DEFAULT '0',
  `create_user_id` varchar(100) DEFAULT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `update_user_id` varchar(100) DEFAULT NULL,
  `update_time` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `seq_no` int(5) DEFAULT '0',
  PRIMARY KEY (`datathird_dic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_datathird_dic
-- ----------------------------
INSERT INTO `base_datathird_dic` VALUES ('1', null, 'APPLICANT_TYPE', '申请企业类型', '1', '承运单位', '0', 'ceshi', '2017-04-17 09:55:27', 'ceshi', '2017-04-17 09:55:33', '1');
INSERT INTO `base_datathird_dic` VALUES ('10', null, 'REQUEST_STATUS', '申请状态', '05', '变更(签发)', '0', 'ceshi', '2017-04-17 16:19:15', 'ceshi', '2017-04-17 16:19:07', '10');
INSERT INTO `base_datathird_dic` VALUES ('11', null, 'REQUEST_STATUS', '申请状态', '10', '待受理', '0', 'ceshi', '2017-04-17 16:19:47', 'ceshi', '2017-04-17 16:19:42', '11');
INSERT INTO `base_datathird_dic` VALUES ('12', null, 'REQUEST_STATUS', '申请状态', '11', '退回(受理)', '0', 'ceshi', '2017-04-17 16:20:15', 'ceshi', '2017-04-17 16:20:13', '12');
INSERT INTO `base_datathird_dic` VALUES ('13', null, 'REQUEST_STATUS', '申请状态', '20', '待初审', '0', 'ceshi', '2017-04-17 16:21:03', 'ceshi', '2017-04-17 16:20:41', '13');
INSERT INTO `base_datathird_dic` VALUES ('14', null, 'REQUEST_STATUS', '申请状态', '21', '退回(初审)', '0', 'ceshi', '2017-04-17 16:21:25', 'ceshi', '2017-04-17 16:21:21', '14');
INSERT INTO `base_datathird_dic` VALUES ('15', null, 'REQUEST_STATUS', '申请状态', '30', '待复审', '0', 'ceshi', '2017-04-17 16:22:17', 'ceshi', '2017-04-17 16:22:14', '15');
INSERT INTO `base_datathird_dic` VALUES ('16', null, 'REQUEST_STATUS', '申请状态', '31', '退回(复审)', '0', 'ceshi', '2017-04-17 16:22:46', 'ceshi', '2017-04-17 16:22:43', '16');
INSERT INTO `base_datathird_dic` VALUES ('17', null, 'REQUEST_STATUS', '申请状态', '40', '待缴费', '0', 'ceshi', '2017-04-17 16:23:15', 'ceshi', '2017-04-17 16:23:12', '17');
INSERT INTO `base_datathird_dic` VALUES ('18', null, 'REQUEST_STATUS', '申请状态', '41', '退回(缴费)', '0', 'ceshi', '2017-04-17 16:23:40', 'ceshi', '2017-04-17 16:23:38', '18');
INSERT INTO `base_datathird_dic` VALUES ('19', null, 'REQUEST_STATUS', '申请状态', '50', '待签发', '0', 'ceshi', '2017-04-17 16:24:14', 'ceshi', '2017-04-17 16:24:07', '19');
INSERT INTO `base_datathird_dic` VALUES ('2', null, 'APPLICANT_TYPE', '申请企业类型', '2', '个体户', '0', 'ceshi', '2017-04-17 16:13:13', 'ceshi', '2017-04-17 16:12:20', '2');
INSERT INTO `base_datathird_dic` VALUES ('20', null, 'REQUEST_STATUS', '申请状态', '51', '退回(签发)', '0', 'ceshi', '2017-04-17 16:24:38', 'ceshi', '2017-04-17 16:24:35', '20');
INSERT INTO `base_datathird_dic` VALUES ('21', null, 'REQUEST_STATUS', '申请状态', '60', '生效', '0', 'ceshi', '2017-04-17 16:25:04', 'ceshi', '2017-04-17 16:24:59', '21');
INSERT INTO `base_datathird_dic` VALUES ('22', null, 'REQUEST_STATUS', '申请状态', '90', '取消', '0', 'ceshi', '2017-04-17 16:55:07', 'ceshi', '2017-04-17 16:25:59', '22');
INSERT INTO `base_datathird_dic` VALUES ('23', null, 'REQUEST_STATUS', '申请状态', '91', '终止', '0', 'ceshi', '2017-04-17 16:26:29', 'ceshi', '2017-04-17 16:26:25', '23');
INSERT INTO `base_datathird_dic` VALUES ('24', null, 'REQUEST_STATUS', '申请状态', '92', '撤销', '0', 'ceshi', '2017-04-17 16:27:01', 'ceshi', '2017-04-17 16:26:58', '24');
INSERT INTO `base_datathird_dic` VALUES ('25', null, 'VEHICLE_KIND', '车辆分类', '20', '普通货车', '0', 'ceshi', '2017-04-17 16:28:23', 'ceshi', '2017-04-17 16:28:27', '25');
INSERT INTO `base_datathird_dic` VALUES ('26', null, 'VEHICLE_KIND', '车辆分类', '31', '集装箱车', '0', 'ceshi', '2017-04-17 16:29:23', 'ceshi', '2017-04-17 16:29:21', '26');
INSERT INTO `base_datathird_dic` VALUES ('27', null, 'VEHICLE_KIND', '车辆分类', '32', '大件运输车', '0', 'ceshi', '2017-04-17 16:29:56', 'ceshi', '2017-04-17 16:29:53', '27');
INSERT INTO `base_datathird_dic` VALUES ('28', null, 'VEHICLE_KIND', '车辆分类', '33', '保温冷藏车', '0', 'ceshi', '2017-04-17 16:30:25', 'ceshi', '2017-04-17 16:30:22', '28');
INSERT INTO `base_datathird_dic` VALUES ('29', null, 'VEHICLE_KIND', '车辆分类', '34', '商品车专用运输车', '0', 'ceshi', '2017-04-17 16:30:49', 'ceshi', '2017-04-17 16:30:47', '29');
INSERT INTO `base_datathird_dic` VALUES ('3', null, 'REQUEST_TYPE', '申请类型', '1', '单次申请', '0', 'ceshi', '2017-04-17 16:13:22', 'ceshi', '2017-04-17 16:13:20', '3');
INSERT INTO `base_datathird_dic` VALUES ('30', null, 'VEHICLE_KIND', '车辆分类', '35', '罐车', '0', 'ceshi', '2017-04-17 16:31:16', 'ceshi', '2017-04-17 16:31:13', '30');
INSERT INTO `base_datathird_dic` VALUES ('31', null, 'VEHICLE_KIND', '车辆分类', '36', '牵引车', '0', 'ceshi', '2017-04-17 16:31:46', 'ceshi', '2017-04-17 16:31:41', '31');
INSERT INTO `base_datathird_dic` VALUES ('32', null, 'VEHICLE_KIND', '车辆分类', '37', '挂车', '0', 'ceshi', '2017-04-17 16:32:09', 'ceshi', '2017-04-17 16:32:07', '32');
INSERT INTO `base_datathird_dic` VALUES ('33', null, 'VEHICLE_KIND', '车辆分类', '38', '平板车', '0', 'ceshi', '2017-04-17 16:32:34', 'ceshi', '2017-04-17 16:32:32', '33');
INSERT INTO `base_datathird_dic` VALUES ('34', null, 'VEHICLE_KIND', '车辆分类', '40', '危险品运输车', '0', 'ceshi', '2017-04-17 16:33:03', 'ceshi', '2017-04-17 16:33:01', '34');
INSERT INTO `base_datathird_dic` VALUES ('35', null, 'VEHICLE_KIND', '车辆分类', '90', '其他车辆', '0', 'ceshi', '2017-04-17 16:34:51', 'ceshi', '2017-04-17 16:33:58', '35');
INSERT INTO `base_datathird_dic` VALUES ('36', null, 'ESCORT_TYPE', '护送方式', '0', '不护送', '0', 'ceshi', '2017-04-17 16:45:08', 'ceshi', '0000-00-00 00:00:00', '36');
INSERT INTO `base_datathird_dic` VALUES ('37', null, 'ESCORT_TYPE', '护送方式', '1', '承运单位护送', '0', 'ceshi', '2017-04-17 16:45:11', 'ceshi', '2017-04-17 16:45:03', '37');
INSERT INTO `base_datathird_dic` VALUES ('38', null, 'ESCORT_TYPE', '护送方式', '2', '承运单位护送', '0', 'ceshi', '2017-04-17 16:45:17', 'ceshi', '2017-04-17 16:45:05', '38');
INSERT INTO `base_datathird_dic` VALUES ('39', null, 'REINFORCE', '加固改造', '0', '无', '0', 'ceshi', '2017-04-17 16:47:12', 'ceshi', '2017-04-17 16:47:13', '39');
INSERT INTO `base_datathird_dic` VALUES ('4', null, 'REQUEST_TYPE', '申请类型', '2', '长期申请', '0', 'ceshi', '2017-04-17 16:14:20', 'ceshi', '2017-04-17 16:14:15', '4');
INSERT INTO `base_datathird_dic` VALUES ('40', null, 'REINFORCE', '加固改造', '1', '临时改造', '0', 'ceshi', '2017-04-17 16:47:14', 'ceshi', '2017-04-17 16:47:15', '40');
INSERT INTO `base_datathird_dic` VALUES ('41', null, 'REINFORCE', '加固改造', '2', '长期改造', '0', 'ceshi', '2017-04-17 16:47:20', 'ceshi', '2017-04-17 16:47:17', '41');
INSERT INTO `base_datathird_dic` VALUES ('42', null, 'OPT_CODE', '处理状态', '110', '提交申请', '0', 'ceshi', '2017-04-17 16:53:03', 'ceshi', '0000-00-00 00:00:00', '42');
INSERT INTO `base_datathird_dic` VALUES ('43', null, 'OPT_CODE', '处理状态', '111', '提交变更(受理)', '0', 'ceshi', '2017-04-17 16:53:05', 'ceshi', '0000-00-00 00:00:00', '43');
INSERT INTO `base_datathird_dic` VALUES ('44', null, 'OPT_CODE', '处理状态', '112', '提交变更(初审)', '0', 'ceshi', '2017-04-17 16:53:07', 'ceshi', '0000-00-00 00:00:00', '44');
INSERT INTO `base_datathird_dic` VALUES ('45', null, 'OPT_CODE', '提交申请', '113', '提交变更(复审)', '0', 'ceshi', '2017-04-17 16:53:08', 'ceshi', '0000-00-00 00:00:00', '45');
INSERT INTO `base_datathird_dic` VALUES ('46', null, 'OPT_CODE', '处理状态', '114', '提交变更(缴费)', '0', 'ceshi', '2017-04-17 16:53:10', 'ceshi', '0000-00-00 00:00:00', '46');
INSERT INTO `base_datathird_dic` VALUES ('47', null, 'OPT_CODE', '处理状态', '115', '提交变更(签发)', '0', 'ceshi', '2017-04-17 16:53:11', 'ceshi', '0000-00-00 00:00:00', '47');
INSERT INTO `base_datathird_dic` VALUES ('48', null, 'OPT_CODE', '处理状态', '121', '缴费支付', '0', 'ceshi', '2017-04-17 16:53:12', 'ceshi', '0000-00-00 00:00:00', '48');
INSERT INTO `base_datathird_dic` VALUES ('49', null, 'OPT_CODE', '处理状态', '190', '取消申请', '0', 'ceshi', '2017-04-17 16:53:15', 'ceshi', '0000-00-00 00:00:00', '49');
INSERT INTO `base_datathird_dic` VALUES ('5', null, 'REQUEST_STATUS', '申请状态', '00', '草稿', '0', 'ceshi', '2017-04-17 16:14:55', 'ceshi', '2017-04-17 16:14:52', '5');
INSERT INTO `base_datathird_dic` VALUES ('50', null, 'OPT_CODE', '处理状态', '201', '受理退回', '0', 'ceshi', '2017-04-17 16:53:16', 'ceshi', '0000-00-00 00:00:00', '50');
INSERT INTO `base_datathird_dic` VALUES ('51', null, 'OPT_CODE', '处理状态', '202', '受理通过', '0', 'ceshi', '2017-04-17 16:53:18', 'ceshi', '0000-00-00 00:00:00', '51');
INSERT INTO `base_datathird_dic` VALUES ('52', null, 'OPT_CODE', '处理状态', '221', '初审退回', '0', 'ceshi', '2017-04-17 16:53:19', 'ceshi', '0000-00-00 00:00:00', '52');
INSERT INTO `base_datathird_dic` VALUES ('53', null, 'OPT_CODE', '处理状态', '222', '初审通过', '0', 'ceshi', '2017-04-17 16:53:19', 'ceshi', '0000-00-00 00:00:00', '53');
INSERT INTO `base_datathird_dic` VALUES ('54', null, 'OPT_CODE', '处理状态', '231', '复审退回', '0', 'ceshi', '2017-04-17 16:53:20', 'ceshi', '0000-00-00 00:00:00', '54');
INSERT INTO `base_datathird_dic` VALUES ('55', null, 'OPT_CODE', '处理状态', '232', '复审通过', '0', 'ceshi', '2017-04-17 16:53:23', 'ceshi', '0000-00-00 00:00:00', '55');
INSERT INTO `base_datathird_dic` VALUES ('56', null, 'OPT_CODE', '处理状态', '241', '缴费退回', '0', 'ceshi', '2017-04-17 16:53:25', 'ceshi', '0000-00-00 00:00:00', '56');
INSERT INTO `base_datathird_dic` VALUES ('57', null, 'OPT_CODE', '处理状态', '242', '缴费通过', '0', 'ceshi', '2017-04-17 16:53:26', 'ceshi', '0000-00-00 00:00:00', '57');
INSERT INTO `base_datathird_dic` VALUES ('58', null, 'OPT_CODE', '处理状态', '251', '签批退回', '0', 'ceshi', '2017-04-17 16:53:27', 'ceshi', '0000-00-00 00:00:00', '58');
INSERT INTO `base_datathird_dic` VALUES ('59', null, 'OPT_CODE', '处理状态', '252', '签批通过', '0', 'ceshi', '2017-04-17 16:53:30', 'ceshi', '0000-00-00 00:00:00', '59');
INSERT INTO `base_datathird_dic` VALUES ('60', null, 'OPT_CODE', '处理状态', '291', '终止流程', '0', 'ceshi', '2017-04-17 16:57:36', 'ceshi', '0000-00-00 00:00:00', '60');
INSERT INTO `base_datathird_dic` VALUES ('61', null, 'OPT_CODE', '处理状态', '292', '撤销许可', '0', 'ceshi', '2017-04-17 16:57:37', 'ceshi', '0000-00-00 00:00:00', '61');
INSERT INTO `base_datathird_dic` VALUES ('62', null, 'OPT_CODE', '处理状态', '911', '查验材料', '0', 'ceshi', '2017-04-17 16:57:39', 'ceshi', '0000-00-00 00:00:00', '62');
INSERT INTO `base_datathird_dic` VALUES ('63', null, 'OPT_CODE', '处理状态', '912', '核查车货', '0', 'ceshi', '2017-04-17 16:57:42', 'ceshi', '0000-00-00 00:00:00', '63');
INSERT INTO `base_datathird_dic` VALUES ('64', null, 'OPT_CODE', '处理状态', '913', '核查线路', '0', 'ceshi', '2017-04-17 16:57:45', 'ceshi', '0000-00-00 00:00:00', '64');
INSERT INTO `base_datathird_dic` VALUES ('65', null, 'OPT_CODE', '处理状态', '921', '勘验桥梁', '0', 'ceshi', '2017-04-17 16:57:47', 'ceshi', '0000-00-00 00:00:00', '65');
INSERT INTO `base_datathird_dic` VALUES ('66', null, 'OPT_CODE', '处理状态', '922', '勘验涵洞', '0', 'ceshi', '2017-04-17 16:57:48', 'ceshi', '0000-00-00 00:00:00', '66');
INSERT INTO `base_datathird_dic` VALUES ('67', null, 'OPT_CODE', '处理状态', '931', '施工验收', '0', 'ceshi', '2017-04-17 16:57:50', 'ceshi', '0000-00-00 00:00:00', '67');
INSERT INTO `base_datathird_dic` VALUES ('68', null, 'OPT_CODE', '处理状态', '999', '其他处理', '0', 'ceshi', '2017-04-17 16:57:52', 'ceshi', '0000-00-00 00:00:00', '68');
INSERT INTO `base_datathird_dic` VALUES ('69', null, 'PAY_TYPE', '费用种类', '1', '公路补偿费', '0', 'ceshi', '2017-04-17 17:01:52', 'ceshi', '0000-00-00 00:00:00', '69');
INSERT INTO `base_datathird_dic` VALUES ('7', null, 'REQUEST_STATUS', '申请状态', '02', '变更(初审)', '0', 'ceshi', '2017-04-17 16:16:19', 'ceshi', '2017-04-17 16:16:16', '7');
INSERT INTO `base_datathird_dic` VALUES ('70', null, 'PAY_TYPE', '费用种类', '2', '运输护送费', '0', 'ceshi', '2017-04-17 17:02:08', 'ceshi', '0000-00-00 00:00:00', '70');
INSERT INTO `base_datathird_dic` VALUES ('71', null, 'PAY_CHECK', '支付核实结果', '0', '未核实', '0', 'ceshi', '2017-04-17 17:03:54', 'ceshi', '0000-00-00 00:00:00', '71');
INSERT INTO `base_datathird_dic` VALUES ('72', null, 'PAY_CHECK', '支付核实结果', '1', '有效', '0', 'ceshi', '2017-04-17 17:03:55', 'ceshi', '0000-00-00 00:00:00', '72');
INSERT INTO `base_datathird_dic` VALUES ('73', null, 'PAY_CHECK', '支付核实结果', '9', '无效', '0', 'ceshi', '2017-04-17 17:03:59', 'ceshi', '0000-00-00 00:00:00', '73');
INSERT INTO `base_datathird_dic` VALUES ('74', null, 'HURRAY_STATUS', '催办状态', '0', '待反馈', '0', null, '2017-04-17 17:05:18', null, '0000-00-00 00:00:00', '0');
INSERT INTO `base_datathird_dic` VALUES ('75', null, 'HURRAY_STATUS', '催办状态', '1', '已反馈', '0', null, '2017-04-17 17:05:22', null, '0000-00-00 00:00:00', '0');
INSERT INTO `base_datathird_dic` VALUES ('76', null, 'HURRAY_STATUS', '催办状态', '9', '已撤销', '0', null, '2017-04-17 17:05:27', null, '0000-00-00 00:00:00', '0');
INSERT INTO `base_datathird_dic` VALUES ('77', null, 'HURRAY_TYPE', '催办类型', '1', '加急', '0', null, '2017-04-17 17:05:33', null, '0000-00-00 00:00:00', '0');
INSERT INTO `base_datathird_dic` VALUES ('78', null, 'HURRAY_TYPE', '催办类型', '2', '逾期', '0', null, '2017-04-17 17:07:15', null, '0000-00-00 00:00:00', '0');
INSERT INTO `base_datathird_dic` VALUES ('8', null, 'REQUEST_STATUS', '申请状态', '03', '变更(复审)', '0', 'ceshi', '2017-04-17 16:17:54', 'ceshi', '2017-04-17 16:17:49', '8');
INSERT INTO `base_datathird_dic` VALUES ('9', null, 'REQUEST_STATUS', '申请状态', '04', '变更(缴费)', '0', 'ceshi', '2017-04-17 16:18:42', 'ceshi', '2017-04-17 16:18:33', '9');

-- ----------------------------
-- Table structure for `fw_pl_module`
-- ----------------------------
DROP TABLE IF EXISTS `fw_pl_module`;
CREATE TABLE `fw_pl_module` (
  `id` varchar(40) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user_code` varchar(100) DEFAULT NULL,
  `create_user_name` varchar(100) DEFAULT NULL,
  `icon_cls` varchar(600) DEFAULT NULL,
  `is_deleted` varchar(100) DEFAULT NULL,
  `is_enable` varchar(100) DEFAULT NULL,
  `module_level` varchar(100) DEFAULT NULL,
  `module_link` varchar(300) DEFAULT NULL,
  `module_name` varchar(300) DEFAULT NULL,
  `open_type` varchar(100) DEFAULT NULL,
  `parent_ids` varchar(600) DEFAULT NULL,
  `parent_id` varchar(300) DEFAULT NULL,
  `permission` varchar(100) DEFAULT NULL,
  `remark` varchar(1000) DEFAULT NULL,
  `server_id` varchar(300) DEFAULT NULL,
  `system_id` varchar(300) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user_code` varchar(100) DEFAULT NULL,
  `update_user_name` varchar(100) DEFAULT NULL,
  `is_menu` varchar(2) DEFAULT NULL,
  `sort` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fw_pl_module
-- ----------------------------
INSERT INTO `fw_pl_module` VALUES ('1', null, null, null, null, null, '1', null, '', '根菜单', null, '0', '0', '', null, null, null, null, null, null, '1', null);
INSERT INTO `fw_pl_module` VALUES ('2', null, null, null, null, null, '1', null, null, '首页', null, '0,1', '1', '', null, null, null, null, null, null, '1', null);
INSERT INTO `fw_pl_module` VALUES ('3', null, null, null, null, null, '1', null, null, '系统管理', null, '0,1', '1', '', null, null, null, null, null, null, '1', null);
INSERT INTO `fw_pl_module` VALUES ('4', null, null, null, null, null, '1', null, null, '路面管理', null, '0,1', '1', '', null, null, null, null, null, null, '1', null);
INSERT INTO `fw_pl_module` VALUES ('5', null, null, null, null, null, '1', null, '', '桥梁管理', null, '0,1', '1', '', null, null, null, null, null, null, '1', null);
INSERT INTO `fw_pl_module` VALUES ('6', null, null, null, null, null, '1', null, null, '系统设置', null, '0,1,3', '3', null, null, null, null, null, null, null, '1', null);
INSERT INTO `fw_pl_module` VALUES ('7', null, null, null, null, null, '1', null, '/user/index', '用户管理', null, '0,1,3,6', '6', 'user', null, null, null, null, null, null, '1', null);
INSERT INTO `fw_pl_module` VALUES ('8', null, null, null, null, null, '1', null, '/role/index', '角色管理', null, '0,1,3,6', '6', 'role', null, null, null, null, null, null, '1', null);

-- ----------------------------
-- Table structure for `fw_pl_system`
-- ----------------------------
DROP TABLE IF EXISTS `fw_pl_system`;
CREATE TABLE `fw_pl_system` (
  `id` varchar(40) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user_code` varchar(100) DEFAULT NULL,
  `create_user_name` varchar(100) DEFAULT NULL,
  `default_seq_no` decimal(22,0) DEFAULT NULL,
  `icon_cls` varchar(600) DEFAULT NULL,
  `is_deleted` varchar(10) DEFAULT NULL,
  `is_enabled` varchar(10) DEFAULT NULL,
  `need_check` varchar(2) DEFAULT NULL,
  `open_type` varchar(100) DEFAULT NULL,
  `open_url` varchar(200) DEFAULT NULL,
  `remark` varchar(1000) DEFAULT NULL,
  `server_id` varchar(100) DEFAULT NULL,
  `system_code` varchar(300) DEFAULT NULL,
  `system_index_page` varchar(600) DEFAULT NULL,
  `system_logo` varchar(600) DEFAULT NULL,
  `system_name` varchar(300) DEFAULT NULL,
  `tab_index_page` varchar(600) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user_code` varchar(100) DEFAULT NULL,
  `update_user_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fw_pl_system
-- ----------------------------

-- ----------------------------
-- Table structure for `fw_right_org`
-- ----------------------------
DROP TABLE IF EXISTS `fw_right_org`;
CREATE TABLE `fw_right_org` (
  `id` varchar(40) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user_code` varchar(100) DEFAULT NULL,
  `create_user_name` varchar(100) DEFAULT NULL,
  `fax` varchar(100) DEFAULT NULL,
  `is_deleted` varchar(100) DEFAULT NULL,
  `is_dept` varchar(100) DEFAULT NULL,
  `is_enable` varchar(100) DEFAULT NULL,
  `link_man` varchar(300) DEFAULT NULL,
  `link_phone` varchar(600) DEFAULT NULL,
  `org_address` varchar(300) DEFAULT NULL,
  `org_category` varchar(100) DEFAULT NULL,
  `org_certi_no` varchar(100) DEFAULT NULL,
  `org_code` varchar(100) DEFAULT NULL,
  `org_fullname` varchar(300) DEFAULT NULL,
  `org_ica_reg_no` varchar(100) DEFAULT NULL,
  `org_legal` varchar(100) DEFAULT NULL,
  `org_level` varchar(10) DEFAULT NULL,
  `org_manager` varchar(100) DEFAULT NULL,
  `org_name` varchar(300) DEFAULT NULL,
  `org_name_en` varchar(100) DEFAULT NULL,
  `org_name_ft` varchar(100) DEFAULT NULL,
  `org_nature` varchar(100) DEFAULT NULL,
  `org_reg_addr` varchar(1000) DEFAULT NULL,
  `org_status` varchar(100) DEFAULT NULL,
  `org_tax_reg_no` varchar(100) DEFAULT NULL,
  `org_type` varchar(100) DEFAULT NULL,
  `parent_id` varchar(300) DEFAULT NULL,
  `remark` varchar(1000) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user_code` varchar(100) DEFAULT NULL,
  `update_user_name` varchar(100) DEFAULT NULL,
  `zip_code` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fw_right_org
-- ----------------------------

-- ----------------------------
-- Table structure for `fw_right_role`
-- ----------------------------
DROP TABLE IF EXISTS `fw_right_role`;
CREATE TABLE `fw_right_role` (
  `id` varchar(40) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user_code` varchar(100) DEFAULT NULL,
  `create_user_name` varchar(100) DEFAULT NULL,
  `is_deleted` varchar(100) DEFAULT NULL,
  `is_enable` varchar(100) DEFAULT NULL,
  `remark` varchar(1000) DEFAULT NULL,
  `role_name` varchar(300) DEFAULT NULL,
  `role_type` varchar(100) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user_code` varchar(100) DEFAULT NULL,
  `update_user_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fw_right_role
-- ----------------------------
INSERT INTO `fw_right_role` VALUES ('1', null, null, null, null, null, null, '管理员', null, null, null, null);
INSERT INTO `fw_right_role` VALUES ('2', null, null, null, null, null, null, '普通用户', null, null, null, null);

-- ----------------------------
-- Table structure for `fw_right_role_module_ref`
-- ----------------------------
DROP TABLE IF EXISTS `fw_right_role_module_ref`;
CREATE TABLE `fw_right_role_module_ref` (
  `id` varchar(40) NOT NULL,
  `module_id` varchar(300) DEFAULT NULL,
  `role_id` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fw_right_role_module_ref
-- ----------------------------
INSERT INTO `fw_right_role_module_ref` VALUES ('1', '3', '1');
INSERT INTO `fw_right_role_module_ref` VALUES ('2', '6', '1');
INSERT INTO `fw_right_role_module_ref` VALUES ('3', '7', '1');
INSERT INTO `fw_right_role_module_ref` VALUES ('4', '3', '2');
INSERT INTO `fw_right_role_module_ref` VALUES ('5', '6', '2');
INSERT INTO `fw_right_role_module_ref` VALUES ('6', '8', '2');
INSERT INTO `fw_right_role_module_ref` VALUES ('7', '2', '1');

-- ----------------------------
-- Table structure for `fw_right_role_system_ref`
-- ----------------------------
DROP TABLE IF EXISTS `fw_right_role_system_ref`;
CREATE TABLE `fw_right_role_system_ref` (
  `id` varchar(40) NOT NULL,
  `role_id` varchar(300) DEFAULT NULL,
  `system_id` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fw_right_role_system_ref
-- ----------------------------

-- ----------------------------
-- Table structure for `fw_right_role_user_ref`
-- ----------------------------
DROP TABLE IF EXISTS `fw_right_role_user_ref`;
CREATE TABLE `fw_right_role_user_ref` (
  `id` varchar(40) NOT NULL,
  `role_id` varchar(300) DEFAULT NULL,
  `user_id` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fw_right_role_user_ref
-- ----------------------------
INSERT INTO `fw_right_role_user_ref` VALUES ('1', '1', '1');
INSERT INTO `fw_right_role_user_ref` VALUES ('2', '1', '2');
INSERT INTO `fw_right_role_user_ref` VALUES ('3', '2', '3');
INSERT INTO `fw_right_role_user_ref` VALUES ('4', '2', '4');
INSERT INTO `fw_right_role_user_ref` VALUES ('5', '1', '4');

-- ----------------------------
-- Table structure for `fw_right_user`
-- ----------------------------
DROP TABLE IF EXISTS `fw_right_user`;
CREATE TABLE `fw_right_user` (
  `ID` varchar(40) NOT NULL,
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
INSERT INTO `fw_right_user` VALUES ('1', 'admin', '0192023A7BBD73250516F069DF18B500', 'FW_USER_USERTYPE_ADMIN', '16973066@qq.com', 'N000001', '超级管理员', '', '1', '0', '1', '0', '235', '192.168.1.100', '2017-06-09 10:19:22', '0000-00-00 00:00:00', '2017-06-09', 'admin', 'admin', '0000-00-00', 'admin', '超级管理员', '0000-00-00', '超级管理员', 'N000465', '13922301658');
INSERT INTO `fw_right_user` VALUES ('2', 'manager', '96E79218965EB72C92A549DD5A330112', 'FW_USER_USERTYPE_COMMON', '123@qq.com', 'N000001', '系统管理员', '', '1', '0', '1', '0', '130', '172.16.40.50', '2017-06-09 10:19:26', '0000-00-00 00:00:00', '2017-06-07', 'admin', '超级管理员', '0000-00-00', 'manager', '系统管理员', '0000-00-00', '系统管理员', '', '13122222222');
INSERT INTO `fw_right_user` VALUES ('3', 'yn', '96E79218965EB72C92A549DD5A330112', 'FW_USER_USERTYPE_COMMON', 'yn@qq.com', 'bd5c6c53-7235-4bc9-ac30-e841a2b12359', '云南省公路局', '', '1', '0', '1', '0', '5', '172.16.85.78', '2017-06-09 10:19:45', '0000-00-00 00:00:00', '2017-05-17', 'manager', '系统管理员', '0000-00-00', 'yn', '云南省公路局', '0000-00-00', '桥梁工程师', 'bd5c6c53-7235-4bc9-ac30-e841a2b12359', '11111111');
INSERT INTO `fw_right_user` VALUES ('4', 'sd', '96E79218965EB72C92A549DD5A330112', 'FW_USER_USERTYPE_COMMON', '111@qq.com', '070cedb1-570a-48c5-9768-a118d0edf32d', 'Jack.W', '', '1', '0', '1', '0', '1201', '172.16.40.7', '2017-06-09 10:46:59', '0000-00-00 00:00:00', '2017-06-06', 'manager', '系统管理员', '0000-00-00', 'sd', '吴姿杨', '0000-00-00', '公路工程师', 'N370000', '13111111111');

-- ----------------------------
-- Table structure for `fw_right_user_details`
-- ----------------------------
DROP TABLE IF EXISTS `fw_right_user_details`;
CREATE TABLE `fw_right_user_details` (
  `id` varchar(40) NOT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_user_code` varchar(100) DEFAULT NULL,
  `create_user_name` varchar(100) DEFAULT NULL,
  `email` varchar(300) DEFAULT NULL,
  `is_deleted` varchar(100) DEFAULT NULL,
  `is_enable` varchar(100) DEFAULT NULL,
  `is_locked` varchar(100) DEFAULT NULL,
  `is_online` varchar(100) DEFAULT NULL,
  `org_id` varchar(300) DEFAULT NULL,
  `password` varchar(300) DEFAULT NULL,
  `reg_time` datetime DEFAULT NULL,
  `remark` varchar(1000) DEFAULT NULL,
  `telephone` varchar(11) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `update_user_code` varchar(100) DEFAULT NULL,
  `update_user_name` varchar(100) DEFAULT NULL,
  `user_code` varchar(100) DEFAULT NULL,
  `user_name` varchar(300) DEFAULT NULL,
  `user_type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of fw_right_user_details
-- ----------------------------

-- ----------------------------
-- Table structure for `test`
-- ----------------------------
DROP TABLE IF EXISTS `test`;
CREATE TABLE `test` (
  `id` varchar(50) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `age` smallint(6) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `birthtime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test
-- ----------------------------
