#include <bits/stdc++.h>
using namespace std;

int maxProduct(vector<string>& words) {
    int maxProduct = 0;
    vector<int> wordBits(words.size(), 0);
    
    for (int i = 0; i < words.size(); i++) {
        for (char c : words[i]) {
            wordBits[i] |= 1 << (c - 'a');
        }
    }
    
    for (int i = 0; i < words.size(); i++) {
        for (int j = i + 1; j < words.size(); j++) {
            if ((wordBits[i] & wordBits[j]) == 0) {
                maxProduct = max(maxProduct, int(words[i].length() * words[j].length()));
            }
        }
    }
    
    return maxProduct;
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
    cout << maxProduct(words) << endl;
    return 0;
}
