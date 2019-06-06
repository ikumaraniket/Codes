#author 764034
#Problem Statement: Write a guessing game where the user has to guess a secret number. After every guess 
#the program tells the user whether their number was too large or too small. 
#At the end the number of tries needed should be printed
     #@Pseudo-Code
#Step 1: Enter the Number you think is the guessed number.
#Step 2: Try guessing number if you don't succeed.
#Step 3: Computer will prompt if the guessed number is higher or lower than your number.
 
import csv
file= open('C:\\Users\\764034\\Desktop\\sample_log.csv')
csv_file = csv.reader(file)
count = -1
for row in csv_file:

    count = count + 1

    if count > 0:
        a = row[0]

        row[0] = (a[-4:].rjust(len(a),'x'))
        print(row)
    else:
        print(row)
file.close()

           
