/**
 * 리트코드 - Combine Two Tables
 *
 * @link https://leetcode.com/problems/combine-two-tables
 */
select firstName,
       lastName,
       city,
       state
from Person as a
         left join Address as b on a.personId = b.personId;