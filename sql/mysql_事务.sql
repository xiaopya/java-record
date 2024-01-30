-- 事务
-- 开启(start transaction 或 begin)
start transaction;

delete from tb_emp where id=171;

delete from tb_emp where id=========172;

-- 提交：提交上面成功的命令
commit;

-- 回滚：一旦上面的sql语句有问题，导致有些数据被删除了，通过rollback进行回滚数据
rollback;