-- 这是单行注释

/*
这是多行注释
多行注释的第二行
*/

SELECT * FROM users; -- 这是带有单行注释的查询语句

-- 下面是一些示例代码

CREATE TABLE products (
  id INT PRIMARY KEY,
  name VARCHAR(255),
  price DECIMAL(10, 2)
);

-- 这是一个空行


INSERT INTO products (id, name, price)
VALUES (1, 'Product 1', 10.99);

-- 这是一个包含注释的 INSERT 语句
/* 注释行 */
INSERT INTO products (id, name, price)
VALUES (2, 'Product 2', 19.99); -- 注释在行尾

-- 这是最后一行