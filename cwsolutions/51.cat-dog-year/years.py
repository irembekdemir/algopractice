def years(human_years):
    cat_years = 0
    dog_years = 0
    if(human_years>=1):
        cat_years += 15
        dog_years += 15
        if(human_years>=2):
            cat_years += 9
            dog_years += 9
            if(human_years>=3):
                cat_years += 4*(human_years-2)
                dog_years += 5*(human_years-2)
                
    return [human_years,cat_years,dog_years]