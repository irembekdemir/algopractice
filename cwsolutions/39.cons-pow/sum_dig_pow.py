def sum_dig_pow(a, b): 
    result = []
    
    for i in range (a,b+1):
        num = str(i)
        sum = 0;
        for j,d in enumerate(num):
            
            sum += int(d)**(j+1)
        
        if sum == i:
            result.append(i)
            
    return result