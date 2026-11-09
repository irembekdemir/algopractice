def points(games):
    points = 0
    for elem in games:
        if (elem[0]>elem[2]):
            points += 3
        elif (elem[0]<elem[2]):
            points = points
        else:
            points+=1
    return points