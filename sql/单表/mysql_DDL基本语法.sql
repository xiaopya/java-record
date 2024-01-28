-- DDL 表结构创建
-- 基本语法
-- create table tb_user(
--     id int comment 'ID 唯一标识',
--     username varchar(20) comment '用户名',
--     name varchar(10) comment '姓名',
--     age int comment '年龄',
--     gender char(1) comment '性别'
-- )   comment '用户表';

-- 增加约束
-- primary key 主键是一行数据的唯一标识，非空且唯一
-- auto_increment 自动增长
-- not null 非空
-- unique 唯一
-- default 默认值
create table tb_user(
    id int primary key auto_increment comment 'ID 唯一标识',
    username varchar(20) not null unique comment '用户名',
    name varchar(10) not null comment '姓名',
    age int comment '年龄',
    gender char(1) default '男' comment '性别'
)   comment '用户表';