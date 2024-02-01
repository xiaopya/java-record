select id,
       username,
       password,
       name,
       gender,
       image,
       job,
       entry_time,
       create_time,
       update_time
from tb_emp
where id = 1;
delete
from tb_emp
where id in (1, 2, 3);

select id,
       username,
       password,
       name,
       gender,
       image,
       job,
       entry_time,
       create_time,
       update_time
from tb_emp
where name like '%张%'
  and entry_time = '2022-01-01';

create database tlias;

# 学工部 教研部 咨询部 就业部 人事部
create table dept
(
    id          int unsigned primary key auto_increment comment '主键ID',
    name        varchar(10) not null unique comment '部门名称',
    create_time datetime    not null comment '创建时间',
    update_time datetime    not null comment '更新时间'
) comment '部门表';
insert into dept(id, name, create_time, update_time)
values (1, '学工部', now(), now()),
       (2, '教研部', now(), now()),
       (3, '咨询部', now(), now()),
       (4, '就业部', now(), now()),
       (5, '人事部', now(), now());


create table emp
(
    id          int unsigned primary key auto_increment comment '主键ID',
    username    varchar(32)  not null unique comment '用户名',
    password    varchar(32) default '123456' comment '密码',
    name        varchar(32)  not null comment '姓名',
    gender      int unsigned not null comment '性别: 1男 2女',
    image       varchar(300) comment '图像',
    job         int unsigned comment '职位：1班主任，2讲师，3学工主管，4教研主管，5咨询师',
    entry_date  date comment '入职时间',
    dept_id     int unsigned comment '部门id',
    create_time datetime     not null comment '创建时间',
    update_time datetime     not null comment '更新时间'
) comment '员工表';
insert into emp(id, username, password, name, gender, image, job, entry_date, dept_id, create_time, update_time)
values (1, 'chenjiabao', '123456', '陈佳宝', 1, '1.jpg', '4', '1998-01-01', 4, '2024-02-01', '2024-02-01'),
       (2, 'dingyifan', '123456', '丁一凡', 1, '2.jpg', '3', '2000-01-01', 4, '2024-02-01', '2024-02-01'),
       (3, 'chenyonglong', '123456', '陈永龙', 1, '1.jpg', '4', '1999-01-01', 4, '2024-02-01', '2024-02-01'),
       (4, 'dilireba', '123456', '迪丽热巴', 2, '14.jpg', '4', '1999-01-01', 4, '2024-02-01', '2024-02-01'),
       (5, 'damimi', '123456', '大幂幂', 2, '4.jpg', '4', '1999-01-01', 4, '2024-02-01', '2024-02-01');