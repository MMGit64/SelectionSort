import sys                          #Importing 'System specific parameter and functions'
numList = [4, 2, 20, 9, 5]

for i in range(len(numList)):

    minIndex = i
    for j in range(i+1, len(numList)):          #Consider the value following on from i value
        if numList[minIndex] > numList[j]:      #In this case, if i value in numList is larger than j value
            minIndex = j                        #We found the minimum value


    numList[i], numList[minIndex] =  numList[minIndex], numList[i]  #The j value is now swapped with the i value

for i in range(len(numList)):
    print("%d" %numList[i])                         #Prints in ascending order
