-- 分类表
create table category
(
    id          int unsigned auto_increment comment '主键ID'
        primary key,
    name        varchar(20)                  not null comment '分类名称',
    type        tinyint unsigned             null comment '类型: 1菜品分类，2套餐分类',
    sort        tinyint unsigned             not null comment '排序',
    status      tinyint unsigned default '0' not null comment '状态：1启用，0停用',
    create_time datetime                     not null comment '创建时间',
    update_time datetime                     not null comment '最后操作时间'
)
    comment '分类表
';

-- 菜品表
create table dish
(
    id          int unsigned auto_increment comment '主键ID'
        primary key,
    name        varchar(20)      not null comment '菜品名称',
    category_id tinyint unsigned null comment '分类id',
    price       decimal(8, 2)    null comment '价格: 8位数，保留俩位小数',
    image       varchar(300)     null comment '图片',
    description varchar(200)     null comment '菜品描述',
    create_time datetime         not null comment '创建时间',
    update_time datetime         not null comment '最后操作时间'
)
    comment '菜品表';

-- 套餐表
create table set_meal
(
    id          int unsigned auto_increment comment '主键ID'
        primary key,
    name        varchar(20)      not null comment '套餐名称',
    category_id tinyint unsigned not null comment '套餐分类',
    price       decimal(8, 2)    not null comment '价格',
    image       varchar(300)     not null comment '图片',
    description varchar(200)     null comment '描述信息'
)
    comment '套餐表';

-- 套餐分类关系表
create table set_meal_category
(
    id          int unsigned auto_increment comment '主键ID'
        primary key,
    category_id tinyint unsigned null comment '分类id',
    set_meal_id tinyint unsigned null comment '套餐ID',
    copies      tinyint unsigned null comment '份数'
)
    comment '套餐分类关系表';