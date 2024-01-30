-- 索引
-- mysql数据库默认索引是：B+tree;
-- 提高查询效率
-- 创建索引：
create index idx_emp_name on tb_emp (name);

-- 查看索引：
show index from tb_emp;

-- 删除索引
drop index idx_emp_name on tb_emp;


create table user
(
    id     int primary key auto_increment comment '主键ID',
    name   varchar(10) comment '姓名',
    age    tinyint unsigned comment '年龄',
    gender tinyint unsigned default '1' comment '性别',
    phone  varchar(32) comment '手机号'
) comment 'mybatis入门学习表';

insert into user (id, name, age, gender, phone)
values (1, 'name1', 10, '1', '14566666'),
       (2, 'name2', 33, '2', '14524246'),
       (3, 'name3', 44, '2', '152365666'),
       (4, 'name4', 22, '1', '145235566'),
       (5, 'name5', 13, '1', '142352666'),
       (6, 'name6', 24, '2', '145626666'),
       (7, 'name7', 15, '1', '1452361696');