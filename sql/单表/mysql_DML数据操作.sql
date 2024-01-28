-- DML：表数据操作
-- 对指定表插入数据
-- 对tb_emp表指定字段，插入数据
insert into tb_emp(username,password,name,gender,create_time,update_time) values('xiaopy','999999','陈永龙',1,now(),now());
-- 对tb_emp表全部字段，插入数据
insert into tb_emp values(null,'cjh','1234567','程瑾慧',0,null,null,null,now(),now());
-- 插入多条数据
insert into tb_emp values(null,'cjh2','1234567','程瑾慧',0,null,null,null,now(),now()),(null,'cjh1','1234567','程瑾慧',0,null,null,null,now(),now());

-- 修改数据
update tb_emp set name='张三',update_time=now() where id=3;
-- 修改所有数据
update tb_emp set entrydate='2024-01-01',update_time=now();

-- 删除数据
-- 删除指定数据
delete from tb_emp where id=4;
-- 删除整张表的数据
delete from tb_emp


-- 插入50条不同的数据
-- 插入50条不同的数据
INSERT INTO tb_emp (username, password, name, gender, image, job, entrydate, create_time, update_time)
VALUES
('user111', 'password1', 'JohnD1oe1', 1, 'image_url1', 1, '2022-01-01', NOW(), NOW()),
('user2251', 'password2', 'Jane1Doe2', 2, 'image_url2', 2, '2022-01-02', NOW(), NOW()),
('user332', 'password3', 'BobSm1ith3', 1, 'image_url3', 3, '2022-01-03', NOW(), NOW()),
('user443', 'password4', 'AliceJo1hnson4', 2, 'image_url4', 4, '2022-01-04', NOW(), NOW()),
('user4745', 'password47', 'EvaMa1rtinez5', 1, 'image_url47', 1, '2022-02-17', NOW(), NOW()),
('user4866', 'password48', 'Henry1Taylor6', 2, 'image_url48', 2, '2022-02-18', NOW(), NOW()),
('user4977', 'password49', 'Olivia1Lewis7', 1, 'image_url49', 3, '2022-02-19', NOW(), NOW()),
('user5088', 'password50', 'SophiaM1iller8', 2, 'image_url50', 4, '2022-02-20', NOW(), NOW());

