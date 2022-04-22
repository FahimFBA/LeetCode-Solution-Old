class Solution
{
public:
  bool isPalindrome(int x)
  {
    if (x < 0)
      return false;

    long long int reversedIntegerValue = 0, lastDigit, temporary_variable;
    temporary_variable = x;
    while (temporary_variable != 0)
    {
      lastDigit = temporary_variable % 10;
      reversedIntegerValue = reversedIntegerValue * 10 + lastDigit;
      temporary_variable = temporary_variable / 10;
    }

    if (reversedIntegerValue == x)
      return true;
    else
      return false;
  }
};