--Table: Person
--
--+-------------+---------+
--| Column Name | Type    |
--+-------------+---------+
--| personId    | int     |
--| lastName    | varchar |
--| firstName   | varchar |
--+-------------+---------+
--personId is the primary key column for this table.
--This table contains information about the ID of some persons and their first and last names.
--
--
--Table: Address
--
--+-------------+---------+
--| Column Name | Type    |
--+-------------+---------+
--| addressId   | int     |
--| personId    | int     |
--| city        | varchar |
--| state       | varchar |
--+-------------+---------+
--addressId is the primary key column for this table.
--Each row of this table contains information about the city and state of one person with ID = PersonId.

-- MySQL --> MySQL query
-- Oracle --> PL/SQL query
-- MS SQL Server --> T-SQL query
 select firstName, lastName, city, state from Person p left outer join Address a on p.personId  = a. personId;