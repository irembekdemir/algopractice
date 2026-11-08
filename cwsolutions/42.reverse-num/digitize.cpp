std::vector<int> digitize(unsigned long n) 
{        
  if (n==0) return {0};
  
  std::vector<int> myList;
  
  while (n>0){
    myList.push_back(n%10);
    n/=10;
  }
  return myList;

}