# Chef and Icecream | Problem Code: CHFICRM
# Chef owns an icecream shop in Chefland named scoORZ. There are only three types of coins in Chefland: Rs. 5, Rs. 10 and Rs. 15. An icecream costs Rs. 5.

# There are N people (numbered 1 through N) standing in a queue to buy icecream from scoORZ. Each person wants to buy exactly one icecream. For each valid i, the i-th person has one coin with value ai. It is only possible for someone to buy an icecream when Chef can give them back their change exactly ― for example, if someone pays with a Rs. 10 coin, Chef needs to have a Rs. 5 coin that he gives to this person as change.

# Initially, Chef has no money. He wants to know if he can sell icecream to everyone in the queue, in the given order. Since he is busy eating his own icecream, can you tell him if he can serve all these people?

# Input
# The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
# The first line of each test case contains a single integer N.
# The second line contains N space-separated integers a1,a2,…,aN.
# Output
# For each test case, print a single line containing the string "YES" if all people can be served or "NO" otherwise (without quotes).

# Constraints
# 1≤T≤100
# 1≤N≤103
# ai∈{5,10,15} for each valid i

# Example Input
# 3
# 2
# 5 10
# 2
# 10 5
# 2
# 5 15
# Example Output
# YES
# NO
# NO

# Solution :
T = int(input())
while T != 0 :
    N = int(input())
    coins = list(map(int,input().split()))
    change = {5 : 0 , 10 : 0 , 15 : 0} 
    canServe = True
    for value in coins:
        toGive = value - 5
        if value == 5:
            change[5]+=1
        elif int(toGive/10) <= change[10] and int(toGive/10) is not 0:
            change[10]-=int(toGive/10)
            change[value]+=1
        elif toGive/5 <= change[5]:
            change[5]-=int(toGive/5)
            change[value]+=1
        else:
            canServe=False
            print("NO")
            break;
        
        
    if canServe : print("YES")
    T-=1