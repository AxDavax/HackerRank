-- ============================================
-- Problem: Revising the Select Query I
-- Platform: HackerRank
-- Subdomain: Basic Select
-- Database: MS SQL Server
-- ============================================

SELECT *
FROM CITY
WHERE COUNTRYCODE = 'USA'
  AND POPULATION > 100000;