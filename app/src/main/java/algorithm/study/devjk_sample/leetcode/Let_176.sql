/**
 * 리트코드 - Second Highest Salary
 *
 * @link https://leetcode.com/problems/second-highest-salary
 */
select (select distinct salary from Employee order by salary desc limit 1 offset 1)
           as SecondHighestSalary;