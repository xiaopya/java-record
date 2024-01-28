-- (页码-1) * 每页的数量
-- 分页查询
select * from tb_emp limit 0,10;
-- 查询第一页的数据，可以简写
select * from tb_emp limit 10;

select * from  tb_emp limit 10,10;

select * from  tb_emp limit 20,10;
