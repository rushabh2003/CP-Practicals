#include <iostream>
#include <string>
using namespace std;

string reversePrefix(string word, char ch) {
    int idx = word.find(ch);
    if (idx != string::npos) {
        reverse(word.begin(), word.begin() + idx + 1);
    }
    return word;
}

int main() {
    string word, ch;
    cout << "Enter word: ";
    cin >> word;
    cout << "Enter character: ";
    cin >> ch;

    string result = reversePrefix(word, ch[0]);
    cout << "Result: " << result << endl;

    return 0;
}
