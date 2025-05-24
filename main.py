import random
import string


def generate_random_string(length):
    alphabet = string.ascii_letters
    return ''.join(random.choice(alphabet) for i in range(length))


text = input("Enter the text: ")
words = text.split(" ")

Coding = input("Enter 1 for coding and 0 for decoding: ")

Coding = True if (Coding=="1") else False
if(Coding):
    nword = []
    for word in words:
        if len(word)>=3:
            newword = generate_random_string(3) + word[1:] + word[0] + generate_random_string(3)
            nword.append(newword)
        else:
            nword.append(word[::-1])
    print(" ".join(nword))

else:
    nword = []
    for word in words:
        if (len(word)>=3):
            newword = word[3:-3]
            newword = newword[-1] + newword[:-1]
            nword.append(newword)
        else:
            nword.append(word[::-1])

    print(" ".join(nword))
