-- ============================================
-- Problem: Higher Than 75 Marks
-- Platform: HackerRank
-- Subdomain: Basic Select
-- Database: MS SQL Server
-- ============================================

SELECT 
    Name
FROM
    STUDENTS
WHERE 
    Marks > 75
ORDER BY 
    RIGHT(Name, 3) ASC, ID ASC;