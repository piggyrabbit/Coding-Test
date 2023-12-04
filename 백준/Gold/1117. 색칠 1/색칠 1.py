def main():
    w, h, f, c, x1, y1, x2, y2 = map(int, input().split())
    make_x_len = w - f
    reverse_x = False
    if make_x_len < w // 2:
        make_x_len = w - make_x_len
        reverse_x = True
    split_y = c + 1
    total_ = w * h
    for x in range(x1, x2):
        if not reverse_x:
            if x < f:
                count = 2
            else:
                count = 1
        else:
            if x >= w - f:
                count = 1
            else:
                count = 2
        count *= split_y
        if (x >= x1) and (x < x2):
            
            total_ -= count * (y2 - y1)
    print(total_)

main()