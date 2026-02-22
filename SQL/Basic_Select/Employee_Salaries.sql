-- ============================================
-- Problem: Employee Salaries
-- Platform: HackerRank
-- Subdomain: Basic Select
-- Database: MS SQL Server
-- ============================================

SELECT
    name
FROM
    Employee
WHERE
    salary > 2000 AND months < 10
ORDER BY
    employee_id ASC;