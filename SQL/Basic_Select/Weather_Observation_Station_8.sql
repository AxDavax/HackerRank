-- ============================================
-- Problem: Weather Observation Station 8
-- Platform: HackerRank
-- Subdomain: Basic Select
-- Database: MS SQL Server
-- ============================================

SELECT
    DISTINCT CITY
FROM
    STATION
WHERE 
    CITY LIKE '[aeiou]%' 
    AND CITY LIKE '%[aeiou]';