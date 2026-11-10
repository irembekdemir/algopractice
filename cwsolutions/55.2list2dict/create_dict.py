def create_dict(keys, values):
    index_keys = len(keys)
    index_vals = len(values)
    md = {}
    
    max_index = max(index_keys,index_vals)
    
    if(index_keys<max_index): 
        for i in range(0,index_keys):
            md[keys[i]]=values[i]
        
    else:
        for i in range (0,index_vals):
            md[keys[i]]=values[i]
        for j in range(index_vals,max_index):
            md[keys[j]] = None
                        
    return md
            