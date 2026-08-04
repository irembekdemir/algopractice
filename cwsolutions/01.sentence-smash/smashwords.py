def smash(*words):

    if len(words) == 0:
        return ""
    
    result = words[0]
    
    for i in range(1, len(words)):
        result = result + " " + words[i]
        
    return result