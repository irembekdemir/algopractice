def is_triangle(a, b, c):
    if(abs(a-b)<c and (a+b)>c):
        return True
    return False
