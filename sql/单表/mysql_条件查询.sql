-- 条件查询
-- 查询指定数据
select * from tb_emp where username = 'user2';
-- 查询id小于180的数据
select * from tb_emp where id < 180;
-- 查询么有分配职位的员工信息
select * from tb_emp where job is null;
-- 查询有职位的员工信息
select * from tb_emp where job is not null;
-- 查询密码不等于 password1 的数据
select * from tb_emp where password != 'password1';
-- 查询入职日期某个范围之间的数据
select * from tb_emp where entrydate >= '2022-02-18' and entrydate <= '2022-02-20';
select * from tb_emp where entrydate between '2022-02-18' and '2022-02-20';
-- 查询入职日期某个范围之间的数据，且性别为女的
select * from tb_emp where entrydate between '2022-02-18' and '2022-02-20' and gender = 0;
-- 查询职位是 2,4的任何一个都可以
select * from tb_emp where job = 2 or job = 4;
select * from tb_emp where job in (2,4);
-- 查询员工姓名是2个字的
select * from tb_emp where name like '__';
-- 查询姓张的员工信息
select * from tb_emp where name like '张%';