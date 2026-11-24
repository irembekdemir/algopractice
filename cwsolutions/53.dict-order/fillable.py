def fillable(stock, merch, n):
    if merch in stock and n>=0:
        if stock[merch] >= n:
            return True
        else:
            return False
    else: 
        return False