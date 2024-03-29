--Table: Customers
--
--  +-------------+---------+
--  | Column Name | Type    |
--  +-------------+---------+
--  | id          | int     |
--  | name        | varchar |
--  +-------------+---------+
--  id is the primary key column for this table.
--  Each row of this table indicates the ID and name of a customer.
--
--
--  Table: Orders
--
--  +-------------+------+
--  | Column Name | Type |
--  +-------------+------+
--  | id          | int  |
--  | customerId  | int  |
--  +-------------+------+
--  id is the primary key column for this table.
--  customerId is a foreign key of the ID from the Customers table.
--  Each row of this table indicates the ID of an order and the ID of the customer who ordered it.

-- MySQL --> MySQL query
-- Oracle --> PL/SQL query
-- MS SQL Server --> T-SQL query
select name as Customers from Customers where id not in(select customerId  from Orders);


