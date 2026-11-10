
def unused_digits(*numbers):
    digits = ""
    for n in numbers:
        digits += str(n)
        
    result = ""
    for i in "0123456789":
        if i not in digits:
            result += i
            
    return result