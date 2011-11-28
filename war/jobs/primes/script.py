from args import *

def isprime(n):
    '''check if integer n is a prime'''
    # range starts with 2 and only needs to go up the squareroot of n
    for x in range(2, int(n**0.5)+1):
        if n % x == 0:
            return False
    return True

outputFile = open('output', 'w')

for i in range(arg0, arg1):
    if (isprime(i)):
        outputFile.write(str(i))
        outputFile.write('\n')

outputFile.close()