def all_squared_pairs(n):
    a = 0
    b = int (n**0.5)
    answer = []
    while (a<=b):
        curr_sum = a**2 + b**2
        if curr_sum == n:
            answer.append([a,b]) 
            a+=1
            b-=1
        elif (curr_sum < n):
            a+=1
        else:
            b-=1
            
    return answer