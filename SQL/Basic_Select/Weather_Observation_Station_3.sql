-- ============================================
-- Problem: Weather Observation Station 3
-- Platform: HackerRank
-- Subdomain: Basic Select
-- Database: MS SQL Server
-- ============================================

SELECT 
    DISTINCT CITY
FROM
    STATION
WHERE 
    ID % 2 = 0;