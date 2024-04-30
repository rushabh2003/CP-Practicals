#include <iostream>
#include <stack>

using namespace std;

int main()
{

    string s;
    cout << "Enter s: ";
    cin >> s;

    stack<char> st;
    bool flag = true;

    for (int i = 0; i < s.length(); i++)
    {
        if (s[i] == '(' || s[i] == '[' || s[i] == '{')
        {
            st.push(s[i]);
        }
        else
        {
            if (s[i] == ')')
            {
                if (st.top() != '(')
                {
                    flag = false;
                    break;
                }
                else
                {
                    st.pop();
                }
            }

            else if (s[i] == '}')
            {
                if (st.top() != '{')
                {
                    flag = false;
                    break;
                }
                else
                {
                    st.pop();
                }
            }

            if (s[i] == ']')
            {
                if (st.top() != '[')
                {
                    flag = false;
                    break;
                }
                else
                {
                    st.pop();
                }
            }
        }
    }

    if (flag)
    {
        cout << "Valid string" << endl;
    }
    else
    {
        cout << "Not a Valid string" << endl;
    }

    return 0;
}