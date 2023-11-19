SELECT
    EXTRACT(YEAR FROM o.SALES_DATE) AS YEAR,
    EXTRACT(MONTH FROM o.SALES_DATE) AS MONTH,
    u.GENDER,
    COUNT(DISTINCT o.USER_ID) AS USERS
FROM
    ONLINE_SALE o
JOIN
    USER_INFO u ON o.USER_ID = u.USER_ID
WHERE
    u.GENDER IS NOT NULL
GROUP BY
    YEAR, MONTH, u.GENDER
ORDER BY
    YEAR, MONTH, u.GENDER;
