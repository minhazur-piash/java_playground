SELECT userId, MIN(timestamp) firstLogin, MAX(timestamp) lastLogin
FROM table
GROUP BY userId;

SELECT COUNT(*) loginsPerMonth
FROM table
WHERE timestamp >= '2017-01-01'
  AND timestamp <= '2017-12-01'
GROUP BY MONTH(timestamp);

SELECT userId, MONTH(timestamp)
FROM table
GROUP BY userId, MONTH(created)
HAVING COUNT(*) > 10;