/*
 Navicat Premium Data Transfer

 Source Server         : dev
 Source Server Type    : MySQL
 Source Server Version : 50640
 Source Host           : localhost:3306
 Source Schema         : sun

 Target Server Type    : MySQL
 Target Server Version : 50640
 File Encoding         : 65001

 Date: 14/12/2018 16:00:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `dept_id` int(11) DEFAULT NULL COMMENT '部门id',
  `login_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '登录账号',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '登录密码',
  `user_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户昵称',
  `user_type` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户类型（00系统用户）',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '手机号码',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '用户邮箱',
  `sex` int(1) DEFAULT NULL COMMENT '用户性别（0女 1男 2未知）',
  `avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '头像路径',
  `status` int(1) DEFAULT 0 COMMENT '帐号状态（0正常 1停用）',
  `del_flag` int(1) DEFAULT 0 COMMENT '删除标志（0-未删除 1-已删除）',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1004 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1000, NULL, NULL, '123456', 'anlve', NULL, '18888888888', NULL, NULL, NULL, NULL, 0);
INSERT INTO `t_user` VALUES (1001, NULL, NULL, '123456', 'admin', NULL, '16666666666', NULL, NULL, NULL, NULL, 0);
INSERT INTO `t_user` VALUES (1002, NULL, NULL, '666666', 'test', NULL, '13333333333', NULL, NULL, NULL, NULL, 0);
INSERT INTO `t_user` VALUES (1003, NULL, NULL, '222', '111', NULL, '3333', NULL, NULL, NULL, NULL, 0);

SET FOREIGN_KEY_CHECKS = 1;
