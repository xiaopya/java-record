-- 分组查询
-- 根据性别分组，统计男和女员工的数量
select gender,count(*) from tb_emp where gender group by gender;

-- 查询入职时间是在xxx以前的员工，并对结果根据职位分组，获取员工数量大于等于3的职位
-- where 和 having的区别：
-- 1.执行时机不同：where是分组之前进行过滤，不满足where条件，不参与分组，而having是分组之后对结果进行过滤
-- 2.判断条件不同：where不能对聚合函数进行判断，而having可以
select job,count(*) from tb_emp where entrydate <= '2022-02-18' group by job having count(*) > 3;