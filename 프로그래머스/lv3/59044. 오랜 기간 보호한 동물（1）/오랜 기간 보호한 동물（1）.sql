SELECT a.NAME, a.DATETIME
FROM ANIMAL_INS AS a
LEFT JOIN ANIMAL_OUTS AS b
# 가장 오래된 동물 3마리
ON a.ANIMAL_ID = b.ANIMAL_ID
WHERE b.DATETIME IS NULL
ORDER BY a.DATETIME
LIMIT 3