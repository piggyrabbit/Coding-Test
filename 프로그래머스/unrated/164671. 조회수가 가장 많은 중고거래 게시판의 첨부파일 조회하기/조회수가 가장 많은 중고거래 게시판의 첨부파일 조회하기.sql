SELECT CONCAT('/home/grep/src/', a.BOARD_ID, '/', a.FILE_ID, a.FILE_NAME, a.FILE_EXT) AS FILE_PATH
FROM USED_GOODS_FILE AS a
JOIN USED_GOODS_BOARD AS b
ON a.BOARD_ID = b.BOARD_ID
AND b.VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD)
ORDER BY a.FILE_ID DESC
# 조회수 가장 높은 게시물
# BOARD_ID가 같아야 함