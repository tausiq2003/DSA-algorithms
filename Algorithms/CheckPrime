
/*
Question:
                Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".

                Input Format
                Constraints
                2 < N <= 1000000000

                Output Format
                Sample Input
                3
                Sample Output
                Prime
                Explanation
                The output is case specific

*/

#include <iostream>
using namespace std;

bool CheckPrime(int n)
{
    for (int k = 2; k < n; k++)
    {
        if (n % k == 0)
        {
            cout << "Not Prime";
            return false;
        }
    }
    cout << "Prime";
    return true;
}
int main()
{
    int n;
    cin >> n;

    CheckPrime(n);
    return 0;
}
