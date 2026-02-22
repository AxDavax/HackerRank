-- ============================================
-- Problem: Weather Observation Station 9
-- Platform: HackerRank
-- Subdomain: Basic Select
-- Database: MS SQL Server
-- ============================================

SELECT
    DISTINCT CITY
FROM
    STATION
WHERE 
    CITY NOT LIKE '[aeiou]%';