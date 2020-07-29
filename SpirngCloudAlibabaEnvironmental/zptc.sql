/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : zptc

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 24/06/2020 09:08:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article`  (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `context` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '内容',
  `image` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `classification` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类',
  `create_id` int(1) NULL DEFAULT NULL COMMENT '创建人id',
  `create_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人用户名',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modify_id` int(1) NULL DEFAULT NULL COMMENT '修改人id',
  `modify_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人用户名',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `states` int(1) NULL DEFAULT NULL COMMENT '状态（1=正常，2=删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for college
-- ----------------------------
DROP TABLE IF EXISTS `college`;
CREATE TABLE `college`  (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `context` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '内容',
  `image` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `classification` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类',
  `create_id` int(1) NULL DEFAULT NULL COMMENT '创建人id',
  `create_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人用户名',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modify_id` int(1) NULL DEFAULT NULL COMMENT '修改人id',
  `modify_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人用户名',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `states` int(1) NULL DEFAULT NULL COMMENT '状态（1=正常，2=删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for download
-- ----------------------------
DROP TABLE IF EXISTS `download`;
CREATE TABLE `download`  (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `context` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '内容',
  `image` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `classification` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类',
  `create_id` int(1) NULL DEFAULT NULL COMMENT '创建人id',
  `create_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人用户名',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modify_id` int(1) NULL DEFAULT NULL COMMENT '修改人id',
  `modify_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人用户名',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `states` int(1) NULL DEFAULT NULL COMMENT '状态（1=正常，2=删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for life
-- ----------------------------
DROP TABLE IF EXISTS `life`;
CREATE TABLE `life`  (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `context` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '内容',
  `image` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `classification` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类',
  `create_id` int(1) NULL DEFAULT NULL COMMENT '创建人id',
  `create_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人用户名',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modify_id` int(1) NULL DEFAULT NULL COMMENT '修改人id',
  `modify_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人用户名',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `states` int(1) NULL DEFAULT NULL COMMENT '状态（1=正常，2=删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for link
-- ----------------------------
DROP TABLE IF EXISTS `link`;
CREATE TABLE `link`  (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `context` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '内容',
  `image` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `classification` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类',
  `create_id` int(1) NULL DEFAULT NULL COMMENT '创建人id',
  `create_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人用户名',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modify_id` int(1) NULL DEFAULT NULL COMMENT '修改人id',
  `modify_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人用户名',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `states` int(1) NULL DEFAULT NULL COMMENT '状态（1=正常，2=删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for oauth_client_details
-- ----------------------------
DROP TABLE IF EXISTS `oauth_client_details`;
CREATE TABLE `oauth_client_details`  (
  `client_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `resource_ids` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `client_secret` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `scope` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `authorized_grant_types` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `web_server_redirect_uri` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `authorities` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `access_token_validity` int(11) NULL DEFAULT NULL,
  `refresh_token_validity` int(11) NULL DEFAULT NULL,
  `additional_information` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL,
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `archived` tinyint(1) NULL DEFAULT 0,
  `trusted` tinyint(1) NULL DEFAULT 0,
  `autoapprove` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'false',
  PRIMARY KEY (`client_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of oauth_client_details
-- ----------------------------
INSERT INTO `oauth_client_details` VALUES ('p1', 'resource', '$2a$10$Ba8rgIubf3uPa04/sJ6oyuOA02mRSjaOhC5QSekXsBQOrDMa9clty', 'ALL', 'authorization_code,password,client_credentials,implicit,refresh_token', 'http://www.baidu.com', 'ALL', NULL, NULL, NULL, '2020-06-19 17:19:58', 0, 0, 'false');

-- ----------------------------
-- Table structure for oauth_code
-- ----------------------------
DROP TABLE IF EXISTS `oauth_code`;
CREATE TABLE `oauth_code`  (
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `authentication` blob NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for party_building
-- ----------------------------
DROP TABLE IF EXISTS `party_building`;
CREATE TABLE `party_building`  (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `context` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '内容',
  `image` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `classification` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类',
  `create_id` int(1) NULL DEFAULT NULL COMMENT '创建人id',
  `create_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人用户名',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modify_id` int(1) NULL DEFAULT NULL COMMENT '修改人id',
  `modify_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人用户名',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `states` int(1) NULL DEFAULT NULL COMMENT '状态（1=正常，2=删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限名',
  `description` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限描述',
  `identification` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限标识',
  `url` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限url',
  `sort` int(1) NULL DEFAULT NULL COMMENT '排序',
  `parent_id` int(1) NULL DEFAULT NULL COMMENT '父菜单id',
  `states` int(1) NULL DEFAULT NULL COMMENT '状态（1=正常，2=删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 52 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES (1, '用户管理', NULL, '/', NULL, 1, 0, 1);
INSERT INTO `permission` VALUES (2, '管理员', NULL, '/', NULL, 2, 1, 1);
INSERT INTO `permission` VALUES (3, '普通用户', NULL, '/', NULL, 3, 1, 1);
INSERT INTO `permission` VALUES (4, '栏目管理', NULL, '/', NULL, 4, 0, 1);
INSERT INTO `permission` VALUES (5, '学院概括', NULL, '/', NULL, 5, 4, 1);
INSERT INTO `permission` VALUES (6, '学院简介', NULL, '/', NULL, 6, 5, 1);
INSERT INTO `permission` VALUES (7, '学院荣誉', NULL, '/', NULL, 7, 5, 1);
INSERT INTO `permission` VALUES (8, '组织机构', NULL, '/', NULL, 8, 5, 1);
INSERT INTO `permission` VALUES (9, '师资队伍', NULL, '/', NULL, 9, 5, 1);
INSERT INTO `permission` VALUES (10, '专业介绍', NULL, '/', NULL, 10, 5, 1);
INSERT INTO `permission` VALUES (11, '教学科研', NULL, '/', NULL, 11, 4, 1);
INSERT INTO `permission` VALUES (12, '教学工作', NULL, '/', NULL, 12, 11, 1);
INSERT INTO `permission` VALUES (13, '科研工作', NULL, '/', NULL, 13, 11, 1);
INSERT INTO `permission` VALUES (14, '学院生活', NULL, '/', NULL, 14, 4, 1);
INSERT INTO `permission` VALUES (15, '学院活动', NULL, '/', NULL, 15, 14, 1);
INSERT INTO `permission` VALUES (16, '团学天地', NULL, '/', NULL, 16, 14, 1);
INSERT INTO `permission` VALUES (17, '日常管理', NULL, '/', NULL, 17, 14, 1);
INSERT INTO `permission` VALUES (18, '考勤公采', NULL, '/', NULL, 18, 14, 1);
INSERT INTO `permission` VALUES (19, '党建工作', NULL, '/', NULL, 19, 4, 1);
INSERT INTO `permission` VALUES (20, '支部建设', NULL, '/', NULL, 20, 19, 1);
INSERT INTO `permission` VALUES (21, '党员风采', NULL, '/', NULL, 21, 19, 1);
INSERT INTO `permission` VALUES (22, '理论学习', NULL, '/', NULL, 22, 19, 1);
INSERT INTO `permission` VALUES (23, '招生工作', NULL, '/', NULL, 23, 4, 1);
INSERT INTO `permission` VALUES (24, '招生工作', NULL, '/', NULL, 24, 23, 1);
INSERT INTO `permission` VALUES (25, '就业工作', NULL, '/', NULL, 25, 23, 1);
INSERT INTO `permission` VALUES (26, '下载中心', NULL, '/', NULL, 26, 4, 1);
INSERT INTO `permission` VALUES (27, '教务管理类', NULL, '/', NULL, 27, 26, 1);
INSERT INTO `permission` VALUES (28, '学生管理类', NULL, '/', NULL, 28, 26, 1);
INSERT INTO `permission` VALUES (29, '就业管理类', NULL, '/', NULL, 29, 26, 1);
INSERT INTO `permission` VALUES (30, '新闻栏', NULL, '/', NULL, 30, 4, 1);
INSERT INTO `permission` VALUES (31, '通知栏', NULL, '/', NULL, 31, 4, 1);
INSERT INTO `permission` VALUES (32, '专题管理', NULL, '/', NULL, 32, 0, 1);
INSERT INTO `permission` VALUES (33, '网站管理', NULL, '/', NULL, 33, 0, 1);
INSERT INTO `permission` VALUES (34, '网站介绍', NULL, '/', NULL, 34, 33, 1);
INSERT INTO `permission` VALUES (35, '网站标题', NULL, '/', NULL, 35, 33, 1);
INSERT INTO `permission` VALUES (36, '关键字', NULL, '/', NULL, 36, 33, 1);
INSERT INTO `permission` VALUES (37, '网站URL管理', NULL, '/', NULL, 37, 33, 1);
INSERT INTO `permission` VALUES (38, '页面logo', NULL, '/', NULL, 38, 33, 1);
INSERT INTO `permission` VALUES (39, '文章管理', NULL, '/', NULL, 39, 0, 1);
INSERT INTO `permission` VALUES (40, '常用链接管理', NULL, '/', NULL, 40, 0, 1);
INSERT INTO `permission` VALUES (41, '权限管理', NULL, '/', NULL, 41, 0, 1);
INSERT INTO `permission` VALUES (42, '角色管理', NULL, '/', NULL, 42, 41, 1);
INSERT INTO `permission` VALUES (43, '菜单管理', NULL, '/', NULL, 43, 41, 1);
INSERT INTO `permission` VALUES (44, 'root', 'root管理权限', 'p1', NULL, 44, 0, 1);
INSERT INTO `permission` VALUES (45, 'admin', 'admin管理权限', 'p2', NULL, 45, 0, 1);
INSERT INTO `permission` VALUES (46, 'ArtificialIntelligence', '人工智能管理权限', 'p3', NULL, 46, 0, 1);
INSERT INTO `permission` VALUES (47, 'Software', '软件管理权限', 'p4', NULL, 47, 0, 1);
INSERT INTO `permission` VALUES (48, 'DigitalMedia', '数字媒体管理权限', 'p5', NULL, 48, 0, 1);
INSERT INTO `permission` VALUES (49, 'MobileApp', '移动应用管理权限', 'p6', NULL, 49, 0, 1);
INSERT INTO `permission` VALUES (50, 'BigData', '大数据管理权限', 'p7', NULL, 50, 0, 1);
INSERT INTO `permission` VALUES (51, 'InformationSafety', '信息安全管理权限', 'p8', NULL, 51, 0, 1);

-- ----------------------------
-- Table structure for recruit_students
-- ----------------------------
DROP TABLE IF EXISTS `recruit_students`;
CREATE TABLE `recruit_students`  (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `context` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '内容',
  `image` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `classification` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类',
  `create_id` int(1) NULL DEFAULT NULL COMMENT '创建人id',
  `create_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人用户名',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modify_id` int(1) NULL DEFAULT NULL COMMENT '修改人id',
  `modify_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人用户名',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `states` int(1) NULL DEFAULT NULL COMMENT '状态（1=正常，2=删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名',
  `description` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色描述',
  `sort` int(1) NULL DEFAULT NULL COMMENT '排序',
  `states` int(1) NULL DEFAULT NULL COMMENT '状态（1=正常，2=删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, 'root', '超级管理员', 1, 1);
INSERT INTO `role` VALUES (2, 'admin', '管理员', 2, 1);
INSERT INTO `role` VALUES (3, 'ArtificialIntelligence', '人工智能技术服务专业负责人', 3, 1);
INSERT INTO `role` VALUES (4, 'Software', '软件技术专业负责人', 3, 1);
INSERT INTO `role` VALUES (5, 'DigitalMedia', '数字媒体艺术专业负责人', 3, 1);
INSERT INTO `role` VALUES (6, 'MobileApp', '移动应用开发专业负责人', 3, 1);
INSERT INTO `role` VALUES (7, 'BigData', '大数据技术与应用专业负责人', 3, 1);
INSERT INTO `role` VALUES (8, 'InformationSafety', '信息安全与管理专业负责人', 3, 1);

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission`  (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `role_id` int(1) NULL DEFAULT NULL COMMENT '角色id',
  `role_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名',
  `permission_id` int(1) NULL DEFAULT NULL COMMENT '权限id',
  `permission_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES (1, 1, 'root', 44, 'root管理权限');
INSERT INTO `role_permission` VALUES (2, 1, 'root', 45, 'admin管理权限');
INSERT INTO `role_permission` VALUES (3, 1, 'root', 46, '人工智能管理权限');
INSERT INTO `role_permission` VALUES (4, 1, 'root', 47, '软件管理权限');
INSERT INTO `role_permission` VALUES (5, 1, 'root', 48, '数字媒体管理权限');
INSERT INTO `role_permission` VALUES (6, 1, 'root', 49, '移动应用管理权限');
INSERT INTO `role_permission` VALUES (7, 1, 'root', 50, '大数据管理权限');
INSERT INTO `role_permission` VALUES (8, 1, 'root', 51, '信息安全管理权限');
INSERT INTO `role_permission` VALUES (9, 2, 'admin', 45, 'admin管理权限');
INSERT INTO `role_permission` VALUES (10, 2, 'admin', 46, '人工智能管理权限');
INSERT INTO `role_permission` VALUES (11, 2, 'admin', 47, '软件管理权限');
INSERT INTO `role_permission` VALUES (12, 2, 'admin', 48, '数字媒体管理权限');
INSERT INTO `role_permission` VALUES (13, 2, 'admin', 49, '移动应用管理权限');
INSERT INTO `role_permission` VALUES (14, 2, 'admin', 50, '大数据管理权限');
INSERT INTO `role_permission` VALUES (15, 2, 'admin', 51, '信息安全管理权限');
INSERT INTO `role_permission` VALUES (16, 3, 'ArtificialIntelligence', 46, '人工智能管理权限');
INSERT INTO `role_permission` VALUES (17, 4, 'Software', 47, '软件管理权限');
INSERT INTO `role_permission` VALUES (18, 5, 'DigitalMedia', 48, '数字媒体管理权限');
INSERT INTO `role_permission` VALUES (19, 6, 'MobileApp', 49, '移动应用管理权限');
INSERT INTO `role_permission` VALUES (20, 7, 'BigData', 50, '大数据管理权限');
INSERT INTO `role_permission` VALUES (21, 8, 'InformationSafety', 51, '信息安全管理权限');

-- ----------------------------
-- Table structure for special
-- ----------------------------
DROP TABLE IF EXISTS `special`;
CREATE TABLE `special`  (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `context` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '内容',
  `image` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `classification` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类',
  `create_id` int(1) NULL DEFAULT NULL COMMENT '创建人id',
  `create_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人用户名',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modify_id` int(1) NULL DEFAULT NULL COMMENT '修改人id',
  `modify_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人用户名',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `states` int(1) NULL DEFAULT NULL COMMENT '状态（1=正常，2=删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for teaching
-- ----------------------------
DROP TABLE IF EXISTS `teaching`;
CREATE TABLE `teaching`  (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `context` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '内容',
  `image` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `classification` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类',
  `create_id` int(1) NULL DEFAULT NULL COMMENT '创建人id',
  `create_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人用户名',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modify_id` int(1) NULL DEFAULT NULL COMMENT '修改人id',
  `modify_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人用户名',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `states` int(1) NULL DEFAULT NULL COMMENT '状态（1=正常，2=删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `gender` int(1) NULL DEFAULT NULL COMMENT '性别（1=男，2=女）',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电话',
  `email` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱',
  `create_time` date NULL DEFAULT NULL COMMENT '创建时间',
  `role_id` int(1) NULL DEFAULT NULL COMMENT '角色id',
  `role_name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名',
  `role_description` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色描述',
  `states` int(1) NULL DEFAULT NULL COMMENT '状态（1=正常，2=删除）',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'root', '$2a$10$Ta1JiQZEsjOPYp2gGONene.DIVlB/EAwO5U2RpN6XeTLjPk8BGQIG', 1, '******', '******', '2020-06-20', 1, 'root', '超级管理员', 1);
INSERT INTO `user` VALUES (2, 'admin', '$2a$10$Exta40Dn/mu5poxkVMLpn.Bc1zFfc3x4I1zqnBhz3E0GFwKU3Msbe', 1, '******', '******', '2020-06-20', 2, 'admin', '管理员', 1);
INSERT INTO `user` VALUES (3, 'ArtificialIntelligence', '$2a$10$hCZM/Cy1eqk5v.WRy9VvG.Fu4k0w6nuhHf5W.XPS71dwvzU9FcVsq', 1, '******', '******', '2020-06-20', 3, 'ArtificialIntelligence', '人工智能技术服务专业负责人', 1);
INSERT INTO `user` VALUES (4, 'Software', '$2a$10$ioZLuDn29rYWE1xku1/XRuVQWSA.mEklWmYEdDEcVgENjwXCjmlzS', 1, '******', '******', '2020-06-20', 4, 'Software', '软件技术专业负责人', 1);
INSERT INTO `user` VALUES (5, 'DigitalMedia', '$2a$10$S/O01uQHddTsJc1JrKLHouTT9sxsAbYVaeu2npQf6ufZ6XZj/K9Om', 1, '******', '******', '2020-06-20', 5, 'DigitalMedia', '数字媒体艺术专业负责人', 1);
INSERT INTO `user` VALUES (6, 'MobileApp', '$2a$10$kX8zaZt1DS7s0gyyQm/L5.Jn5KNeft3Z6Y60gAqbWgHg6.HteEfU6', 1, '******', '******', '2020-06-20', 6, 'MobileApp', '移动应用开发专业负责人', 1);
INSERT INTO `user` VALUES (7, 'BigData', '$2a$10$I7ULr75QZbMeKfkeGabjJeVVm.3FHayeSKUvx4XdER2LGvsbBlhee', 1, '******', '******', '2020-06-20', 7, 'BigData', '大数据技术与应用专业负责人', 1);
INSERT INTO `user` VALUES (8, 'InformationSafety', '$2a$10$42jzu4OOAH62NFv26f95Vehsds8vCdZNdkn4lRjujS.jIVdoaoVf.', 1, '******', '******', '2020-06-20', 8, 'InformationSafety', '信息安全与管理专业负责人', 1);

-- ----------------------------
-- Table structure for website
-- ----------------------------
DROP TABLE IF EXISTS `website`;
CREATE TABLE `website`  (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `context` text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '内容',
  `image` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片',
  `classification` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '分类',
  `create_id` int(1) NULL DEFAULT NULL COMMENT '创建人id',
  `create_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人用户名',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `modify_id` int(1) NULL DEFAULT NULL COMMENT '修改人id',
  `modify_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '修改人用户名',
  `modify_time` datetime(0) NULL DEFAULT NULL COMMENT '修改时间',
  `states` int(1) NULL DEFAULT NULL COMMENT '状态（1=正常，2=删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
