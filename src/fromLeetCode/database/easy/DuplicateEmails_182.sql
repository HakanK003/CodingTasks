--Table: Person
--
--+-------------+---------+
--| Column Name | Type    |
--+-------------+---------+
--| id          | int     |
--| email       | varchar |
--+-------------+---------+
--id is the primary key column for this table.
--Each row of this table contains an email. The emails will not contain uppercase letters.

-- MySQL --> MySQL query
-- Oracle --> PL/SQL query
-- MS SQL Server --> T-SQL query
SELECT email from Person group by email having count(email)>=2;