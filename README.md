# RansomNote

QUESTION:
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters 
from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

Example 1:
Input: ransomNote = "a", magazine = "b"
Output: false

Example 2:
Input: ransomNote = "aa", magazine = "ab"
Output: false

Example 3:
Input: ransomNote = "aa", magazine = "aab"
Output: true
 

Constraints:
1 <= ransomNote.length, magazine.length <= 10^5
ransomNote and magazine consist of lowercase English letters.


ACTUAL EXPLANATION:

So, What we doing here is... First we will initialize an array of alphabets counter.
Let's initialize with the size 24. noo... Its 26, you forgot the number of alphabets in English?
Jokes Apart..

Now we loop through the entire String of magazine where char c stores the char at the index of magazine..

You might think why I typed c-'a'
It is because in ascii if you subtract any char with 'a' , it gives you index of that alphabet.
Still confused?
Let us assume a = 0 and z = 25. Now subtract a - a. You got 0 in ASCII, right?
now subtract d-a, in ASCII it is 100-97, it leaves you with 3. Isn't that the index of that character in our alphabet counter and isn't that the fact the a=0, b=1, c=2 and d=3. Got it?

Now we increment the counter for that character of its own index according to English Alphabets (Obviously)

We have our counter ready!

Now we run another for loop for ransomNote.
Remember: if the charachter doesn't exists in magazine for ransomNote, we return false;
or if it does exists, we decrement the counter of that charachter from its own index.

lastly if nothing goes wrong (we have sufficient amount of charachters to make ransomNote)

Return true :)
