def fakebinary (numberstr):
    char = list(numberstr)
    enum_ch = enumerate(char)

    for i, chr in enum_ch:
        if chr >= '5':
            char[i] = '0'
        else:
            char[i] = '1'

    return "".join(char) 