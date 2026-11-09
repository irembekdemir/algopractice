def open_or_senior(data):
    result = []
    for elem in data:
        if(elem[0]>=55 and elem[1]>7):
            result.append('Senior')
        else:
            result.append('Open')
            
    return result
