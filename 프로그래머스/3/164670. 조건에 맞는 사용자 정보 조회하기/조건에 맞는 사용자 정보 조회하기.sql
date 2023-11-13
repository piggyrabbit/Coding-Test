SELECT
    u.USER_ID,
    u.NICKNAME,
    CONCAT(u.CITY, ' ', u.STREET_ADDRESS1, ' ', IFNULL(u.STREET_ADDRESS2, '')) AS 전체주소,
    CONCAT(
        SUBSTRING(u.TLNO, 1, 3),
        '-',
        SUBSTRING(u.TLNO, 4, 4),
        '-',
        SUBSTRING(u.TLNO, 8)
    ) AS 전화번호
FROM
    USED_GOODS_USER u
WHERE
    u.USER_ID IN (
        SELECT
            b.WRITER_ID
        FROM
            USED_GOODS_BOARD b
        GROUP BY
            b.WRITER_ID
        HAVING
            COUNT(b.BOARD_ID) >= 3
    )
ORDER BY
    u.USER_ID DESC;
