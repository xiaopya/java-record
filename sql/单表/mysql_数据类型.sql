-- 数值类型：
-- tinyint 字节：1  有符号(SIGNED)范围：(-128,127) 无符号(UNSIGNED)范围：(0,255)
-- int
-- bigint
-- 用户的年龄就可以用无符号的tinyint类型，例子：
-- age tinyint unsigned

-- 字符串类型：
-- char：char(10) 最多只能存10个字符，不足10个字符也是占用10个字符空间（性能高，浪费空间）
-- varchar：varchar(10) 最多只能存10个字符,不足10个字符是按照长度存储（性能低，节省空间）
-- 手机号例子：
-- phone char(11)
-- username varchar(20)

-- 日期类型:
-- date: 格式 YYYY-MM-DD
-- datetime: 格式 YYYY-MM-DD HH:MM:SS
-- time (用的少)
-- year (用的少)
-- timestamp (用的少)
-- 用到的日期例子：
-- birthday date
-- update_time datetime