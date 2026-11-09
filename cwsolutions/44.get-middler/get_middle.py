def get_middle(s):
    s_len = len(s)
    if (s_len%2==0):
        return s[int((s_len-1)/2)]+s[int((s_len+1)/2)] 
    else:
        return s[int(s_len/2)]