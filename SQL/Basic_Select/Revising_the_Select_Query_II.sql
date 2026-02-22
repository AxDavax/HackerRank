-- ============================================
-- Problem: Revising the Select Query II
-- Platform: HackerRank
-- Subdomain: Basic Select
-- Database: MS SQL Server
-- ============================================

SELECT 
    NAME
FROM
    CITY
WHERE
    COUNTRYCODE = 'USA' 
    AND POPULATION > 120000;