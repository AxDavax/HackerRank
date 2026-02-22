-- ============================================
-- Problem: Weather Observation Station 7
-- Platform: HackerRank
-- Subdomain: Basic Select
-- Database: MS SQL Server
-- ============================================

SELECT
    DISTINCT CITY
FROM
    STATION
WHERE
    CITY LIKE '%a' OR CITY LIKE '%e' OR CITY LIKE '%i' OR
    CITY LIKE '%o' OR CITY LIKE '%u';  