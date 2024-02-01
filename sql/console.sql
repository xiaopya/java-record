select id, username, password, name, gender, image, job, entry_time, create_time, update_time from tb_emp where id = 1;
delete from tb_emp where id in(1,2,3);

select id, username, password, name, gender, image, job, entry_time, create_time, update_time from tb_emp where name like '%张%' and entry_time = '2022-01-01';