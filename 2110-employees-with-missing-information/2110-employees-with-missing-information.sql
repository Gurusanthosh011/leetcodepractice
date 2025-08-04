# Write your MySQL query statement below
SELECT DISTINCT employee_id
FROM (
    SELECT employee_id  FROM Salaries
    WHERE employee_id NOT IN (SELECT employee_id FROM Employees)
    
    UNION
    
    SELECT employee_id FROM Employees
    WHERE employee_id NOT IN (SELECT employee_id FROM Salaries)
) AS emp
ORDER BY employee_id ASC;