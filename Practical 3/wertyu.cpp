#include <iostream>
#include <map>
using namespace std;

int main()
{
    map<char, char> mp;
    
    mp['w'] = 'q';
    mp['e'] = 'w';
    mp['r'] = 'e';
    mp['t'] = 'r';
    mp['y'] = 't';
    mp['u'] = 'y';
    mp['i'] = 'u';
    mp['o'] = 'i';
    mp['p'] = 'o';
    mp['['] = 'p';
    mp['s'] = 'a';
    mp['d'] = 's';
    mp['f'] = 'd';
    mp['g'] = 'f';
    mp['h'] = 'g';
    mp['j'] = 'h';
    mp['k'] = 'j';
    mp['l'] = 'k';
    mp[';'] = 'l';
    mp['x'] = 'z';
    mp['c'] = 'x';
    mp['v'] = 'c';
    mp['b'] = 'v';
    mp['n'] = 'b';
    mp['m'] = 'n';
    mp[','] = 'm';
    mp[' '] = ' ';
    
    
    string inp;
    cout << "Enter str: ";
    getline(cin, inp);
    
    string ans = "";
    for(int i=0; i<inp.length(); i++) {
        ans += mp[inp[i]];
    }
    
    cout << "Ans: " << ans << endl;
    return 0;
}