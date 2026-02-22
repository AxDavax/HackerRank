-- ============================================
-- Problem: Weather Observation Station 11
-- Platform: HackerRank
-- Subdomain: Basic Select
-- Database: MS SQL Server
-- ============================================

SELECT
    DISTINCT CITY
FROM
    STATION
WHERE 
    CITY NOT LIKE '[aeiou]%' 
    AND CITY NOT LIKE '%[aeiou]';