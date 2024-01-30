-- 多表查询
-- 查询低于10yuan的菜品名称，价格和菜品的分类名称
select *
from dish d,
     category c
where d.category_id = c.id
  and d.price < 10;

-- 查询所有价格在10yuan(含)到50yuan(含)之间且状态为起售的菜品，展示菜品的名称（菜品没有分类，也要展示）
select *
from dish d
         left join category c on d.category_id = c.id
where d.price between 10 and 50
  and d.status = '1';

-- 查询每个分类下最贵的菜品，展示出分类的名称、最贵的菜品的价格
select c.name, max(d.price)
from dish d,
     category c
where d.category_id = c.id
group by c.name;

-- 查询各个分类下菜品状态为起售，并且该分类下菜品总数量大于等于3的分类名称
select c.name, count(*)
from category c,
     dish d
where c.id = d.category_id
  and d.status = '1'
group by c.name
having count(*) >= 3;

-- 查询出‘商务套餐A’中包含了那些菜品（展示：套餐名称，价格，菜品名称，价格，份数）
select sm.name, sm.price, d.name, d.price, smd.copies
from dish d,
     set_meal_dish smd,
     set_meal sm
where d.id = smd.dish_id
  and sm.id = smd.set_meal_id
  and sm.name = '商务套餐A';

-- 查询出低于菜品的平均价格的菜品信息（展示：菜品名称，价格）
select *
from dish
where price < (select avg(price) from dish);
