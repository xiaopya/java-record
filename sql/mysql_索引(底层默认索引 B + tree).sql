-- 索引
-- mysql数据库默认索引是：B+tree;
-- 提高查询效率
-- 创建索引：
create index idx_emp_name on tb_emp(name);

-- 查看索引：
show index from tb_emp;

-- 删除索引
drop index idx_emp_name on tb_emp;