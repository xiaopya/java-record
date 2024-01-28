-- 统计数量:count
-- count(常量) count(字段) count(*)推荐用的
select count(*) from tb_emp; -- 推荐使用
select count(id) from tb_emp;
select count('d') from tb_emp;
-- 统计最早入职的
select min(entrydate) from tb_emp;
-- 统计最迟入职的
select max(entrydate) from tb_emp;
-- 统计某个字段的平均值
select avg(id) from tb_emp;
-- 统计某个字段的和
select sum(id) from tb_emp;