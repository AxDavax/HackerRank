-- ============================================
-- Problem: Weather Observation Station 4
-- Platform: HackerRank
-- Subdomain: Basic Select
-- Database: MS SQL Server
-- ============================================

SELECT 
    COUNT(CITY) - COUNT(DISTINCT CITY)
FROM
    STATION;