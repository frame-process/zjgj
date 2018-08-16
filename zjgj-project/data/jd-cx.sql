/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 80012
Source Host           : 127.0.0.1:3306
Source Database       : jd-cx

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2018-08-16 19:50:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for cas_dept
-- ----------------------------
DROP TABLE IF EXISTS `cas_dept`;
CREATE TABLE `cas_dept` (
  `dept_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '部门ID',
  `dept_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '部门名称',
  `dept_parent` int(11) DEFAULT NULL COMMENT '父级部门',
  `dept_stat` tinyint(1) DEFAULT '0' COMMENT '是否启用',
  `dept_del` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  `dept_icon` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '部门图标',
  `dept_seq` int(4) DEFAULT '0' COMMENT '顺序号',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='部门信息表';

-- ----------------------------
-- Records of cas_dept
-- ----------------------------
INSERT INTO `cas_dept` VALUES ('1', '测试', '0', '0', '0', null, '0', '2018-08-14 17:54:16');

-- ----------------------------
-- Table structure for cas_resource
-- ----------------------------
DROP TABLE IF EXISTS `cas_resource`;
CREATE TABLE `cas_resource` (
  `res_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '资源ID',
  `res_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '资源名称',
  `res_type` tinyint(1) DEFAULT NULL COMMENT '资源类型',
  `res_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '资源URL',
  `res_dsc` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '资源描述',
  `res_parent` int(11) DEFAULT NULL COMMENT '父级资源',
  `res_icon` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '资源图标',
  `res_seq` int(4) DEFAULT NULL COMMENT '资源序号',
  `res_del` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  `res_stat` tinyint(1) DEFAULT '0' COMMENT '是否启用',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`res_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='资源信息表';

-- ----------------------------
-- Records of cas_resource
-- ----------------------------

-- ----------------------------
-- Table structure for cas_role
-- ----------------------------
DROP TABLE IF EXISTS `cas_role`;
CREATE TABLE `cas_role` (
  `role_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `role_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '角色名称',
  `role_dsc` varchar(60) COLLATE utf8_bin DEFAULT NULL COMMENT '角色描述',
  `role_parent` int(11) DEFAULT NULL COMMENT '父级角色',
  `role_stat` tinyint(1) DEFAULT '0' COMMENT '是否启用',
  `role_del` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='角色信息';

-- ----------------------------
-- Records of cas_role
-- ----------------------------

-- ----------------------------
-- Table structure for cas_role_resource
-- ----------------------------
DROP TABLE IF EXISTS `cas_role_resource`;
CREATE TABLE `cas_role_resource` (
  `role_id` int(11) NOT NULL COMMENT '角色ID',
  `res_id` int(11) NOT NULL COMMENT '资源ID',
  PRIMARY KEY (`role_id`,`res_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='角色资源';

-- ----------------------------
-- Records of cas_role_resource
-- ----------------------------

-- ----------------------------
-- Table structure for cas_user
-- ----------------------------
DROP TABLE IF EXISTS `cas_user`;
CREATE TABLE `cas_user` (
  `user_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `dept_id` int(11) unsigned NOT NULL COMMENT '部门ID',
  `user_acc` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '用户帐号',
  `user_pass` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '用户密码',
  `user_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '用户名称',
  `user_type` tinyint(1) DEFAULT NULL COMMENT '用户类型',
  `user_mobile` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '手机号',
  `user_phone` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '电话',
  `user_level` tinyint(1) DEFAULT NULL COMMENT '用户级别',
  `user_city` int(11) DEFAULT NULL COMMENT '城市',
  `entry_time` timestamp NULL DEFAULT NULL COMMENT '入职时间',
  `user_stat` tinyint(1) DEFAULT '0' COMMENT '启用状态',
  `user_del` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  `leader_id` bigint(20) DEFAULT NULL COMMENT '上级领导',
  `leader_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '上级名称',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`user_id`),
  KEY `fk_user_dept` (`dept_id`),
  CONSTRAINT `fk_user_dept` FOREIGN KEY (`dept_id`) REFERENCES `cas_dept` (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='用户信息表';

-- ----------------------------
-- Records of cas_user
-- ----------------------------
INSERT INTO `cas_user` VALUES ('1', '1', 'test', '1121122', 'iddd', null, null, null, null, null, null, '0', '0', null, null, null);

-- ----------------------------
-- Table structure for cas_user_resource
-- ----------------------------
DROP TABLE IF EXISTS `cas_user_resource`;
CREATE TABLE `cas_user_resource` (
  `user_id` int(11) NOT NULL COMMENT '用户Id',
  `res_id` int(11) NOT NULL COMMENT '资源ID',
  PRIMARY KEY (`user_id`,`res_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='用户资源';

-- ----------------------------
-- Records of cas_user_resource
-- ----------------------------

-- ----------------------------
-- Table structure for cas_user_role
-- ----------------------------
DROP TABLE IF EXISTS `cas_user_role`;
CREATE TABLE `cas_user_role` (
  `user_id` bigint(20) NOT NULL COMMENT '用户Id',
  `role_id` int(11) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='用户角色表';

-- ----------------------------
-- Records of cas_user_role
-- ----------------------------

-- ----------------------------
-- Table structure for cas_wx_user
-- ----------------------------
DROP TABLE IF EXISTS `cas_wx_user`;
CREATE TABLE `cas_wx_user` (
  `open_id` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '微信标识',
  `user_id` bigint(20) NOT NULL COMMENT '用户标识',
  PRIMARY KEY (`open_id`,`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='微信用户信息';

-- ----------------------------
-- Records of cas_wx_user
-- ----------------------------

-- ----------------------------
-- Table structure for crm_car
-- ----------------------------
DROP TABLE IF EXISTS `crm_car`;
CREATE TABLE `crm_car` (
  `car_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '车辆ID',
  `cus_id` bigint(20) unsigned DEFAULT NULL COMMENT '客户ID',
  `car_ins` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '被保险人',
  `car_no` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '车牌号',
  `car_model` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '车型',
  `car_reg_date` date DEFAULT NULL COMMENT '登记日期',
  `car_brand` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '品牌',
  `car_frame` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '车架号',
  `car_engine` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '发动机号',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `upt_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`car_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='客户车辆';

-- ----------------------------
-- Records of crm_car
-- ----------------------------

-- ----------------------------
-- Table structure for crm_car_change
-- ----------------------------
DROP TABLE IF EXISTS `crm_car_change`;
CREATE TABLE `crm_car_change` (
  `car_chg_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '车辆变更ID',
  `car_id` bigint(20) unsigned DEFAULT NULL COMMENT '车辆ID',
  `chg_serv` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '变更服务',
  `chg_bef` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '变更前',
  `chg_aft` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '变更后',
  `chg_time` timestamp NULL DEFAULT NULL COMMENT '变更时间',
  `chg_user` bigint(20) DEFAULT NULL COMMENT '变更用户',
  `chg_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '变更人',
  `chg_ip` bigint(20) DEFAULT NULL COMMENT '变更IP',
  PRIMARY KEY (`car_chg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='车辆信息变更记录';

-- ----------------------------
-- Records of crm_car_change
-- ----------------------------

-- ----------------------------
-- Table structure for crm_city
-- ----------------------------
DROP TABLE IF EXISTS `crm_city`;
CREATE TABLE `crm_city` (
  `city_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '城市Id',
  `city_code` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '城市编码',
  `city_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '名称',
  `city_parent` int(11) DEFAULT NULL COMMENT '上级',
  `city_level` tinyint(2) DEFAULT NULL COMMENT '城市级别',
  `city_dsc` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '描述',
  `city_stat` tinyint(1) DEFAULT '0' COMMENT '状态',
  `sht_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '短名称',
  `merge_name` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '合并名称',
  `zip_code` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '邮编',
  `city_lng` decimal(10,6) DEFAULT NULL COMMENT '经度',
  `city_lat` decimal(10,6) DEFAULT NULL COMMENT '维度',
  `pinyin` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '拼音',
  PRIMARY KEY (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='CRM-城市信息';

-- ----------------------------
-- Records of crm_city
-- ----------------------------

-- ----------------------------
-- Table structure for crm_claim_car
-- ----------------------------
DROP TABLE IF EXISTS `crm_claim_car`;
CREATE TABLE `crm_claim_car` (
  `claim_car_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '理赔ID',
  `car_id` bigint(20) unsigned DEFAULT NULL COMMENT '车辆ID',
  `dist_stat` tinyint(1) DEFAULT '0' COMMENT '分配状态',
  `data_type` tinyint(1) DEFAULT '0' COMMENT '数据类型',
  `data_src` tinyint(1) DEFAULT NULL COMMENT '数据来源',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `upt_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`claim_car_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='理赔车辆';

-- ----------------------------
-- Records of crm_claim_car
-- ----------------------------

-- ----------------------------
-- Table structure for crm_claim_policy
-- ----------------------------
DROP TABLE IF EXISTS `crm_claim_policy`;
CREATE TABLE `crm_claim_policy` (
  `claim_policy_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '理赔保单ID',
  `claim_trck_id` bigint(20) unsigned DEFAULT NULL COMMENT '理赔跟踪ID',
  `trck_user` bigint(20) unsigned DEFAULT NULL COMMENT '跟踪用户',
  `trck_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '跟踪人',
  `car_id` bigint(20) DEFAULT NULL COMMENT '车辆ID',
  `stro_date` date DEFAULT NULL COMMENT '交强日期',
  `busi_date` date DEFAULT NULL COMMENT '商业日期',
  `policy_note` timestamp NULL DEFAULT NULL COMMENT '保单备注',
  `policy_stat` tinyint(1) DEFAULT NULL COMMENT '保单状态',
  `ins_amt` decimal(8,2) DEFAULT NULL COMMENT '保险金额',
  `policy_amt` decimal(8,2) DEFAULT NULL COMMENT '保单金额',
  `policy_real_amt` decimal(8,2) DEFAULT NULL COMMENT '保单实际金额',
  `invoice` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '发票抬头',
  `tmp_addr` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '临时地址',
  `pay_type` tinyint(1) DEFAULT NULL COMMENT '付款方式',
  `gift_group_id` int(11) DEFAULT NULL COMMENT '礼品分组信息',
  `gift_data` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '礼品数据',
  `shop_id` int(11) DEFAULT NULL COMMENT '店铺ID',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `upd_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`claim_policy_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='理赔保单';

-- ----------------------------
-- Records of crm_claim_policy
-- ----------------------------

-- ----------------------------
-- Table structure for crm_claim_trck
-- ----------------------------
DROP TABLE IF EXISTS `crm_claim_trck`;
CREATE TABLE `crm_claim_trck` (
  `claim_trck_id` bigint(20) NOT NULL COMMENT '理赔跟踪ID',
  `claim_car_id` bigint(20) DEFAULT NULL COMMENT '理赔车辆ID',
  `car_id` bigint(20) DEFAULT NULL COMMENT '车辆ID',
  `ins_com` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '保险公司',
  `ins_ppl` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '保险人',
  `ins_com_pre` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '上个保险公司',
  `trck_user` bigint(20) DEFAULT NULL COMMENT '跟踪用户',
  `trck_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '跟踪人',
  `data_type` tinyint(1) DEFAULT NULL COMMENT '数据类型',
  `data_stat` tinyint(1) DEFAULT NULL COMMENT '数据状态',
  `trck_stat` tinyint(2) DEFAULT NULL COMMENT '跟踪状态',
  `trck_note` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '跟踪备注',
  `data_src` tinyint(1) DEFAULT NULL COMMENT '数据来源',
  `cus_grade` tinyint(1) DEFAULT NULL COMMENT '客户等级',
  `rese_time` timestamp NULL DEFAULT NULL COMMENT '预约时间',
  `sell_rese` tinyint(1) DEFAULT NULL COMMENT '销售预约',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `upt_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`claim_trck_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='理赔客户跟踪';

-- ----------------------------
-- Records of crm_claim_trck
-- ----------------------------

-- ----------------------------
-- Table structure for crm_claim_trck_change
-- ----------------------------
DROP TABLE IF EXISTS `crm_claim_trck_change`;
CREATE TABLE `crm_claim_trck_change` (
  `claim_chg_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '理赔变更ID',
  `claim_trck_id` bigint(20) DEFAULT NULL COMMENT '理赔跟踪ID',
  `car_id` bigint(20) DEFAULT NULL COMMENT '车辆ID',
  `chg_serv` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '变更业务',
  `chg_bef` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '变更前',
  `chg_aft` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '变更后',
  `chg_time` timestamp NULL DEFAULT NULL COMMENT '变更时间',
  `chg_user` bigint(20) DEFAULT NULL COMMENT '变更用户',
  `chg_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '变更人',
  `chg_ip` bigint(20) DEFAULT NULL COMMENT '变更IP',
  PRIMARY KEY (`claim_chg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='理赔变更跟踪信息';

-- ----------------------------
-- Records of crm_claim_trck_change
-- ----------------------------

-- ----------------------------
-- Table structure for crm_customer
-- ----------------------------
DROP TABLE IF EXISTS `crm_customer`;
CREATE TABLE `crm_customer` (
  `cus_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '客户ID',
  `cus_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '客户姓名',
  `cus_mobile` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '客户手机号',
  `cus_phone` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '客户电话',
  `cus_addr` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '客户地址',
  `cus_type` tinyint(2) DEFAULT NULL COMMENT '客户类型',
  `cus_grade` tinyint(1) DEFAULT NULL COMMENT '客户等级',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `upd_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`cus_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='客户信息';

-- ----------------------------
-- Records of crm_customer
-- ----------------------------

-- ----------------------------
-- Table structure for crm_customer_change
-- ----------------------------
DROP TABLE IF EXISTS `crm_customer_change`;
CREATE TABLE `crm_customer_change` (
  `cus_chg_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '客户变更ID',
  `cus_id` bigint(20) DEFAULT NULL COMMENT '客户ID',
  `chg_dsc` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '变更描述',
  `chg_bef` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '变更前内容共',
  `chg_aft` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '变更后内容',
  `chg_time` timestamp NULL DEFAULT NULL COMMENT '变更时间',
  `chg_user` bigint(20) DEFAULT NULL COMMENT '操作用户',
  `chg_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '操作人',
  `chg_ip` bigint(20) DEFAULT NULL COMMENT '变更IP地址',
  PRIMARY KEY (`cus_chg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='客户信息变更记录';

-- ----------------------------
-- Records of crm_customer_change
-- ----------------------------

-- ----------------------------
-- Table structure for crm_dict
-- ----------------------------
DROP TABLE IF EXISTS `crm_dict`;
CREATE TABLE `crm_dict` (
  `dict_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '字典ID',
  `dict_code` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '字典编码',
  `dict_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '字典名称',
  `item_code` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '元素编码',
  `item_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '元素名称',
  `item_seq` tinyint(2) DEFAULT NULL COMMENT '顺序码',
  `item_stat` tinyint(1) DEFAULT '0' COMMENT '是否启用',
  `item_del` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  PRIMARY KEY (`dict_id`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='CRM-字典';

-- ----------------------------
-- Records of crm_dict
-- ----------------------------
INSERT INTO `crm_dict` VALUES ('1', 'CRM_DEL_TAG', '删除标记', '0', '否', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('2', 'CRM_DEL_TAG', '删除标记', '1', '是', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('3', 'CRM_STAT_TAG', '状态标记', '0', '无效', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('4', 'CRM_STAT_TAG', '状态标记', '1', '有效', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('5', 'CRM_CUS_TYPE', '客户类型', '0', '普通', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('6', 'CRM_CUS_TYPE', '客户类型', '1', '高级', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('7', 'CRM_CUS_GRADE', '客户等级', '0', '默认', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('8', 'CRM_CUS_GRADE', '客户等级', '1', 'A', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('9', 'CRM_CUS_GRADE', '客户等级', '2', 'B', '3', '0', '0');
INSERT INTO `crm_dict` VALUES ('10', 'CRM_CUS_GRADE', '客户等级', '3', 'C', '4', '0', '0');
INSERT INTO `crm_dict` VALUES ('11', 'CRM_DIST_STAT', '数据分配状态', '0', '未分配', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('12', 'CRM_DIST_STAT', '数据分配状态', '1', '已分配', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('13', 'CRM_SELL_DATA_TYPE', '销售数据类型', '1', '新数据', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('14', 'CRM_SELL_DATA_TYPE', '销售数据类型', '2', '续保数据', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('15', 'CRM_SELL_DATA_TYPE', '销售数据类型', '3', '外采数据', '3', '0', '0');
INSERT INTO `crm_dict` VALUES ('16', 'CRM_SELL_DATA_SRC', '销售数据来源', '0', '默认来源', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('17', 'CRM_SELL_DATA_SRC', '销售数据来源', '1', '国寿数据', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('18', 'CRM_SELL_DATA_SRC', '销售数据来源', '2', '人保', '3', '0', '0');
INSERT INTO `crm_dict` VALUES ('19', 'CRM_SELL_DATA_SRC', '销售数据来源', '3', '太保', '4', '0', '0');
INSERT INTO `crm_dict` VALUES ('20', 'CRM_SELL_DATA_SRC', '销售数据来源', '4', '太保电销', '5', '0', '0');
INSERT INTO `crm_dict` VALUES ('21', 'CRM_SELL_DATA_STAT', '销售数据状态', '1', '有效', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('22', 'CRM_SELL_DATA_STAT', '销售数据状态', '2', '死数据', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('23', 'CRM_SELL_DATA_STAT', '销售数据状态', '3', '成交数据', '3', '0', '0');
INSERT INTO `crm_dict` VALUES ('24', 'CRM_SELL_DATA_STAT', '销售数据状态', '4', '退回', '4', '0', '0');
INSERT INTO `crm_dict` VALUES ('25', 'CRM_SELL_TRCK_STAT', '销售跟踪状态', '1', '有效', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('26', 'CRM_SELL_TRCK_STAT', '销售跟踪状态', '2', '第一次无人接听', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('27', 'CRM_SELL_TRCK_STAT', '销售跟踪状态', '3', '第二次无人接听', '3', '0', '0');
INSERT INTO `crm_dict` VALUES ('28', 'CRM_SELL_TRCK_STAT', '销售跟踪状态', '4', '第三次无人接听', '4', '0', '0');
INSERT INTO `crm_dict` VALUES ('29', 'CRM_SELL_TRCK_STAT', '销售跟踪状态', '5', '第四次无人接听', '5', '0', '0');
INSERT INTO `crm_dict` VALUES ('30', 'CRM_SELL_TRCK_STAT', '销售跟踪状态', '6', '已联系', '6', '0', '0');
INSERT INTO `crm_dict` VALUES ('31', 'CRM_SELL_TRCK_STAT', '销售跟踪状态', '7', '失败', '7', '0', '0');
INSERT INTO `crm_dict` VALUES ('32', 'CRM_PAY_TYPE', '付款方式', '1', '现金支付', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('33', 'CRM_PAY_TYPE', '付款方式', '2', '余额支付', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('34', 'CRM_PAY_TYPE', '付款方式', '3', '微信支付', '3', '0', '0');
INSERT INTO `crm_dict` VALUES ('35', 'CRM_PAY_TYPE', '付款方式', '4', '支付宝支付', '4', '0', '0');
INSERT INTO `crm_dict` VALUES ('36', 'CRM_PAY_TYPE', '付款方式', '5', '银联支付', '5', '0', '0');
INSERT INTO `crm_dict` VALUES ('37', 'CRM_PAY_TYPE', '付款方式', '6', '余额+微信支付', '6', '0', '0');
INSERT INTO `crm_dict` VALUES ('38', 'CRM_PAY_TYPE', '付款方式', '7', '余额+支付宝支付', '7', '0', '0');
INSERT INTO `crm_dict` VALUES ('39', 'CRM_PAY_TYPE', '付款方式', '8', '银联+微信支付', '8', '0', '0');
INSERT INTO `crm_dict` VALUES ('40', 'CRM_PAY_TYPE', '付款方式', '9', '医保支付', '9', '0', '0');
INSERT INTO `crm_dict` VALUES ('41', 'CRM_PAY_TYPE', '付款方式', '10', '点评支付', '10', '0', '0');
INSERT INTO `crm_dict` VALUES ('42', 'CRM_PAY_TYPE', '付款方式', '11', '美团支付', '11', '0', '0');
INSERT INTO `crm_dict` VALUES ('43', 'CRM_PAY_TYPE', '付款方式', '12', '其他平台支付', '12', '0', '0');
INSERT INTO `crm_dict` VALUES ('44', 'CRM_CLAIM_DATA_STAT', '理赔数据状态', '1', '有效', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('45', 'CRM_CLAIM_DATA_STAT', '理赔数据状态', '2', '无效数据', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('46', 'CRM_CLAIM_DATA_STAT', '理赔数据状态', '3', '成交', '3', '0', '0');
INSERT INTO `crm_dict` VALUES ('47', 'CRM_CLAIM_DATA_STAT', '理赔数据状态', '4', '退回', '4', '0', '0');
INSERT INTO `crm_dict` VALUES ('48', 'CRM_CLAIM_TRCK_STAT', '理赔跟踪状态', '1', '有效', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('49', 'CRM_CLAIM_TRCK_STAT', '理赔跟踪状态', '2', '已联系', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('50', 'CRM_CLAIM_TRCK_STAT', '理赔跟踪状态', '3', '未联系', '3', '0', '0');
INSERT INTO `crm_dict` VALUES ('51', 'CRM_USER_TYPE', '客户类型', '0', '普通', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('52', 'CRM_USER_TYPE', '客户类型', '1', '初级', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('53', 'CRM_USER_TYPE', '客户类型', '2', '中级', '3', '0', '0');
INSERT INTO `crm_dict` VALUES ('54', 'CRM_USER_TYPE', '客户类型', '3', '高级', '4', '0', '0');
INSERT INTO `crm_dict` VALUES ('55', 'CRM_USER_LEVEL', '用户级别', '1', 'A', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('56', 'CRM_USER_LEVEL', '用户级别', '2', 'B', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('57', 'CRM_USER_LEVEL', '用户级别', '3', 'C', '3', '0', '0');
INSERT INTO `crm_dict` VALUES ('58', 'CRM_CLAIM_DATA_TYPE', '理赔数据类型', '1', '新数据', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('59', 'CRM_CLAIM_DATA_TYPE', '理赔数据类型', '2', '续保数据', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('60', 'CRM_CLAIM_DATA_TYPE', '理赔数据类型', '3', '外采数据', '3', '0', '0');
INSERT INTO `crm_dict` VALUES ('61', 'CRM_CLAIM_DATA_SRC', '理赔数据来源', '1', '值班数据', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('62', 'CRM_CLAIM_DATA_SRC', '理赔数据来源', '2', '销售推送', '3', '0', '0');
INSERT INTO `crm_dict` VALUES ('63', 'CRM_CLAIM_DATA_SRC', '理赔数据来源', '3', '自我数据', '4', '0', '0');
INSERT INTO `crm_dict` VALUES ('64', 'CRM_CLAIM_DATA_SRC', '理赔数据来源', '4', '朋友介绍', '5', '0', '0');
INSERT INTO `crm_dict` VALUES ('65', 'CRM_CLAIM_DATA_SRC', '理赔数据来源', '5', '三者数据', '6', '0', '0');
INSERT INTO `crm_dict` VALUES ('66', 'CRM_RESE_STAT', '数据预约状态', '0', '未预约', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('67', 'CRM_RESE_STAT', '数据预约状态', '1', '已预约', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('68', 'CRM_SELL_POLICY_TYPE', '销售保单类型', '1', '赞保单', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('69', 'CRM_SELL_POLICY_TYPE', '销售保单类型', '2', '正式保单', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('70', 'CRM_SELL_POLICY_STAT', '销售保单状态', '1', '正常', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('71', 'CRM_SELL_POLICY_STAT', '销售保单状态', '2', '打回', '2', '0', '0');
INSERT INTO `crm_dict` VALUES ('72', 'CRM_SELL_POLICY_STAT', '销售保单状态', '3', '退保', '3', '0', '0');
INSERT INTO `crm_dict` VALUES ('73', 'CRM_SELL_CALC_STAT', '销售算单标识', '0', '未算单', '1', '0', '0');
INSERT INTO `crm_dict` VALUES ('74', 'CRM_SELL_CALC_STAT', '销售算单标识', '1', '算单', '2', '0', '0');

-- ----------------------------
-- Table structure for crm_gift
-- ----------------------------
DROP TABLE IF EXISTS `crm_gift`;
CREATE TABLE `crm_gift` (
  `gift_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '礼品ID',
  `gift_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '礼品名称',
  `gift_del` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  `gift_stat` tinyint(1) DEFAULT '0' COMMENT '是否可用',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`gift_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='礼品信息';

-- ----------------------------
-- Records of crm_gift
-- ----------------------------

-- ----------------------------
-- Table structure for crm_gift_group
-- ----------------------------
DROP TABLE IF EXISTS `crm_gift_group`;
CREATE TABLE `crm_gift_group` (
  `gift_grp_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '礼品分组ID',
  `grp_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '礼品名称',
  `grp_data` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '礼品数据',
  `gift_del` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  `gift_stat` tinyint(1) DEFAULT '0' COMMENT '是否可用',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`gift_grp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='礼品分组';

-- ----------------------------
-- Records of crm_gift_group
-- ----------------------------

-- ----------------------------
-- Table structure for crm_holiday
-- ----------------------------
DROP TABLE IF EXISTS `crm_holiday`;
CREATE TABLE `crm_holiday` (
  `hol_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '节假日ID',
  `hol_date` date DEFAULT NULL COMMENT '节假日',
  `note` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `work_date` date DEFAULT NULL COMMENT '工作日',
  `hol_del` tinyint(1) DEFAULT '0' COMMENT '删除',
  `hol_stat` tinyint(1) DEFAULT '1' COMMENT '状态',
  `cre_user` bigint(20) DEFAULT NULL COMMENT '操作用户',
  `cre_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '操作人',
  `cre_ip` bigint(20) DEFAULT NULL COMMENT '操作IP',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`hol_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='CRM-节假日';

-- ----------------------------
-- Records of crm_holiday
-- ----------------------------

-- ----------------------------
-- Table structure for crm_insurance
-- ----------------------------
DROP TABLE IF EXISTS `crm_insurance`;
CREATE TABLE `crm_insurance` (
  `ins_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '保险ID',
  `ins_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '保险名称',
  `ins_dsc` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '保险描述',
  `ins_del` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  `ins_stat` tinyint(1) DEFAULT '0' COMMENT '是否启用',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`ins_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='保险信息-描述保险相关内容';

-- ----------------------------
-- Records of crm_insurance
-- ----------------------------

-- ----------------------------
-- Table structure for crm_opt_log
-- ----------------------------
DROP TABLE IF EXISTS `crm_opt_log`;
CREATE TABLE `crm_opt_log` (
  `opt_id` bigint(20) NOT NULL COMMENT '操作ID',
  `opt_user` bigint(20) DEFAULT NULL COMMENT '操作用户',
  `opt_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '操作人',
  `opt_time` timestamp NULL DEFAULT NULL COMMENT '操作时间',
  `opt_serv` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '操作描述',
  `opt_parm` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '操作参数',
  `opt_result` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '返回结果',
  PRIMARY KEY (`opt_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='CRM-操作日志';

-- ----------------------------
-- Records of crm_opt_log
-- ----------------------------

-- ----------------------------
-- Table structure for crm_repair_shop
-- ----------------------------
DROP TABLE IF EXISTS `crm_repair_shop`;
CREATE TABLE `crm_repair_shop` (
  `shop_id` int(11) NOT NULL COMMENT '修理厂ID',
  `shop_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '修理厂名称',
  PRIMARY KEY (`shop_id`,`shop_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='修理厂';

-- ----------------------------
-- Records of crm_repair_shop
-- ----------------------------

-- ----------------------------
-- Table structure for crm_sell_car
-- ----------------------------
DROP TABLE IF EXISTS `crm_sell_car`;
CREATE TABLE `crm_sell_car` (
  `sell_car_id` bigint(20) NOT NULL COMMENT '销售车辆ID',
  `car_id` bigint(20) DEFAULT NULL COMMENT '车辆ID',
  `dist_stat` tinyint(1) DEFAULT '0' COMMENT '分配状态',
  `data_type` tinyint(1) DEFAULT NULL COMMENT '数据类型',
  `data_src` tinyint(1) DEFAULT NULL COMMENT '数据来源',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `upt_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`sell_car_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='销售车辆';

-- ----------------------------
-- Records of crm_sell_car
-- ----------------------------

-- ----------------------------
-- Table structure for crm_sell_insurance
-- ----------------------------
DROP TABLE IF EXISTS `crm_sell_insurance`;
CREATE TABLE `crm_sell_insurance` (
  `sell_policy_id` bigint(20) NOT NULL COMMENT '销售保单ID',
  `ins_id` int(11) NOT NULL COMMENT '车辆ID',
  `sel_val` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '选择值',
  `txt_val` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '文本值',
  PRIMARY KEY (`sell_policy_id`,`ins_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='保单险种信息';

-- ----------------------------
-- Records of crm_sell_insurance
-- ----------------------------

-- ----------------------------
-- Table structure for crm_sell_policy
-- ----------------------------
DROP TABLE IF EXISTS `crm_sell_policy`;
CREATE TABLE `crm_sell_policy` (
  `sell_policy_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '保单ID',
  `sell_trck_id` bigint(20) DEFAULT NULL COMMENT '销售跟踪ID',
  `policy_ppl` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '投保人',
  `trck_user` bigint(20) DEFAULT NULL COMMENT '跟踪用户',
  `trck_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '跟踪人',
  `car_id` bigint(20) DEFAULT NULL COMMENT '车辆ID',
  `stro_date` date DEFAULT NULL COMMENT '交强日期',
  `busi_date` date DEFAULT NULL COMMENT '商业日期',
  `policy_note` timestamp NULL DEFAULT NULL COMMENT '保单备注',
  `policy_stat` tinyint(1) DEFAULT NULL COMMENT '保单状态',
  `ins_amt` decimal(8,2) DEFAULT NULL COMMENT '保险金额',
  `policy_amt` decimal(8,2) DEFAULT NULL COMMENT '保单金额',
  `policy_real_amt` decimal(8,2) DEFAULT NULL COMMENT '保单实际金额',
  `invoice` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '发票抬头',
  `tmp_addr` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '临时地址',
  `pay_type` tinyint(1) DEFAULT NULL COMMENT '付款方式',
  `gift_group_id` int(11) DEFAULT NULL COMMENT '礼品分组信息',
  `gift_data` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '礼品数据',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `upd_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`sell_policy_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='销售保单';

-- ----------------------------
-- Records of crm_sell_policy
-- ----------------------------

-- ----------------------------
-- Table structure for crm_sell_trck
-- ----------------------------
DROP TABLE IF EXISTS `crm_sell_trck`;
CREATE TABLE `crm_sell_trck` (
  `sell_trck_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '销售跟踪ID',
  `sell_car_id` bigint(20) DEFAULT NULL COMMENT '销售车辆ID',
  `car_id` bigint(20) DEFAULT NULL COMMENT '车辆ID',
  `ins_com` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '保险公司',
  `ins_ppl` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '保险人',
  `ins_com_pre` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '上个保险公司',
  `trck_user` bigint(20) DEFAULT NULL COMMENT '跟踪用户',
  `trck_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '跟踪人',
  `data_type` tinyint(1) DEFAULT NULL COMMENT '数据类型',
  `data_stat` tinyint(1) DEFAULT NULL COMMENT '数据状态',
  `trck_stat` tinyint(2) DEFAULT NULL COMMENT '跟踪状态',
  `trck_note` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '跟踪备注',
  `data_src` tinyint(1) DEFAULT NULL COMMENT '数据来源',
  `cus_grade` tinyint(1) DEFAULT NULL COMMENT '客户等级',
  `rese_time` timestamp NULL DEFAULT NULL COMMENT '预约时间',
  `sell_rese` tinyint(1) DEFAULT '0' COMMENT '销售预约',
  `calc_stat` tinyint(1) DEFAULT NULL COMMENT '是否算单',
  `calc_time` timestamp NULL DEFAULT NULL COMMENT '算单时间',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `upt_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`sell_trck_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='销售跟踪数据';

-- ----------------------------
-- Records of crm_sell_trck
-- ----------------------------

-- ----------------------------
-- Table structure for crm_sell_trck_change
-- ----------------------------
DROP TABLE IF EXISTS `crm_sell_trck_change`;
CREATE TABLE `crm_sell_trck_change` (
  `sell_chg_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '销售变更ID',
  `sell_trck_id` bigint(20) DEFAULT NULL COMMENT '销售跟踪ID',
  `car_id` bigint(20) DEFAULT NULL COMMENT '车辆ID',
  `chg_serv` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '变更业务',
  `chg_bef` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '变更前',
  `chg_aft` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '变更后',
  `chg_time` timestamp NULL DEFAULT NULL COMMENT '变更时间',
  `chg_user` bigint(20) DEFAULT NULL COMMENT '变更用户',
  `chg_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '变更人',
  `chg_ip` bigint(20) DEFAULT NULL COMMENT '变更IP',
  PRIMARY KEY (`sell_chg_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='销售跟踪变更记录';

-- ----------------------------
-- Records of crm_sell_trck_change
-- ----------------------------

-- ----------------------------
-- Table structure for crm_sms_log
-- ----------------------------
DROP TABLE IF EXISTS `crm_sms_log`;
CREATE TABLE `crm_sms_log` (
  `sms_log_id` bigint(20) NOT NULL COMMENT '短信ID',
  `sms_mobile` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '手机号',
  `sms_content` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '短信内容',
  `sms_parm` varchar(200) COLLATE utf8_bin DEFAULT NULL COMMENT '调用参数',
  `sms_result` varchar(50) COLLATE utf8_bin DEFAULT NULL COMMENT '返回结果',
  `cre_id` bigint(20) DEFAULT NULL COMMENT '创建ID',
  `cre_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '创建人',
  `cre_ip` bigint(20) DEFAULT NULL COMMENT '操作IP',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '发送时间',
  PRIMARY KEY (`sms_log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='CRM-短信日志';

-- ----------------------------
-- Records of crm_sms_log
-- ----------------------------

-- ----------------------------
-- Table structure for crm_upload_file
-- ----------------------------
DROP TABLE IF EXISTS `crm_upload_file`;
CREATE TABLE `crm_upload_file` (
  `file_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '文件ID',
  `file_type` tinyint(2) DEFAULT NULL COMMENT '文件类型',
  `file_pkid` bigint(20) DEFAULT NULL COMMENT '关联ID',
  `file_size` bigint(20) DEFAULT NULL COMMENT '文件大小',
  `file_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '文件名称',
  `file_url` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '文件URL',
  `file_stg` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '文件存储地址',
  `file_ip` bigint(20) DEFAULT NULL COMMENT '文件IP',
  `file_ext` varchar(10) COLLATE utf8_bin DEFAULT NULL COMMENT '扩展名',
  `visi_count` bigint(20) DEFAULT NULL COMMENT '访问次数',
  `file_del` tinyint(1) DEFAULT '0' COMMENT '是否删除',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '文件IP',
  PRIMARY KEY (`file_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='CRM-附件表';

-- ----------------------------
-- Records of crm_upload_file
-- ----------------------------

-- ----------------------------
-- Table structure for wx_user
-- ----------------------------
DROP TABLE IF EXISTS `wx_user`;
CREATE TABLE `wx_user` (
  `open_id` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '微信标识',
  `nickname` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '昵称',
  `sex` tinyint(1) DEFAULT NULL COMMENT '性别',
  `language` varchar(16) COLLATE utf8_bin DEFAULT NULL COMMENT '语言',
  `city` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '城市',
  `province` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '省份',
  `country` varchar(32) COLLATE utf8_bin DEFAULT NULL COMMENT '国家',
  `headimg` varchar(256) COLLATE utf8_bin DEFAULT NULL COMMENT '头像',
  `privilege` varchar(256) COLLATE utf8_bin DEFAULT NULL COMMENT '权限',
  `cre_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `upt_time` timestamp NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`open_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='微信用户信息';

-- ----------------------------
-- Records of wx_user
-- ----------------------------
