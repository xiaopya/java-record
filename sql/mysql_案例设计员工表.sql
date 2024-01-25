create table tb_emp
(
    id          int primary key auto_increment comment '主键id',
    username    varchar(20)                  not null comment '用户名',
    password    varchar(32) default '123456' null comment '密码',
    name        varchar(10)                  not null comment '姓名',
    gender      tinyint unsigned             not null comment '性别: 1 男，0 女',
    image       varchar(300)                 null comment '图像url',
    job         tinyint unsigned             null comment '职位：1 班主任，2 讲师，3 学工主管，4 校验主管',
    entrydate   date                         null comment '入职日期',
    create_time datetime                     not null comment '创建时间',
    update_time datetime                     not null comment '修改时间',
    constraint username
        unique (username)
)
    comment '员工表';

