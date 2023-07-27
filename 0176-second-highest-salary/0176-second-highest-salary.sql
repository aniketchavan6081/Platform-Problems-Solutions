# Write your MySQL query statement below
# select max(salary)  as  SecondHighestSalary from Employee where salary < (select max(salary) from Employee);

select ifnull(max(salary),null) as secondhighestsalary
from employee
where salary < some(select max(salary) from employee)
