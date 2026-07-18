def find_square(n):
    sq = int (n**0.5) #float miight turn false down there
    if sq**2 == n:
        return (sq+1)**2
    else:
        return -1