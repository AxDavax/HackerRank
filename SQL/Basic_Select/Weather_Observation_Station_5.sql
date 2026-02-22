-- ============================================
-- Problem: Weather Observation Station 5
-- Platform: HackerRank
-- Subdomain: Basic Select
-- Database: MS SQL Server
-- ============================================

SELECT TOP 1
    CITY, LEN(CITY)
FROM
    STATION
ORDER BY
    LEN(CITY), CITY;

SELECT TOP 1
    CITY, LEN(CITY)
FROM
    STATION
ORDER BY
    LEN(CITY) DESC, CITY;