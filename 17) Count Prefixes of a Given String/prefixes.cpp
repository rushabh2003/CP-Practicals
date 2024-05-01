#include <bits/stdc++.h>
using namespace std;

int countPrefixes(vector<string>& words, string s) {
    int count = 0;
    for (const string& word : words) {
        if (s.find(word) == 0) {
            count++;
        }
    }
    return count;
}

int main() {
    string input;
    cout << "Enter words: ";
    getline(cin, input);
    istringstream ss(input);
    string word;
    vector<string> words;
    while (ss >> word) {
        words.push_back(word);
    }
    string s;
    cout << "Enter s: ";
    cin >> s;
    
    int result = countPrefixes(words, s);
    cout << result << endl;
    
    return 0;
}
