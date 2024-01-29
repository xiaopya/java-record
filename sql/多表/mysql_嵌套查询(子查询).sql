-- 嵌套查询
-- 行子查询
-- 查询和陈永龙的入职日期及职位都相同的员工信息
select entry_date,job from tb_emp where name = '陈永龙';
select name,entry_date,job from tb_emp where (entry_date,job)=(select entry_date,job from tb_emp where name = '陈永龙');

-- 表子查询
-- 查询在2024-04-12日期之后入职的员工及部门信息
select * from tb_emp where entry_date > '2024-04-12'; -- 下面将这个作为临时表，进行后续操作
select e.*,tb_dept.name from  (select * from tb_emp where entry_date > '2024-04-12') e,tb_dept where e.dept_id = tb_dept.id;
