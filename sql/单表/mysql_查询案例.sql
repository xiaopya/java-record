-- 案例1：
-- 1.查询员工
    -- 1.1根据输入的员工姓名、员工性别、入职时间搜索满足条件的员工信息
    -- 1.2其中员工姓名，支持模糊匹配：性别进行精确查询；入职时间进行范围查询。
    -- 1.3支持分页查询。
    -- 1.4并对查询的结果，根据最后修改时间进行倒序排序。
select *
from tb_emp
where name like '%张%'
  and gender = 1
  and entrydate between '2022-02-01' and '2022-02-19'
order by update_time DESC
limit 0,10;

-- 案例2：
-- 完成员工性别统计
select if(gender = 1,'男','女') '性别',count(*) from tb_emp group by gender;

-- 完成对职位信息的统计
-- -职位: 1班主任，2讲师，3学工主管，4教研主管
select (case job
            when 1 then '班主任'
            when 2 then '讲师'
            when 3 then '学工主管'
            when 4 then '教研主管'
            else '未入职' end) '职位',
       count(*)
from tb_emp
group by job;