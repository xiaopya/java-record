-- 多表查询
-- 1.内连接
select tb_emp.name, tb_dept.name
from tb_emp,
     tb_dept
where tb_dept.id = tb_emp.dept_id;
-- 起别名
select e.name, d.name
from tb_emp e,
     tb_dept d
where e.dept_id = d.id;
-- 第二种写法 inner可以省略
select e.name, d.name
from tb_emp e
         inner join tb_dept d on e.dept_id = d.id;
-- 2.外连接(左外链接)
select te.name, td.name
from tb_emp te
         left join tb_dept td on td.id = te.dept_id;
-- 右外链接
select te.name, td.name
from tb_emp te
         right join db03.tb_dept td on te.dept_id = td.id;

-- 准备数据：
create table tb_dept
(
    id          int unsigned primary key auto_increment comment '主键id',
    name        varchar(10) not null unique comment '部门名称',
    create_time datetime    not null comment '创建时间',
    update_time datetime    not null comment '更新时间'
) comment '部门表';
insert into tb_dept (id, name, create_time, update_time)
values (1, '学工部', now(), now()),
       (2, '教研部', now(), now()),
       (3, '咨询部', now(), now()),
       (4, '就业部', now(), now()),
       (5, '人事部', now(), now());

create table tb_emp
(
    id         int unsigned primary key auto_increment comment '主键id',
    username   varchar(20)      not null unique comment '用户名',
    password   varchar(32) default '123456' comment '密码',
    name       varchar(10)      not null comment '姓名',
    gender     tinyint unsigned not null comment '性别: 1男，2女',
    image      varchar(300) comment '图片',
    job        tinyint unsigned comment '职位：1班主任，2讲师，3学工主管，4教研主管，5咨询师',
    entry_date date comment '入职时间',
    dept_id int unsigned comment '部门id',
    create_time datetime    not null comment '创建时间',
    update_time datetime    not null comment '更新时间'
) comment '员工表';
insert into tb_emp (id, username, password, name, gender, image, job, entry_date,dept_id,create_time,update_time)
values (1, 'zhangSan', '123321', '张三', 1, '414.jpg', 1, '2024-07-01',1,now(),now()),
       (2, 'lisi', '123321', '李四', 1, '444.jpg', 1, '2024-06-01',3,now(),now()),
       (3, 'wangwu', '231414', '万物', 1, '153.jpg', 1, '2024-02-01',4,now(),now()),
       (4, 'cyl', '123221', '陈永龙', 1, '4.jpg', 1, '2024-01-01',2,now(),now()),
       (5, 'cjb', '16121', '陈家堡', 1, '45.jpg', 1, '2024-04-12',2,now(),now()),
       (6, 'lqf', '1321321', '楼清风', 1, '46.jpg', 1, '2024-01-01',3,now(),now()),
       (7, 'dingyifan', '2512421', '丁一凡', 1, '41.jpg', 1, '2024-02-24',4,now(),now()),
       (8, 'chendazhuang', '1226321', '陈大壮', 1, '43.jpg', 1, '2024-04-01',5,now(),now());
