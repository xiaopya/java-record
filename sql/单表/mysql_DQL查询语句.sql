-- DQL查询语句
-- 查询多个字段
select username,password,name from tb_emp;

-- 查询所有字段
select id, username, password, name, gender, image, job, entrydate, create_time, update_time from tb_emp; -- 推荐使用

select * from tb_emp; -- 不推荐

-- 设置别名 as可以省略
select name as '姓 名' ,password as '密 码' from tb_emp;

-- 去除重复记录 distinct
select distinct entrydate from tb_emp;