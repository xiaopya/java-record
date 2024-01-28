-- 排序查询

-- 根据入职时间进行升序排序 order by entrydate asc（asc可以省略）
select * from tb_emp  order by entrydate;
-- 降序
select * from tb_emp order by entrydate DESC;

-- 根据入职时间将员工进行升序排序，入职时间相同的，按照更新时间进行降序排序
select * from tb_emp order by entrydate,update_time DESC;